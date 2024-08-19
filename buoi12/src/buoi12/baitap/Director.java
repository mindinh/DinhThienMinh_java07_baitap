package buoi12.baitap;

import java.util.Scanner;

public class Director extends Personnel {
	private double shares;
	
	public Director() {
		setDaySalary(300);
	}
	
	@Override
	public void inputPersonnel() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		super.inputPersonnel();
		
		do {
			System.out.println("Enter director's amount of shares: ");
			this.shares = sc.nextDouble();
			
			if (this.shares <= 0) {
				System.out.println("Shares must be > 0!");
			}
		} while (this.shares <= 0);
	}
	
	public double getShares() {
		return shares;
	}


	public void setShares(double shares) {
		this.shares = shares;
	}


	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		double salary = getDaySalary() * getWorkDays();
		
		return salary;
		
	}
}
