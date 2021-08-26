package example.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import example.pojo.Student;
////Step 3 of DAO:Implementation of Concrete Class
public class StudentDaoEmp implements StudentDao{
	private final static String DRIVER="com.mysql.cj.jdbc.Driver";
	private final static String URL="jdbc:mysql://localhost:3306/school";
	private final static String DB_USER="root";
	private final static String DB_PWD="cdac";
	
	private final static String INSERT_STUDENT="INSERT INTO students (Student_Id,Student_Name,"
			+ "Student_Email,Student_Course,Student_Fees) VALUES(?,?,?,?,?)";
	private final static String UPDATE_STUDENT="UPDATE students set Student_Name=?,Student_Email=? where Student_Id=? ";
	private final static String DELETE_STUDENT="DELETE from students where Student_Id=?";
	private final static String GET_STUDENT="select * from students where Student_Id=?";
	private Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,DB_USER,DB_PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	int noOfInsertedStudents=0;
	int noOfStudentsUpdated=0;
	int noOfStudentsDeleted=0;
	@Override
	public int insertStudent(Student student) throws SQLException {
		try(Connection con=getConnection();
				PreparedStatement stm=con.prepareStatement(INSERT_STUDENT);) {
			
			stm.setInt(1, student.getStudent_Id());
			stm.setString(2,student.getStudent_Name());
			stm.setString(3, student.getStudent_Email());
			stm.setString(4, student.getStudent_Course());
			stm.setDouble(5, student.getStudent_Fees());
			
			noOfInsertedStudents=stm.executeUpdate();
		} 
		return noOfInsertedStudents;
	}

	

	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(Student student) throws SQLException {
		try(Connection con=getConnection();
				PreparedStatement stm=con.prepareStatement(UPDATE_STUDENT);) {
			
			stm.setString(1,student.getStudent_Name());
			stm.setString(2, student.getStudent_Email());
			stm.setInt(3, student.getStudent_Id());
			
			
			noOfStudentsUpdated=stm.executeUpdate();
		} 
		return noOfStudentsUpdated;
	}

	@Override
	public int deleteStudent(Student student) throws SQLException {
		try(Connection con=getConnection();
				PreparedStatement stm=con.prepareStatement(DELETE_STUDENT);) {
			
			
			stm.setInt(1, student.getStudent_Id());
			
			
			noOfStudentsDeleted=stm.executeUpdate();
		} 
		return noOfStudentsDeleted;
	}

	@Override
	public Student getSingleStudent(int Student_Id) throws SQLException {
		Student student=null;
		try(Connection con=getConnection();
				PreparedStatement stm=con.prepareStatement(GET_STUDENT);) {
			
			
			stm.setInt(1,Student_Id );
			
			
			ResultSet res=stm.executeQuery();
			if(res.next()) {
				int id=res.getInt("Student_Id");
				String name=res.getString("Student_Name");
				String email=res.getString("Student_Email");
				String course=res.getString("Student_Course");
				double fees=res.getDouble("Student_Fees");
				 student =new Student(id,name,email,course,fees);
			}
			
		} 
		return student;
	}

	
}
