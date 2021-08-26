package example.dao;

import java.sql.SQLException;
import java.util.List;

import example.pojo.Student;
//step 2 of dao (data acess object)
public interface StudentDao {
	
	int insertStudent(Student student) throws SQLException;
	int updateStudent(Student student) throws SQLException;
	int deleteStudent(Student student) throws SQLException;
	Student getSingleStudent(int Student_Id) throws SQLException;
	List<Student> getAllStudents() throws SQLException;
}
