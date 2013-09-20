package ua.com.pragmasoft.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LocaleFilter implements Filter {
	private static final String LANG_EN = "language=en";	
	private static final String LANG_RU = "language=ru";
	private static final String LOCALE_RU = "ru";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// do nothing		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		if (request.getLocale() == null) {
			response.setLocale(Locale.US);
		}
		
//		HttpServletRequest httpRequest = (HttpServletRequest) request;
//		String query = httpRequest.getQueryString();
//		
//		if (query.contains(LANG_EN)) {
//			response.setLocale(Locale.ENGLISH);
//		} else if (query.contains(LANG_RU)) {
//			response.setLocale(new Locale(LOCALE_RU));
//		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// do nothing
	}

}
