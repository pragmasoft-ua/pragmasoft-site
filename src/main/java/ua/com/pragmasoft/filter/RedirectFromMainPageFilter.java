package ua.com.pragmasoft.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class RedirectFromMainPageFilter implements Filter {

	private final static Logger log = Logger.getLogger(RedirectFromMainPageFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("Filter initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println(((HttpServletRequest)request).getContextPath());
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		log.debug("Filter destroyed");		
	}

}
