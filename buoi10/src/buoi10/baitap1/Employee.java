package buoi10.baitap1;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	public Employee(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display_info() {
		System.out.println("Name " + this.name + " Age " + this.age);
		
	}
	
	public void calculate_salary() {
		this.salary = 1000;
	}
	
	
}
