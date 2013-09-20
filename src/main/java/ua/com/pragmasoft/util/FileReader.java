package ua.com.pragmasoft.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReader {
	static final Logger logger = LoggerFactory.getLogger(FileReader.class);
	
	public static String getTextFromStream(InputStream is) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			while (br.ready()) {
				sb.append(br.readLine() + "\n");
				
			}
			br.close();
		} catch (Exception e) {
			logger.warn("Error while reading file.");
		}
		return sb.toString();
	}
}
