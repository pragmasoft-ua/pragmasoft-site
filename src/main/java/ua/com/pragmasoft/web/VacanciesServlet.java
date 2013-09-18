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

public class VacanciesServlet extends HttpServlet {
	private static final long serialVersionUID = -5714177758356176506L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletContext context = request.getSession().getServletContext();
		InputStream is = context
				.getResourceAsStream("/WEB-INF/textile/vacancies.textile");

		String formattedText = FileReader.getTextFromStream(is);
		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);
		request.setAttribute("title", "Pragmasoft - Vacancies");
		request.setAttribute("header", "Vacancies");
		request.setAttribute("text", content);
		request.getRequestDispatcher("/pages/content.ftl").forward(request,
				response);
	}
}
