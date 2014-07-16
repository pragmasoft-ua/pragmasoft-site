package ua.com.pragmasoft.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.com.pragmasoft.util.FileReader;
import ua.com.pragmasoft.util.TextProcessorFactory;

public class VacanciesServlet extends HttpServlet {
	private static final String FILE_NAME_EN = "vacancies.textile";
	private static final String FILE_NAME_RU = "vacancies_ru.textile";

	private static final long serialVersionUID = -5714177758356176506L;
	private static final Logger log = LoggerFactory.getLogger(VacanciesServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		log.debug("Request received URL: {}", request.getRequestURI());
		String fileName;
		
		if (request.getAttribute(Constants.LANGUAGE).equals("ru")) {
			fileName = FILE_NAME_RU;
		} else {
			fileName = FILE_NAME_EN;
		}
		
		ServletContext context = request.getSession().getServletContext();
		InputStream textAsStream = context.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES + fileName);
		
		synchronized (VacanciesServlet.class) {			
			FileReader.getInstance().parse(textAsStream);			
			for (Map.Entry<String, String> entry: FileReader.getInstance().getMetaInfo().entrySet()) {
				request.setAttribute(entry.getKey(), entry.getValue());
			}
			
			String formattedText = FileReader.getInstance().getTextileMarkup();
			String content = TextProcessorFactory.getMarkdownProcessor().textToHtml(formattedText);			
			request.setAttribute("text", content);
		}
		request.getRequestDispatcher("/pages/vacancies.ftl").forward(request, response);
	}
}
