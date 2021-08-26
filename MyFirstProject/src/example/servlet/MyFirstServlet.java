package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyFirstServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("request recived to server");
		response.setContentType("text/html");
		PrintWriter write=response.getWriter();
		
		write.print("<h3 style='color:blue'>response is recived</h3>");
		write.print("<h3 style='color:green'>response is sent</h3>");
		Connection con=null;
		Statement stm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest","root","cdac");
			 stm=con.createStatement();
			
			String sqlQuery="INSERT INTO students (name,course) values('sairaj','edac')";
			
			 sqlQuery="INSERT INTO students (name,course) values('viraj','edac')";
			int noOfRows=stm.executeUpdate(sqlQuery);
			
			write.print("\n no of students Records inserted:"+noOfRows);
			
			response.sendRedirect("index.jsp?recordinserted=2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			write.close();
			try {
				if(stm!=null)
					stm.close();
				if(con!=null)
				con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
