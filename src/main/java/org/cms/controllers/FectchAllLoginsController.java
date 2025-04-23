package org.cms.controllers;
import jakarta.servlet.ServletConfig;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import org.cms.DATASOURCES.MySqlDBSource;
import org.cms.MODEL.Login;
import org.cms.REPOSITORY.LoginRepository;
import org.cms.SERVICES.LoginServiceImpl;
public class FectchAllLoginsController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private ServletConfig config;
	public FectchAllLoginsController() {
		super();
	}
	public ServletConfig getServletConfig() {
		return config;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		HttpSession session = request.getSession();
		response.getWriter().println("<h2>"+request.getRequestURL()+"</h2>");
	try {
		MySqlDBSource ds=new MySqlDBSource();
		LoginRepository repository=new LoginRepository(ds);
		LoginServiceImpl service=new LoginServiceImpl(repository);
	    List<Login> fetched=service.fetchAll();
	    session.setAttribute("abc", fetched);
		}catch(Exception e) {
			System.out.println(e);
		
	}
	request.getRequestDispatcher("show.jsp").forward(request, response);
	}
	
	

}
