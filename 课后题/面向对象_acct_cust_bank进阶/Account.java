package Exercise;

public class Account {
	private double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	} 
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("Deposit Successful!");
		}
	}
	
	public void withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("Withdraw Successful!");
		}
		System.out.println("Not enough money");
	}
}
