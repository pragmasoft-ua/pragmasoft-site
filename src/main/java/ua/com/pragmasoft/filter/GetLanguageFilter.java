package ua.com.pragmasoft.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetLanguageFilter implements Filter {

	private final static Logger log = LoggerFactory.getLogger(GetLanguageFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("Filter started");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String path = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length() + 1);
		
		request.setAttribute("language", path.substring(0, 2));
		request.setAttribute("noLangPath", path.substring(2));

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");
	}

}
