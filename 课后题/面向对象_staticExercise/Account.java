package staticExercise;

public class Account {
	
	private int id;
	private String password = "000000";
	private int balance;
	private static double interestRate;
	private static double minBalance = 1.0;
	
	private static int init = 1001; //generate id;
	
	//constructor
	
	public Account() {
		super();
		id = init++;
	}
	
	public Account(String password, int balance) {
		super();
		id = init++;
		this.password = password;
		this.balance = balance;
	}
 
	public String getPassword() {
		return password;
	}

	

	

	public void setPassword(String password) {
		this.password = password;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}

	public static double getMinBalance() {
		return minBalance;
	}

	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}

	public int getId() {
		return id;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
