package com.loginprocess;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usname=request.getParameter("userName");
		String password=request.getParameter("userPass");
		Connection con=null;
		PreparedStatement stm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","cdac");
			 stm=con.prepareStatement("INSERT into userlist (User_Username,User_Password) values(?,?)");
			stm.setString(1, usname);
			stm.setString(2, password);
			int i=stm.executeUpdate();
			response.sendRedirect("Login.html");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
				con.close();
				if(stm!=null)
					stm.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

	
}
