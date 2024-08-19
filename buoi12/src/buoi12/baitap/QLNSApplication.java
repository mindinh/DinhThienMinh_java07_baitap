package buoi12.baitap;

import java.util.Scanner;

public class QLNSApplication {
	
	public static void pause() {
		System.out.println("Enter to continue.");
	}
	
	public static void menu() {
		System.out.println("1. Input company");
		System.out.println("2. Assign employees to department head");
		System.out.println("3. Insert a personnel");
		System.out.println("4. Remove a personnel");
		System.out.println("5. Output company personnel");
		System.out.println("6. Total salary");
		System.out.println("7. Highest salary employee");
		System.out.println("8. Department head with most employees");
		System.out.println("9. Sort personnel in alphabetical order");
		System.out.println("10. Sort personnel in decreasing salary");
		System.out.println("11. Director with most shares");
		System.out.println("12. Each director income");
		System.out.println("-1. Exit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int choice;
		Company c = new Company();
		
		
		
		do {
			menu();
			try {
				System.out.println("Enter a function to perform: ");
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid choice");
				sc.close();
				return;
			}
			switch (choice) {
				case 1:
					c.inputCompany();
					
					break;
				case 2:
					c.assignEmployeeToDepartmentHead();
					
					break;
				case 3:
					c.insertAPersonnel();
					
					break;
				case 4:
					c.removeAPersonnel();
					
					break;
				case 5:
					c.outputCompanyPersonnel();
					
					break;
				case 6:
					c.totalCompanySalary();
					
					break;
				case 7:
					c.findHighestPaidEmployee();
					
					break;
				case 8:
					c.findMaxNumOfEmpsOfHeads();
					
					break;
				case 9:
					c.sortPersonnelAlphabet();
					
					break;
				case 10:
					c.sortPersonnelSalaryDesc();
					
					break;
				case 11:
					c.findDirectorWithMostShares();
					
					break;
				case 12:
					c.eachDirectorIncome();
					
					break;
			}
			
		} while (choice != -1);
		
		
		
		
		
		
		sc.close();

	}

}
