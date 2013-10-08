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
		} else {
			fileName = FILE_NAME_EN;
		}
		
		ServletContext context = request.getSession().getServletContext();
		InputStream textAsStream = context.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES + fileName);

		FileReader.getInstance().parse(textAsStream);
		
		for (Map.Entry<String, String> entry: FileReader.getInstance().getMetaInfo().entrySet()) {
			session.setAttribute(entry.getKey(), entry.getValue());
		}
		
		String formattedText = FileReader.getInstance().getTextileMarkup();
		String content = TextProcessorFactory.getMarkdownProcessor()
				.textToHtml(formattedText);
		
		request.setAttribute("text", content);
		request.getRequestDispatcher("/pages/content.ftl").forward(request,
				response);
	}
}
