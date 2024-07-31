package buoi10.nganhang;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String no, String holder) {
		this.accountNumber = no;
		this.accountHolder = holder;
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposit successfully");
		}
		else {
			System.out.println("Deposit amount cant be < 0");
		}
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println("Withdraw successfully");
			
		}
		else {
			System.out.println("Balance insufficient");
		}
	}
	
	public void displayInfo() {
		System.out.println("Account No. " + this.accountNumber);
		System.out.println("Account Holder " + this.accountHolder);
		System.out.printf("Balance: %.2f", this.balance);
		
	}
}
