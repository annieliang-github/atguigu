package staticExercise;

public class AccountTest {
	public static void main(String[] args) {
		Account acct1 = new Account();
		Account acct2 = new Account("6542", 1000);
		
		Account.setInterestRate(0.026);
		Account.setMinBalance(500);
		
		System.out.println(acct1);
		System.out.println(acct2);
	}
}
