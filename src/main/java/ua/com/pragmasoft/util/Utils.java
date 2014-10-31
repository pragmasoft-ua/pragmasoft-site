package ua.com.pragmasoft.util;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.com.pragmasoft.web.Constants;

public class Utils {
	private static final Logger log = LoggerFactory.getLogger(Utils.class);
	public static final Set<String> AVAILABLE_LANGUAGES = new HashSet<String>();
	
	static {
		AVAILABLE_LANGUAGES.add(Constants.LANG_RU);
		AVAILABLE_LANGUAGES.add(Constants.LANG_EN);
	}
	
	
	
}
