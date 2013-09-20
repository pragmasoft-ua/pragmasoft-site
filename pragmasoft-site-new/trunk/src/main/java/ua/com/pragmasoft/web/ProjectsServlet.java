package ua.com.pragmasoft.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.pragmasoft.util.FileReader;
import ua.com.pragmasoft.util.TextProcessorFactory;

public class ProjectsServlet extends HttpServlet {
	private static final long serialVersionUID = 8671904882708526278L;
	private static final String PROJECTS_PAGE = "Projects";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Get project name
		String requestUri = request.getRequestURL().toString();
		requestUri = requestUri.substring(requestUri.indexOf(PROJECTS_PAGE));
		System.out.println(requestUri);

		ServletContext context = request.getSession().getServletContext();

		InputStream is = context.getResourceAsStream("/WEB-INF/textile/"
				+ requestUri + ".textile");
		
		// Read and convert to html .textile file
		String formattedText = FileReader.getTextFromStream(is);
		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);

		// Reading first line (skip "h1. ", end with CRLF)
		String title = formattedText.substring(4, formattedText.indexOf("\n"));

		request.setAttribute("title", "Pragmasoft - " + title);

		request.setAttribute("text", content);
		
		// Load template. Depends on hierarchy level.
		if (requestUri.indexOf("/") == -1) {
			request.getRequestDispatcher("/pages/project.ftl").forward(request,
					response);
		} else {
			request.getRequestDispatcher("/pages/projectSecondLevel.ftl").forward(request,
					response);
		}
	}

}
