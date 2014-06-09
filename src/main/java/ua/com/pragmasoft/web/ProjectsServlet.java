package ua.com.pragmasoft.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.com.pragmasoft.util.FileReader;
import ua.com.pragmasoft.util.TextProcessorFactory;

public class ProjectsServlet extends HttpServlet {
	private static final long serialVersionUID = 8671904882708526278L;
	private static final String ROOT_DIRECTORY = "project/";
	private static final String PROJECTS_EN_PATH = "projects_en/";
	private static final String PROJECTS_RU_PATH = "projects_ru/";
	
	private static final Logger log = LoggerFactory.getLogger(ProjectsServlet.class);

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		log.debug("Request URI: {}", request.getRequestURI());
		HttpSession session = ((HttpServletRequest) request).getSession();

		String requestUri = request.getRequestURL().toString();
		String projectName = requestUri.substring(requestUri.indexOf(ROOT_DIRECTORY) + ROOT_DIRECTORY.length());

		String pathToTemplate;
		if (session.getAttribute(Constants.LANGUAGE).equals("en")) {
			pathToTemplate = PROJECTS_EN_PATH + projectName;
		} else {
			pathToTemplate = PROJECTS_RU_PATH + projectName;
		}

		ServletContext context = request.getSession().getServletContext();
		InputStream textAsStream = context
				.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES + pathToTemplate + ".textile");

		// Check if address was valid
		if (textAsStream == null) {
			log.warn("Page not found. Redirecting to error page.");
			response.sendError(404, "Page not found!");
			return;
		}

		synchronized (ProjectsServlet.class) {			
			FileReader.getInstance().parse(textAsStream);			
			for (Map.Entry<String, String> entry: FileReader.getInstance().getMetaInfo().entrySet()) {
				session.setAttribute(entry.getKey(), entry.getValue());
			}
			
			String formattedText = FileReader.getInstance().getTextileMarkup();
			String content = TextProcessorFactory.getMarkdownProcessor().textToHtml(formattedText);	
			request.setAttribute("text", content);
		}
		request.getRequestDispatcher("/pages/content.ftl").forward(request, response);
	}

}
