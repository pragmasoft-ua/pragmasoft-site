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

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = request.getSession().getServletContext();
		InputStream is = context
				.getResourceAsStream("/WEB-INF/textile/mainContent.textile");

		String formattedText = FileReader.getTextFromStream(is);
		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);
		request.setAttribute("header", "About Pragmasoft");
		request.setAttribute("text", content);
		request.getRequestDispatcher("/pages/about.ftl").forward(request,
				response);

	}
}
