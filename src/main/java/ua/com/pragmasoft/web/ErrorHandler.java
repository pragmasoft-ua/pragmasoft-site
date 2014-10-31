package ua.com.pragmasoft.web;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.com.pragmasoft.util.Utils;

public class ErrorHandler extends HttpServlet {
	private static final long serialVersionUID = -7654362757290913082L;
	private static final Logger log = LoggerFactory.getLogger(ErrorHandler.class);
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String origURI = (String) req.getAttribute("javax.servlet.error.request_uri");
		log.info("Request received URL: {}", origURI);
		String path = origURI.substring(req.getServletContext().getContextPath().length() + 1);
		String [] pathParts = path.split("/");
		
		String contextPath = req.getContextPath().concat("/");
		String language = "";
		if (pathParts.length > 0 && Utils.AVAILABLE_LANGUAGES.contains(pathParts[0])) {
			language = pathParts[0];
		} else {
			Locale locale = req.getLocale();
			language = Constants.LANG_EN;
			if (locale.getLanguage() == "ru") {
				language = Constants.LANG_RU;
			} 
			resp.sendRedirect(contextPath + language + "/" + path);
			return;
		}
		
		req.setAttribute("language", language);
		req.setAttribute("app", contextPath);
		req.setAttribute("noLangPath", "/");
		req.getRequestDispatcher("/pages/" + language + "/404.ftl").forward(req, resp);
	}
	
}
