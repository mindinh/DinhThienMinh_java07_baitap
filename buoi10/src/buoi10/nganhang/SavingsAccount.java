package buoi10.nganhang;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	public SavingsAccount(String no, String holder, double rate) {
		super(no, holder);
		this.interestRate = rate;
		
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void addInterest() {
		setBalance(getBalance() * (1 + this.interestRate)); 
	}
	
}
