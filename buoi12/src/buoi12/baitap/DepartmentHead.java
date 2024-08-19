package buoi12.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentHead extends Personnel {
	private ArrayList<Employee> empList;
	
	private int numOfEmp;
	
	public DepartmentHead() {
		this.empList = new ArrayList<Employee>();
		this.numOfEmp = 0;
		setDaySalary(200);
	}

	
	public void addEmployee(Employee e) {
		this.empList.add(e);
		numOfEmp += 1;
	}
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		double salary = getDaySalary() * getWorkDays() + 100 * this.numOfEmp;
		return salary;
	}


	public ArrayList<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}


	public int getNumOfEmp() {
		return numOfEmp;
	}


	public void setNumOfEmp(int numOfEmp) {
		this.numOfEmp = numOfEmp;
	}
	
	@Override
	public void outputPersonnel() {
		// TODO Auto-generated method stub
		super.outputPersonnel();
		System.out.println("Manage Employees:");
		for (Personnel p : this.empList) {
			System.out.println("+ " + p.getEmpId() + " " + p.getFullName());
		}
	}
	
	public void removeManagedEmployees() {
		for (Employee e : this.empList) {
			e.removeHead();
		}
		this.empList.clear();
		this.numOfEmp = 0;
		
	}
}
