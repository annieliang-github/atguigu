package Exercise;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account acct) {
		this.account = acct;
	}
	
	
	
}
