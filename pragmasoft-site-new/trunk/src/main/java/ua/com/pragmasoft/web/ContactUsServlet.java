package ua.com.pragmasoft.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsServlet extends HttpServlet {

	private static final long serialVersionUID = -5714177758356176506L;
	private static final Logger log = LoggerFactory.getLogger(ContactUsServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("Request URI: {}", request.getRequestURI());
		
		request.getRequestDispatcher("/pages/contactUs.ftl").forward(request, response);
	}
}