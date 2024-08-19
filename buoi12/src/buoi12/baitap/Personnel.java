package buoi12.baitap;

import java.util.Scanner;

public abstract class Personnel {
	private String empId;
	private String fullName;
	private String phoneNo;
	private int workDays;
	private double daySalary;
	
	public boolean isPersonnelValid() {
		return (this.empId != "" && this.fullName != "" && this.phoneNo.length() > 0 & this.phoneNo.length() < 11
				&& this.workDays >= 0);
	}
	
	public Personnel() {
		
	}
	
	public void inputPersonnel() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter personnel empID: ");
			this.empId = sc.nextLine();
			
			System.out.println("Enter personnel full name");
			this.fullName = sc.nextLine();
			
			System.out.println("Enter personnel phone number: ");
			this.phoneNo = sc.nextLine();
			
			System.out.println("Enter personnel work days");
			this.workDays = sc.nextInt();
			
			if (!isPersonnelValid()) {
				System.out.println("Invalid personnel info!");
				sc.nextLine();
				
			}
		} while (!isPersonnelValid());
		
	}
	
	public void outputPersonnel() {
		System.out.println("EmpId " + this.empId + " Fullname " + this.fullName + " PhoneNo " + this.phoneNo);
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getWorkDays() {
		return workDays;
	}
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	public double getDaySalary() {
		return daySalary;
	}
	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}
	
	public double calcSalary() {
		return 0;
	}
	
	
	
}
