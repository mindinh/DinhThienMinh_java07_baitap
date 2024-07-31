package buoi10.nganhang;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount(String no, String holder, double limit) {
		super(no, holder);
		this.overdraftLimit = limit;
		
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > getBalance() + this.overdraftLimit) {
			System.out.println("You have withdrawn an amount exceeded limit!");
		}
		else {
			if (amount < getBalance())
				setBalance(getBalance() - amount);
			else
				setBalance(0);
		}
		
	}
}
