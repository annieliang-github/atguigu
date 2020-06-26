package com.atguigu.project2;

public class CustomerList {
	private Customer[] customers;
	private int total = 0;
	
	
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
		} else {
			customers[total] = customer;
			total++;
			return true;
		}
	}
	
	public boolean replaceCustomer(int index, Customer cust) {
		if (index >= 0 && index < total) {
			customers[index] = cust;
			return true;
		} 
		return false;
	}
	
	public boolean deleteCustomer(int index) {
		if (index >= 0 && index < total) {
			for (int i = index; i < total - 1; i++) {
				customers[i] = customers[i + 1];
			}
			customers[total - 1] = null; //last index change to null
			total--; //modify total number of index 
			return true;
		} 
		return false;
	}
	
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
		
	}
	
	public Customer getCustomer(int index) {
		if (index >= 0 && index < total) {
			return customers[index];
		}
		return null;
	}
	
	
	public int getTotal() {
		return total;
	}
	
	

}
