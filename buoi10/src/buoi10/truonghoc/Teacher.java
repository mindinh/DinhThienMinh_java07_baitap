package buoi10.truonghoc;

import java.util.ArrayList;

public class Teacher extends Person {
	private String employeeID;
	private ArrayList<String> subjects;
	
	public Teacher(String name, int age, String address, String id) {
		super(name, age, address);
		this.employeeID = id;
		this.subjects = new ArrayList<String>();
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public ArrayList<String> getSubjects() {
		return this.subjects;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("EmployeeID " + this.employeeID);
		System.out.print("Subjects : ");
		for (String s : this.subjects) {
			System.out.print(s + " ");
		}
	}
	
	public void assign(String s) {
		this.subjects.add(s);
		
	}
}
