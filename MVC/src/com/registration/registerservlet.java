package com.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentDao.Student1Dao;
import com.studentDao.StudentDaoImpl;
import com.studentpojo.StudentPojo;


@WebServlet("/register")
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("Student_Id"));
		String name=request.getParameter("Student_Name");
		String email=request.getParameter("Student_Email");
		String course=request.getParameter("Student_Course");
		double fees=Double.parseDouble(request.getParameter("Student_Fees"));
		
		StudentPojo student=new StudentPojo(id,name,email,course,fees); 
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("course", course);
		request.setAttribute("fees", fees);
		
		Student1Dao stud=new StudentDaoImpl();
		if(stud.insertStudent(student)) {
			RequestDispatcher eq=request.getRequestDispatcher("display.jsp");
			eq.forward(request, response);
		}
		
		
	}

}
