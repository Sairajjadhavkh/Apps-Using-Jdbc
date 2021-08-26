package com.studentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.studentpojo.StudentPojo;

public class StudentDaoImpl implements Student1Dao {
	private final static String DRIVER="com.mysql.cj.jdbc.Driver";
	private final static String URL="jdbc:mysql://localhost:3306/school";
	private final static String USER_NAME="root";
	private final static String PWD="cdac";
	private final static String INSERT="insert into students (Student_Id,Student_Name,Student_Email,Student_Course,Student_Fees) values(?,?,?,?,?)";

	
	Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,USER_NAME,PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	@Override
	public boolean insertStudent(StudentPojo student) {
		boolean res=false;
		try(Connection con=getConnection();
				PreparedStatement stm=con.prepareStatement(INSERT)) {
			
			stm.setInt(1, student.getStudent_Id());
			stm.setString(2, student.getStudent_Name());
			stm.setString(3, student.getStudent_Email());
			stm.setString(4, student.getStudent_Course());
			stm.setDouble(5, student.getStudent_Fees());
			if(stm.executeUpdate()==1)
			res=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
