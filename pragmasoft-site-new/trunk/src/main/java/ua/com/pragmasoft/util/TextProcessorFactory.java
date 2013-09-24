package ua.com.pragmasoft.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * TextProcessorFactory is used for conversion from wiki-like markup languages
 * (textile, mediawiki, markdown, etc) to html. Besides this it optimizes
 * usage a bit as it only requires initialization of processor once per thread
 * lifecycle. TextProcessor is thread bound, so it is safe to use it in concurrent
 * environment. Also this approach simplifies injection of {@link TextProcessor} 
 * instance into JDO entities.
 * 
 * @author zdv
 *
 */
public class TextProcessorFactory {
	
	static final Logger logger = LoggerFactory.getLogger(TextProcessorFactory.class);

	static ThreadLocal<TextProcessor> threadLocalProcessor = new ThreadLocal<TextProcessor>() {

		@Override
		protected TextProcessor initialValue() {
			return DEFAULT_TEXT_PROCESSOR;
		}
		
	};

	public static TextProcessor DEFAULT_TEXT_PROCESSOR = new TextileTextProcessorImpl();
	
	public static TextProcessor getMarkdownProcessor() {
		return threadLocalProcessor.get();
	}
	
	public static interface TextProcessor {
		public String textToHtml(final String text);

		public void textToHtml(final String text, Writer out, String styleSheetPath) throws IOException;
	}

	static class TextileTextProcessorImpl implements TextProcessor {
		
		MarkupParser parser;

		public TextileTextProcessorImpl() {
			parser = new MarkupParser(new TextileLanguage());
			//parser = new MarkupParser(new TextileDialect());
		}

		public String textToHtml(final String text) {

			try {
				StringWriter writer = new StringWriter(text.length() * 2);
				textToHtml(text, writer, "");
				
				return writer.toString();			
			} catch (Throwable t) {
				logger.warn("Error while converting textile text to html, ignore, return unconverted original", t);
				
				return text;
			}
		}

		@Override
		public void textToHtml(String text, Writer out, String styleSheetPath) throws IOException {

			try {
				HtmlDocumentBuilder builder = new HtmlDocumentBuilder(out);
				
				boolean asDocument = !styleSheetPath.isEmpty();
				builder.setEmitAsDocument(asDocument);
				
				if (asDocument) {
					builder.addCssStylesheet(new HtmlDocumentBuilder.Stylesheet(styleSheetPath));
				}
				
				builder.setEncoding("utf-8");
				builder.setXhtmlStrict(true);
				
				parser.setBuilder(builder);
				parser.parse(text);
			} catch (Throwable t) {
				logger.warn("Error while converting textile text to html, ignore, return unconverted original", t);
				out.append(text);
			}
		}
	}

}
