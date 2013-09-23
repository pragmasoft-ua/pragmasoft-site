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

public class VacanciesServlet extends HttpServlet {
	private static final long serialVersionUID = -5714177758356176506L;
	
	private static final String FILE_NAME_EN = "vacancies.textile";
	private static final String FILE_NAME_RU = "vacancies_ru.textile";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		String fileName;
		
		if (session.getAttribute(Constants.LANGUAGE).equals("ru")) {
			fileName = FILE_NAME_RU;
			request.setAttribute(Constants.LANGUAGE, "ru");
		} else {
			fileName = FILE_NAME_EN;
			request.setAttribute(Constants.LANGUAGE, "en");
		}
		
		ServletContext context = request.getSession().getServletContext();
		InputStream is = context
				.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES + fileName);

		String formattedText = FileReader.getTextFromStream(is);
		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);
		
		// Reading first line (skip "h1. ", end with CRLF)
		String title = "Hello";//formattedText.substring(4, formattedText.indexOf("\n"));
		request.setAttribute("title", "Pragmasoft - " + title);
		
		request.setAttribute("text", content);
		request.getRequestDispatcher("/pages/content.ftl").forward(request,
				response);
	}
}
