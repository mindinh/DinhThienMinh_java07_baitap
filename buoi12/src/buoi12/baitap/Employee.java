package buoi12.baitap;

import java.util.Scanner;

public class Employee extends Personnel {
	private DepartmentHead head;
	
	public Employee() {
		this.head = null;
		setDaySalary(100);
	}
	
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		super.calcSalary();
		double salary = 0;
		salary = getDaySalary()	* getWorkDays();
		return salary;
	}


	public DepartmentHead getHead() {
		return head;
	}


	public void setHead(DepartmentHead head) {
		if (this.head == null) {
			this.head = head;			
		}
		else {
			System.out.println("Departmenthead " + this.head.getEmpId() + " already exists");
			return;
		}
	}
	
	public void removeHead() {
		this.head = null;
	}
	
}
