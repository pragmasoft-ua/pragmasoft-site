package ua.com.pragmasoft.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsServlet extends HttpServlet {

	private static final long serialVersionUID = -5714177759316176506L;
	private static final Logger log = LoggerFactory.getLogger(ContactUsServlet.class);
	
	private static final String PATH_TO_CONTACT_US_EN = "orderProject_en.ftl";
	private static final String PATH_TO_CONTACT_US_RU = "orderProject_ru.ftl";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("Request URI: {}", request.getRequestURI());
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		String path;

		if (session.getAttribute(Constants.LANGUAGE).equals("ru")) {
			path = PATH_TO_CONTACT_US_RU;
		} else {
			path = PATH_TO_CONTACT_US_EN;
		}
		
		request.setAttribute("path", path);
		request.getRequestDispatcher("/pages/contactUs.ftl").forward(request, response);
	}
}