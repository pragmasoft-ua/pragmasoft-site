package ua.com.pragmasoft.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncodingFilter implements Filter {

	private final static Logger log = LoggerFactory.getLogger(EncodingFilter.class);
	private String encoding;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
		log.debug("Encoding set to %s", encoding);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		if (null == request.getCharacterEncoding()) {
			request.setCharacterEncoding(encoding);
		}
		chain.doFilter(request, response);		
	}

	@Override
	public void destroy() {
	}

}
