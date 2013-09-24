package ua.com.pragmasoft.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.com.pragmasoft.util.FileReader;
import ua.com.pragmasoft.util.TextProcessorFactory;

public class ProjectsServlet extends HttpServlet {
	private static final long serialVersionUID = 8671904882708526278L;
	private static final String FILE_NAME_EN = "Projects";

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
		InputStream is = context
				.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES
						+ requestUri + ".textile");

		// Check address validity
		if (is == null) {
			// if (request.getAttribute(Constants.LANGUAGE).equals("ru"))
			response.sendError(404, "Page not found!");
			return;
		}

		// Read and convert to html .textile file
		String formattedText = FileReader.getTextFromStream(is);

		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);

		// Reading first line (skip "h1. ", end with CRLF)
		String title = formattedText.substring(4, formattedText.indexOf("\n"));

		request.setAttribute("title", "Pragmasoft - " + title);
		request.setAttribute("text", content);
		request.getRequestDispatcher("/pages/content.ftl").forward(request,
				response);
	}

}
