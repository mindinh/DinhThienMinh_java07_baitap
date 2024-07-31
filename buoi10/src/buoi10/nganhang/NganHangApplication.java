package buoi10.nganhang;

public class NganHangApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount a = new SavingsAccount("A123", "ewte", 0.45);
		a.deposit(2000);
		a.addInterest();
		a.withdraw(2100);
		
		System.out.println("\n");
		
		CheckingAccount b = new CheckingAccount("B123", "tyetw", 200);
		b.deposit(2000);
		b.withdraw(2300);
		
		System.out.println("\n");

		a.displayInfo();
		System.out.println("\n");
		b.displayInfo();
	}

}
