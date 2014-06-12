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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextPathFilter implements Filter {

	private final static Logger log = LoggerFactory.getLogger(ContextPathFilter.class);	
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

		session.setAttribute("home", getHomePageUrl(httpRequest));
		chain.doFilter(request, response);		
	}
	
	private String getHomePageUrl(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		String requestedUrl = request.getRequestURL().toString();
		String port = String.valueOf(request.getServerPort());
		
		if (!contextPath.isEmpty() || !requestedUrl.contains(port)) {
			return requestedUrl.substring(0, requestedUrl.indexOf(contextPath) + contextPath.length());
		}
		return requestedUrl.substring(0, requestedUrl.indexOf(port) + port.length());
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");
	}

}
