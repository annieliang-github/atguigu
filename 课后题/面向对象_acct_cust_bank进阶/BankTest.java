package Exercise;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Tom", "Lee");
		System.out.println(bank.getCustomer(0).getFirstName());
		
		bank.addCustomer("Jerry", "Smith");
		
		bank.getCustomer(1).setAccount(new Account(5000));
		bank.getCustomer(1).getAccount().deposit(50);
		System.out.println("Customer " + bank.getCustomer(1).getLastName() + " has a balance of " +
		bank.getCustomer(1).getAccount().getBalance());
	
		bank.getCustomer(0).setAccount(new Account(300));
		System.out.println(bank.getNumOfCustomers());
	}
}
