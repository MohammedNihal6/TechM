package org.cms.controllers;

import java.io.IOException;



import java.util.List;

import org.cms.DATASOURCES.MySqlDBSource;
import org.cms.MODEL.Login;
import org.cms.REPOSITORY.LoginRepository;
import org.cms.SERVICES.LoginServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public LoginServlet() {
		super();
	
	}
	public void init(ServletConfig config) throws ServletException{
		
	}
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		try {
			MySqlDBSource ds=new MySqlDBSource();
			LoginRepository repository=new LoginRepository(ds);
			LoginServiceImpl service=new LoginServiceImpl(repository);
			List<Login> fetched=service.fetchAll();
			session.setAttribute("abc", fetched);
		}catch(Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd = request.getRequestDispatcher("Login-list.jsp");
		rd.forward(request,response);
	}
}