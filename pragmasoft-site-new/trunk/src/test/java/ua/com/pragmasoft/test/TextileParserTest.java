package ua.com.pragmasoft.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;

import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;
import org.junit.Before;
import org.junit.Test;

public class TextileParserTest {
	MarkupParser parser;
	String textToParse;
	StringWriter writer = new StringWriter();
	
	@Before
	public void init() {
		parser = new MarkupParser(new TextileLanguage());
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(new File("mainContent.textile")));
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		textToParse = sb.toString();
	}
	
	@Test
	public void test1() {
		assertNotEquals(textToParse.length(), 0);
		HtmlDocumentBuilder builder = new HtmlDocumentBuilder(writer);		
		builder.setEmitAsDocument(false); // html and body tags are not included in the output
		builder.setEncoding("utf-8");
		builder.setXhtmlStrict(true);
		parser.setBuilder(builder);
		parser.parse(textToParse);
		String output = writer.toString();
		assertNotEquals(textToParse, output);
	}
}
