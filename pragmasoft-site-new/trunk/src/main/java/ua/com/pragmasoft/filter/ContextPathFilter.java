package ua.com.pragmasoft.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class ContextPathFilter implements Filter {

	private final static Logger log = Logger.getLogger(ContextPathFilter.class);
	
	private HttpSession session;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("Filter initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		session = httpRequest.getSession();

		// Parameter for freemarker
		if (session.getAttribute("app") == null) {
			session.setAttribute("app", httpRequest.getContextPath());
		}
		session.setAttribute("currentPath", httpRequest.getRequestURI());
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");
	}

}
