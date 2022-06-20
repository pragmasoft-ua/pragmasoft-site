package ua.com.pragmasoft.web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailServlet extends HttpServlet {

	// @Resource(name="mail/Session")
	// private Session session;
	private static final String SUBJECT = "Someone send message via pragmasoft.com.ua";
	private static final String LINE_SEPARATOR = "<br/>";
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailServlet.class);
	private static final long serialVersionUID = -5252164430615219628L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String language = (String) req.getAttribute("language");
		req.getRequestDispatcher("/pages/" + language + "/email_sent.ftl").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// try {
		// String requesterName = req.getParameter("requesterName");
		// String requesterEmail = req.getParameter("requesterEmail");
		// String messageBody = req.getParameter("message");

		// StringBuilder sb = new StringBuilder();
		// sb.append("<strong>Name</strong>: ")
		// .append(requesterName).append(LINE_SEPARATOR)
		// .append("<strong>email: </strong>")
		// .append(requesterEmail).append(LINE_SEPARATOR)
		// .append(LINE_SEPARATOR)
		// .append(messageBody);

		// Message message = new MimeMessage(session);
		// message.setRecipients(Message.RecipientType.TO,
		// InternetAddress.parse("info@pragmasoft.com.ua")); // TODO replace to original
		// message.setSubject(SUBJECT);

		// if (!StringUtils.isEmpty(requesterName) &&
		// !StringUtils.isEmpty(requesterEmail) &&
		// !StringUtils.isEmpty(messageBody)) {

		// message.setContent(sb.toString(), "text/html; charset=utf-8");
		// Transport.send(message);
		// LOGGER.info("Message from {} ({}) sent", requesterName, requesterEmail);
		// }

		String language = (String) req.getAttribute("language");
		req.getRequestDispatcher("/pages/" + language + "/email_sent.ftl").forward(req, resp);

		// } catch (MessagingException e) {
		// LOGGER.error("Email sending error: ", e);
		// }
	}

}
