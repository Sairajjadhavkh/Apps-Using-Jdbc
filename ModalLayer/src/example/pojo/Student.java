package example.pojo;


//////Step 1 of Dao
public class Student {
	
	//`students`.`Student_Id`, `students`.`Student_Name`, `students`.`Student_Email`, `students`.`Student_Course`, `students`.`Student_Fees`
	
	private int Student_Id;
	private String Student_Name;
	private String Student_Email;
	private String Student_Course;
	private double Student_Fees;
	
	
	
	public Student() {
		super();
	}
	public int getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_Email() {
		return Student_Email;
	}
	public void setStudent_Email(String student_Email) {
		Student_Email = student_Email;
	}
	public String getStudent_Course() {
		return Student_Course;
	}
	public void setStudent_Course(String student_Course) {
		Student_Course = student_Course;
	}
	public double getStudent_Fees() {
		return Student_Fees;
	}
	public void setStudent_Fees(double student_Fees) {
		Student_Fees = student_Fees;
	}
	public Student(int student_Id, String student_Name, String student_Email, String student_Course,
			double student_Fees) {
		super();
		Student_Id = student_Id;
		Student_Name = student_Name;
		Student_Email = student_Email;
		Student_Course = student_Course;
		Student_Fees = student_Fees;
	}
	@Override
	public String toString() {
		return "Student [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Student_Email="
				+ Student_Email + ", Student_Course=" + Student_Course + ", Student_Fees=" + Student_Fees + "]";
	}
	

}
