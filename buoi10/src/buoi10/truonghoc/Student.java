package buoi10.truonghoc;

import java.util.ArrayList;

public class Student extends Person {
	private String studentID; 
	private ArrayList<Course> courses;
	
	public Student(String name, int age, String address, String id) {
		super(name, age, address);
		this.studentID = id;
		this.courses = new ArrayList<Course>();
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("StudentID " + this.studentID);
		System.out.println("Courses enrolled: ");
		for (Course c : this.courses) {
			System.out.println("+ " + c.getCourseName());
		}
	}
	
	public void enroll(Course c) {
		this.courses.add(c);
		
	}
}
