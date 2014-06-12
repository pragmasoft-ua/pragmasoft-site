package ua.com.pragmasoft.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		String contextPath = session.getServletContext().getContextPath();
		if (contextPath.equals("")) {			
			contextPath = "/";
		} else {
			contextPath = contextPath.concat("/");
		}
		session.setAttribute("app", contextPath);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}

}
