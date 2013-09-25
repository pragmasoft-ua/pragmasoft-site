package ua.com.pragmasoft.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import net.sf.ehcache.CacheManager;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextListener implements ServletContextListener {

	private final Logger logger;
	
	public ContextListener() {
		 logger = LoggerFactory.getLogger(ContextListener.class);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		BasicConfigurator.configure();
		logger.debug("Servlet context initialization finished.");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		CacheManager.getInstance().shutdown();
		logger.debug("Servlet context destroyed");		
	}	

}
