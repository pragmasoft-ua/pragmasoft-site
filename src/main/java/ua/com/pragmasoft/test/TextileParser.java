package ua.com.pragmasoft.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Locale;

import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;
import org.eclipse.mylyn.wikitext.core.parser.markup.MarkupLanguage;
import org.eclipse.mylyn.wikitext.core.parser.markup.MarkupLanguageConfiguration;
import org.eclipse.mylyn.wikitext.core.util.ServiceLocator;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;

public class TextileParser {
	public static String parseTextileToHTML(String textile) {
		StringWriter writer = new StringWriter();
        HtmlDocumentBuilder builder = new HtmlDocumentBuilder(writer);
        builder.setEmitAsDocument(false);
        MarkupLanguage language = ServiceLocator.getInstance().getMarkupLanguage("Textile");
        MarkupLanguageConfiguration config = new MarkupLanguageConfiguration();
//        config.setLocale(Locale.ENGLISH);
        config.setOptimizeForRepositoryUsage(true);
        language.configure(config);
        MarkupParser parser = new MarkupParser(language, builder);
        parser.parse(textile);
        return writer.toString();
	}

	public static String parseTextileFileToHTML(InputStream is/*String filename*/) {
//		InputStream is = Thread.currentThread().getContextClassLoader()
//				.getResourceAsStream(filename);
		String output = null;
		BufferedReader br;
		StringBuilder sb;
		try {
			br = new BufferedReader(new InputStreamReader(is));
			sb = new StringBuilder();
			while (br.ready()) {
				sb.append(br.readLine());
			}
			br.close();
			output = TextileParser.parseTextileToHTML(sb.toString());
		} catch (Exception e) {
		}
		return output;
	}
}
