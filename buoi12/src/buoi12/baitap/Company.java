package buoi12.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Company implements ManageCompany {
	private String name;
	private String taxCode;
	private double monthlyRevenue;
	private ArrayList<Personnel> person;
	
	public Company() {
		this.person = new ArrayList<Personnel>();
		
	}
	
	public void inputCompany() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter company name: ");
			this.name = sc.nextLine();
			
			System.out.println("Enter company tax code: ");
			this.taxCode = sc.nextLine();
			
			if (this.name == "" || this.taxCode == "") {
				System.out.println("Invalid company info!");
				
			}
		} while (this.name == "" || this.taxCode == "");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTaxCode() {
		return taxCode;
	}
	
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	
	public double getMonthlyRevenue() {
		return monthlyRevenue;
	}
	
	public void setMonthlyRevenue(double monthlyRevenue) {
		this.monthlyRevenue = monthlyRevenue;
	}
	
	@Override
	public void outputCompanyPersonnel() {
		System.out.println("Name " + this.name + " TaxCode " + this.taxCode);
		int i = 0;
		// TODO Auto-generated method stub
		System.out.println("-------Directors board-------");
		for (Personnel p : this.person) {
			if (p instanceof Director) {
				System.out.print(i + " ");
				p.outputPersonnel();
			}
			i++;
		}
		i = 0;
		System.out.println("-------Departmenthead board-------");
		for (Personnel p : this.person) {
			if (p instanceof DepartmentHead) {
				System.out.print(i + " ");
				p.outputPersonnel();
			}
			i++;
		}
		
		System.out.println("-------Employee board-------");
		i = 0;
		for (Personnel p : this.person) {
			if (p instanceof Employee) {
				System.out.print(i + " ");				
				p.outputPersonnel();
			}
			i++;
		}
	}
	
	@Override
	public void inputCompanyPersonnel() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i = 0;
		
		try {
			System.out.println("Enter number of personnel: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid number of personnel!");
			return;
		}
		
		while (i < n) {
			String type;
			System.out.println("Enter personnel role 1/Director 2/Departmenthead 3/Employee");
			type = sc.nextLine();
			
			if (type == "1" || type == "director") {
				Personnel p = new Director();
				p.inputPersonnel();
				this.person.add(p);
				i += 1;
			}
			else if (type == "2" || type == "departmenthead") {
				Personnel p = new DepartmentHead();
				p.inputPersonnel();
				this.person.add(p);
				i += 1;
			}
			else if (type == "3" || type == "employee") {
				Personnel p = new Employee();
				p.inputPersonnel();
				this.person.add(p);
				i += 1;
			}
			else {
				System.out.println("Invalid role");
			}
		}
		
	}
	
	@Override
	public boolean findPersonnelById(String id) {
		// TODO Auto-generated method stub
		for (Personnel p : this.person) {
			if (p.getEmpId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void insertAPersonnel() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int type;
		try {
			System.out.println("Enter personnel role 1/Director 2/Departmenthead 3/Employee");
			type = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid role");
			return;
		}
		
		
		if (type == 1) {
			Personnel p = new Director();
			p.inputPersonnel();
			if (this.findPersonnelById(p.getEmpId())) {
				System.out.println("EmpId already exists");
			}
			else {
				this.person.add(p);
			}
		}
		else if (type == 2) {
			Personnel p = new DepartmentHead();
			p.inputPersonnel();
			if (this.findPersonnelById(p.getEmpId())) {
				System.out.println("EmpId already exists");
			}
			else {
				this.person.add(p);
			}
			
		}
		else if (type == 3) {
			Personnel p = new Employee();
			p.inputPersonnel();
			if (this.findPersonnelById(p.getEmpId())) {
				System.out.println("EmpId already exists");
			}
			else {
				this.person.add(p);
			}
		}
		else {
			System.out.println("Invalid role");
		}
	}
	
	@Override
	public void removeAPersonnel() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pos;
		
		
		System.out.println("Enter a personnel pos: ");
		pos = sc.nextInt();
		try {
			 Personnel p = this.person.remove(pos);	
			 if (p instanceof DepartmentHead) {
				 ((DepartmentHead) p).removeManagedEmployees();
				 System.out.println("a head");
			 }
		} catch (Exception e) {
			System.out.println("Invalid pos!");
			return;
		}	
		
	}
	
	@Override
	public void assignEmployeeToDepartmentHead() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pos;
		try {
			System.out.println("Enter a Departmenthead pos: ");
			pos = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Pos invalid!");
			return;
		}
		
		if (this.person.get(pos) instanceof DepartmentHead) {
			DepartmentHead d = (DepartmentHead) this.person.get(pos);
			
			System.out.println("Enter number of employees: ");
			int n = sc.nextInt();
			int i = 0;
			while (i < n) {
				System.out.println("Enter a Employee pos: ");
				int empPos = sc.nextInt();
				
				if (this.person.get(empPos) instanceof Employee) {
					Employee e = (Employee) this.person.get(empPos);
					d.addEmployee(e);
					e.setHead(d);
					i += 1;
				}
				else {
					System.out.println("Personnel is not an Employee!");
				}
			}
			
		}
		else {
			System.out.println("Personnel is not a Departmenthead!");
		}
	}
	
	@Override
	public void findHighestPaidEmployee() {
		// TODO Auto-generated method stub
		double max = Double.MIN_VALUE;
		Employee e = new Employee();
		
		for (Personnel p : this.person) {
			if (p instanceof Employee) {
				double sal = p.calcSalary();
				if (sal > max) {
					max = sal;
					e = (Employee)p;
				}
			}
		}
		
		System.out.println("-----Employee with highest salary: ");
		for (Personnel p : this.person) {
			if (p instanceof Employee) {
				double sal = p.calcSalary();
				if (sal == max) {
					p.outputPersonnel();
				}
			}
		}
		
		
	}
	
	@Override
	public void findMaxNumOfEmpsOfHeads() {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		DepartmentHead d = new DepartmentHead();
		
		for (Personnel p : this.person) {
			if (p instanceof DepartmentHead) {
				
				if (((DepartmentHead)p).getNumOfEmp() > max) {
					d = (DepartmentHead)p;
					max = d.getNumOfEmp();
				}
			}
		}
		
		System.out.println("-----Department Head with most number of employees");
		for (Personnel p : this.person) {
			if (p instanceof DepartmentHead) {
				if (((DepartmentHead)p).getNumOfEmp() == max) {
					p.outputPersonnel();
				}
			}
		}
		
	}
	
	@Override
	public double totalCompanySalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0;
		
		for (Personnel p : this.person) {
			totalSalary += (p.calcSalary());
		}
		
		System.out.println("Total company salary: " + totalSalary);
		return totalSalary;
	}
	
	@Override
	public void findDirectorWithMostShares() {
		// TODO Auto-generated method stub
		double maxShares = Double.MIN_VALUE;
		Director d = new Director();
		
		for (Personnel p : this.person) {
			if (p instanceof Director) {
				
				if (((Director)p).getShares() > maxShares) {
					d = (Director)p;
					maxShares = d.getShares();
				}
			}
		}
		
		System.out.println("-----Director with most shares");
		d.outputPersonnel();
	}	
	
	@Override
	public void eachDirectorIncome() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Enter company month revenue: ");
			this.monthlyRevenue = sc.nextDouble();
			
			if (this.monthlyRevenue <= 0) {
				System.out.println("Revenue must be > 0");
				sc.nextLine();
			}
		} while (this.monthlyRevenue <= 0);
		
		double profit = this.monthlyRevenue - this.totalCompanySalary();
		
		
		for (Personnel p : this.person) {
			if (p instanceof Director) {
				double income = ((Director)p).calcSalary() + (profit > 0 ? ((Director)p).getShares() * profit : 0);
				p.outputPersonnel();
				System.out.println("Income " + income);					
			
			}
		}
	}
	
	@Override
	public void sortPersonnelAlphabet() {
		// TODO Auto-generated method stub
		this.person.sort((a, b) -> a.getFullName().compareToIgnoreCase(b.getFullName()));
	}
	
	@Override
	public void sortPersonnelSalaryDesc() {
		// TODO Auto-generated method stub
		this.person.sort((a, b) -> (int)(b.calcSalary() - a.calcSalary()));
	}
}
