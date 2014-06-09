package ua.com.pragmasoft.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorHandler extends HttpServlet {
	private static final long serialVersionUID = -7654362757290913082L;
	private static final Logger log = LoggerFactory.getLogger(ErrorHandler.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("Request received URL: {}", req.getRequestURI());
		req.getRequestDispatcher("/pages/404.ftl").forward(req, resp);
	}
	
}
