package example.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.dao.StudentDao;
import example.dao.StudentDaoEmp;
import example.pojo.Student; 


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
   int studentInserted=0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao studentdao=new StudentDaoEmp();
		 /////////////Insersion///////////////////////////////////////////////
//		Student student=new Student(2,"VIRAJ","jadhavviraj1998@gmail.com","edac",60000);
//		StudentDao studentdao=new StudentDaoEmp();
//		try {
//			studentInserted=studentdao.insertStudent(student);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("no of Student inserted="+studentInserted);
		
		//////////////////////////////////////////UPDATE/////////////////////////////////////////////////////
		
//		Student student1=new Student(1,"shinde","sanketshinde1998@gmail.com","edac",60000);
//		StudentDao studentdao=new StudentDaoEmp();
//		int updatedStudents=0;
//		try {
//			updatedStudents=studentdao.updateStudent(student1);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println("no of students updated="+updatedStudents);
		
		/////////////////////////////////////delete/////////////////////////////////////////
//		int deletedStudent=0;
//		 Student student2=new Student();
//		 StudentDao stdentDao=new StudentDaoEmp();
//		 try {
//			 deletedStudent=stdentDao.deleteStudent(student2);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		 System.out.println("no of students deleted="+deletedStudent);
		
		/////////////////////////////////////////get single student////////////////////////////////////////////
		StudentDao stdentDao=new StudentDaoEmp();
		try {
			Student student3=stdentDao.getSingleStudent(1);
			System.out.println(student3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
