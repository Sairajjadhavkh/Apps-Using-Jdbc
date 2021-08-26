package com.loginprocess;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		Connection con=null;
		PreparedStatement s =null;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","cdac");
			s = con.prepareStatement("select * from userlist where User_Username = ? and User_Password = ?");
			s.setString(1, unm);
			s.setString(2, upass);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				response.sendRedirect("Welcome.html");
			}else {
				response.sendRedirect("Login.html");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
				con.close();
				if(s!=null)
					s.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

	
	

}
