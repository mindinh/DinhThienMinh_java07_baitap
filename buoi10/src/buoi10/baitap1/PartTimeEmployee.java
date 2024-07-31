package buoi10.baitap1;

public class PartTimeEmployee extends Employee {
	private double hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String _name, int _age, double _worked, double _rate) {
		super(_name, _age);
		this.hoursWorked = _worked;
		this.hourlyRate = _rate;
	}
	
	public double getHours_worked() {
		return hoursWorked;
	}

	public void setHours_worked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourly_rate() {
		return hourlyRate;
	}

	public void setHourly_rate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public void display_info() {
		// TODO Auto-generated method stub
		super.display_info();
		System.out.println("Hours worked " + this.hoursWorked + " with " + this.hourlyRate + "/h");
		System.out.println("Salary: " + getSalary());
	}
	
	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		super.calculate_salary();
		setSalary(getSalary() * hourlyRate * hoursWorked);
	}
}
