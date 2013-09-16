package ua.com.pragmasoft.test;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
//	    String content = "<h1>Lorem ipsum</h1>"+
//        "<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"+
//        "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"+
//        "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"+
//        "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse"+
//        "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non"+
//        "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>"+
//
//        "<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"+
//        "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"+
//        "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"+
//        "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse"+
//        "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non"+
//        "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>";
		
		ServletContext context = request.getSession().getServletContext();
		InputStream is = context.getResourceAsStream("/WEB-INF/mainContent.txt");
		request.setAttribute("text", TextileParser.parseTextileFileToHTML(is));
		
	    
	    request.setAttribute("title", "Hello Page");
//	    request.setAttribute("text", content);
	    request.getRequestDispatcher("/pages/base.ftl").forward(request, response);
	 
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doGet(request, response);
	}
}
