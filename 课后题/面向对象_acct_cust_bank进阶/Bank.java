package Exercise;

public class Bank {
	private Customer[] customers = new Customer[10];
	private int numberOfCustomer;
	
	public Bank() {
	}
	
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
	}
	
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index) {
		if (index >= 0 && index < numberOfCustomer) {
			return customers[index];
		}
		return null;
	}
	
	
}
