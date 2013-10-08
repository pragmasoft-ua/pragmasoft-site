package ua.com.pragmasoft.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReader {	
	static FileReader instance = new FileReader();
	
	static final Logger logger = LoggerFactory.getLogger(FileReader.class);

	private static Map<String, String> metaInfo;
	private static String textileMarkup;
	
	private FileReader() {
		// hidden
	}
	
	public static FileReader getInstance() {
		return instance;
	}

	public void parse(InputStream is) {
		BufferedReader br;

		try {
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			parseMetaInfoFromReader(br);
			parseTextileMarkupFromReader(br);
			br.close();
		} catch (Exception e) {
			logger.warn("Error while reading file.");
		}
	}
	
	public Map<String, String> getMetaInfo() {
		return metaInfo;
	}
	
	public String getTextileMarkup() {
		return textileMarkup;
	}

	private static void parseMetaInfoFromReader(BufferedReader br)
			throws IOException {
		metaInfo = new HashMap<String, String>();

		String currentLine;
		while (br.ready()) {
			currentLine = br.readLine();
			if (!currentLine.isEmpty()) {
				metaInfo.put(
						currentLine.substring(0, currentLine.indexOf(":")),
						currentLine.substring(currentLine.indexOf(":") + 1));
			} else {
				break;
			}
		}
	}

	private static void parseTextileMarkupFromReader(BufferedReader br)
			throws IOException {
		StringBuilder sb = new StringBuilder();

		while (br.ready()) {
			sb.append(br.readLine() + "\n");
		}
		textileMarkup = sb.toString();
	}

}
