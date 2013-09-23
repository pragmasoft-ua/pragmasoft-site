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

public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String FILE_NAME_EN = "about.textile";
	private static final String FILE_NAME_RU = "about_ru.textile";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = ((HttpServletRequest) request).getSession();
		String fileName;

		if (session.getAttribute(Constants.LANGUAGE).equals("ru")) {
			fileName = FILE_NAME_RU;
			request.setAttribute(Constants.LANGUAGE, "ru");
		} else {
			fileName = FILE_NAME_EN;
			request.setAttribute(Constants.LANGUAGE, "en");
		}

		ServletContext context = request.getSession().getServletContext();
		InputStream textAsStream = context
				.getResourceAsStream(Constants.PATH_TO_TEXTILE_TEMPLATES
						+ fileName);

		String formattedText = FileReader.getTextFromStream(textAsStream);
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
