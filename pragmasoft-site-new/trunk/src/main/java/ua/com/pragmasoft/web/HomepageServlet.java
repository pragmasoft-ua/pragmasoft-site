package ua.com.pragmasoft.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomepageServlet extends HttpServlet {
	private static final String PATH_TO_HOMEPAGE_EN = "/pages/homepage_en.ftl";
	private static final String PATH_TO_HOMEPAGE_RU = "/pages/homepage_ru.ftl";

	private static final long serialVersionUID = 5727469380040128415L;
	private static final Logger log = LoggerFactory.getLogger(HomepageServlet.class);

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		log.debug("Request URI: {}", request.getRequestURI());
		
		String path;

		if (request.getAttribute(Constants.LANGUAGE).equals("ru")) {
			path = PATH_TO_HOMEPAGE_RU;
		} else {
			path = PATH_TO_HOMEPAGE_EN;
		}
		
		request.getRequestDispatcher(path).forward(request, response);

	}

}
