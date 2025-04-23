package org.cms.controllers;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.cms.DATASOURCES.MySqlDBSource;
import org.cms.MODEL.Login;
import org.cms.REPOSITORY.LoginRepository;


/**
 * Servlet implementation class EditStudentController
 */
public class EditStudentController extends HttpServlet {
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

        Login login = loginRepo.fetchOneLogin(id); // Get student from DB

        if (login != null) {
            request.setAttribute("login", login);
            request.getRequestDispatcher("edit-student.jsp").forward(request, response);
        } else {
            response.getWriter().println("Student not found");
        }
    }
}