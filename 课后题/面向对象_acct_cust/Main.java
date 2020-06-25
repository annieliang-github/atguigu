package bank;

public class Main{
    
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");
		Account acct = new Account(1000, 2000, 0.0123);
		
		cust.setAccount(acct);
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		
		System.out.println("Customer[" + cust.getLastName() + " " + cust.getFirstName() +
				"] has a account: id is " + acct.getId() + ", annualInterestRate is " + 
				acct.ageAnnualInterestRate() * 100 + "%, balance is " + acct.getBalance()); 
		
	}
}

