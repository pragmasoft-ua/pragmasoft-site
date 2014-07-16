package ua.com.pragmasoft.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LanguageFilter implements Filter {
	private static final String LANG_RU = "ru";
	private static final String LANG_EN = "en";
	
	private static final Set<String> availableLanguages = new HashSet<String>();
	
	static {
		availableLanguages.add(LANG_RU);
		availableLanguages.add(LANG_EN);
	}
	
	private final static Logger log = LoggerFactory.getLogger(LanguageFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("Filter started");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		String path = httpRequest.getRequestURI().substring(request.getServletContext().getContextPath().length() + 1);
		String [] pathParts = path.split("/");
		
		if (pathParts.length > 0 && availableLanguages.contains(pathParts[0])) {
			chain.doFilter(request, response);
		} else {
			Locale locale = httpRequest.getLocale();
			String language = LANG_EN;
			if (locale.getLanguage() == "ru") {
				language = LANG_RU;
			} 
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/" + language + "/" + path);
			return;
		}
		
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");
	}

}
