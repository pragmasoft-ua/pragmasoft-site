package ua.com.pragmasoft.listener;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import net.sf.ehcache.CacheManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextListener implements ServletContextListener {

	private final Logger logger;
	
	public ContextListener() {
		 logger = LoggerFactory.getLogger(ContextListener.class);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext context = sce.getServletContext();
		context.setAttribute("app", context.getContextPath().concat("/"));
		context.setAttribute("year", Calendar.getInstance().get(Calendar.YEAR));
		logger.debug("Servlet context initialization finished.");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		CacheManager.getInstance().shutdown();
		logger.debug("Servlet context destroyed");		
	}	

}
