package experiment;

public class CheckAccount extends Account {
	
	double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			super.withdraw(amount);
			System.out.println(getBalance());
		} else if (amount <= getBalance() + overdraft){
			overdraft -= (amount - getBalance());
			setBalance(0);
			System.out.println("Successful with overdraft");
		} else {
			System.out.println("Exceed overdraft amount!");
		}
	}
}
