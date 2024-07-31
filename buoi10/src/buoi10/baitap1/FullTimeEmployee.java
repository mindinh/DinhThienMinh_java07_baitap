package buoi10.baitap1;


public class FullTimeEmployee extends Employee {
	private double benefits;
	
	public FullTimeEmployee(String name, int age, double benefits) {
		super(name, age);
		this.benefits = benefits;
	}
	
	public double getBenefits() {
		return benefits;
	}

	public void setBenefits(double benefits) {
		this.benefits = benefits;
	}
	
	@Override
	public void display_info() {
		// TODO Auto-generated method stub
		super.display_info();
		System.out.println("Benefits: " + this.benefits);
		System.out.println("Salary: " + getSalary());
	}
	
	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		super.calculate_salary();
		setSalary(getSalary() + this.benefits);
	}

	
	
	
}
