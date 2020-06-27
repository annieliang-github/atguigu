package experiment;

public class AccountTest {
	public static void main(String[] args) {
		Account acct = new Account(1122, 20000, 0.045);
		acct.withdraw(30000);
		System.out.println(acct.getBalance());
		
		acct.withdraw(2500);
		acct.deposit(3000);
		System.out.println(acct.getBalance());
		System.out.println(acct.getMonthlyInterest());
	}
}
