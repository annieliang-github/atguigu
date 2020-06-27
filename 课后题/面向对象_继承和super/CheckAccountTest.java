package experiment;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount acct = new CheckAccount(1122, 20000.0, 0.045, 5000.0);
		
		acct.withdraw(5000);
		System.out.println(acct.overdraft);
		
		acct.withdraw(18000);
		System.out.println(acct.getBalance());
		System.out.println(acct.overdraft);
		
		acct.withdraw(3000);
		System.out.println(acct.getBalance());
		System.out.println(acct.overdraft);
		
	}
}
