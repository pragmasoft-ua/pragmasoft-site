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
	private static final String FILE_NAME_EN = "Projects";
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectsServlet.class);

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = ((HttpServletRequest) request).getSession();

		// Get project name
		String requestUri = request.getRequestURL().toString();
		requestUri = requestUri.substring(requestUri.indexOf(FILE_NAME_EN));

		// We need to set language only for '/Projects' page and ignore
		// otherwise
		if (session.getAttribute(Constants.LANGUAGE).equals("ru")
				&& requestUri.indexOf("/") == -1) {
			requestUri = requestUri + "_ru";
		} 

		ServletContext context = request.getSession().getServletContext();
		InputStream textAsStream = context
				.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES
						+ requestUri + ".textile");

		// Check address validity
		if (textAsStream == null) {
			logger.warn("Page not found. Redirecting to error page.");
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
