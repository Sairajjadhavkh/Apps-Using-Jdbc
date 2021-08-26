package com.studentpojo;

public class StudentPojo {
	private int Student_Id;
	private String Student_Name;
	private String Student_Email;
	private String Student_Course;
	private double Student_Fees;
	public StudentPojo() {
		super();
	}
	public StudentPojo(int student_Id, String student_Name, String student_Email, String student_Course,
			double student_Fees) {
		super();
		Student_Id = student_Id;
		Student_Name = student_Name;
		Student_Email = student_Email;
		Student_Course = student_Course;
		Student_Fees = student_Fees;
	}
	
	
	
	public int getStudent_Id() {
		return Student_Id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public String getStudent_Email() {
		return Student_Email;
	}
	public String getStudent_Course() {
		return Student_Course;
	}
	public double getStudent_Fees() {
		return Student_Fees;
	}
	@Override
	public String toString() {
		return "StudentPojo [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Student_Email="
				+ Student_Email + ", Student_Course=" + Student_Course + ", Student_Fees=" + Student_Fees + "]";
	}
	
	
}
