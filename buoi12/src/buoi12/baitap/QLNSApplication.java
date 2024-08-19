package buoi12.baitap;

import java.util.Scanner;

public class QLNSApplication {
	
	public static void pause() {
		System.out.println("Enter to continue.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int choice;
		Company c = new Company();
		
		
		
		do {
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
					pause();
					sc.nextLine();
					break;
				case 2:
					c.assignEmployeeToDepartmentHead();
					pause();
					sc.nextLine();
					break;
				case 3:
					c.insertAPersonnel();
					pause();
					sc.nextLine();
					break;
				case 4:
					c.removeAPersonnel();
					pause();
					sc.nextLine();
					break;
				case 5:
					c.outputCompanyPersonnel();
					pause();
					sc.nextLine();
					break;
				case 6:
					c.totalCompanySalary();
					pause();
					sc.nextLine();
					break;
				case 7:
					c.findHighestPaidEmployee();
					pause();
					sc.nextLine();
					break;
				case 8:
					c.findMaxNumOfEmpsOfHeads();
					pause();
					sc.nextLine();
					break;
				case 9:
					c.sortPersonnelAlphabet();
					pause();
					sc.nextLine();
					break;
				case 10:
					c.sortPersonnelSalaryDesc();
					pause();
					sc.nextLine();
					break;
				case 11:
					c.findDirectorWithMostShares();
					pause();
					sc.nextLine();
					break;
				case 12:
					c.eachDirectorIncome();
					pause();
					sc.nextLine();
					break;
				
			}
		} while (choice != -1);
		
		
		
		
		
		
		sc.close();

	}

}
