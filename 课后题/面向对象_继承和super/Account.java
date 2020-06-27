package experiment;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {
		
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Your balance is: " + balance);
			System.out.println("Monthly interest rate is: " + getMonthlyInterest());
		} else {
			System.out.println("Not enough money!\nYour balance is: " + balance);
		}
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	
	
	
	

}
