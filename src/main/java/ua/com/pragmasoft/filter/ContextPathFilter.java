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
	private static String homePage;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("Filter initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		session = httpRequest.getSession();

		if (null == homePage) {
			homePage = getHomePageUrl(httpRequest);
		}
		
		session.setAttribute("home", homePage);
		chain.doFilter(request, response);		
	}
	
	private String getHomePageUrl(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		String requestedUrl = request.getRequestURL().toString();
		String port = String.valueOf(request.getServerPort());
		String serverName = request.getServerName();
		String portWithContextPath = port.concat(contextPath);
		String serverNameWithContextPath = serverName.concat(contextPath);
		
		if (!contextPath.isEmpty()) {
			return requestedUrl.contains(port) ?
				requestedUrl.substring(0, requestedUrl.indexOf(port) + portWithContextPath.length()) :
				requestedUrl.substring(0, requestedUrl.indexOf(serverName) + serverNameWithContextPath.length());
		}
		
		return (requestedUrl.contains(port)) ?
			requestedUrl.substring(0, requestedUrl.indexOf(port) + port.length()) :
			requestedUrl.substring(0, requestedUrl.indexOf(serverName) + serverNameWithContextPath.length());		
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");
	}

}
