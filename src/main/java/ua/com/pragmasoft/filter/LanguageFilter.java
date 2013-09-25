package ua.com.pragmasoft.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LanguageFilter implements Filter {
	private static final String LANG_RU = "ru";
	private static final String LANG_EN = "en";
	private static final String LANGUAGE = "language";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// do nothing
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		HttpSession session = httpRequest.getSession(true);
		Cookie cookie;
		
		// Initialize language
		if (session.getAttribute(LANGUAGE) == null) {			
			Cookie[] cookies = httpRequest.getCookies();
			boolean foundLang = false;

			if (cookies != null) {
				
				for (int i = 0; i < cookies.length; i++) {
					cookie = cookies[i];

					if (cookie.getName().equals(LANGUAGE)) {
						foundLang = true;

						// Check available languages
						if (cookie.getValue().equals(LANG_EN) || 
							  cookie.getValue().equals(LANG_RU)) {							
							session.setAttribute(LANGUAGE, cookie.getValue());
						} else {
							cookie = new Cookie(LANGUAGE, LANG_EN);
							httpResponse.addCookie(cookie);
							session.setAttribute(LANGUAGE, LANG_EN);
						}
						break;
					}
				}
			} 
			if (foundLang == false){
				cookie = new Cookie(LANGUAGE, LANG_EN);
				httpResponse.addCookie(cookie);
				session.setAttribute(LANGUAGE, LANG_EN);
			}
		}

		// Check for 'change locale' request
		String language = request.getParameter(LANGUAGE);
		if (language != null) {
			if (language.equals(LANG_EN)) {
				cookie = new Cookie(LANGUAGE, LANG_EN);
				httpResponse.addCookie(cookie);
				session.setAttribute(LANGUAGE, LANG_EN);
			} else if (language.equals(LANG_RU)) {
				cookie = new Cookie(LANGUAGE, LANG_RU);
				httpResponse.addCookie(cookie);
				session.setAttribute(LANGUAGE, LANG_RU);
			}
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// do nothing
	}

}
