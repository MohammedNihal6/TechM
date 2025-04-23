package org.cms.controllers;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.cms.DATASOURCES.MySqlDBSource;
import org.cms.REPOSITORY.LoginRepository;

/**
 * Servlet implementation class DeleteStudentController
 */
public class DeleteLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MySqlDBSource ds;
	private LoginRepository loginRepo;

    @Override
    public void init() throws ServletException {
    	try {
    	ds=new MySqlDBSource();
        loginRepo = new LoginRepository(ds);
    	}catch(Exception e) {}
    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	       int id = Integer.parseInt(request.getParameter("id").toString());
	        loginRepo.deleteLogin(id);
	        response.sendRedirect("Login-list.jsp");
	    }
	}