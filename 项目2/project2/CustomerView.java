package com.atguigu.project2;

public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	public CustomerView() {
		Customer customer = new Customer("Tom", 'M', 30, "682-444-8561", "123@gmail.com");
		customerList.addCustomer(customer);
	}

	public void enterMainMenu() {
		boolean loopFlag = true;

		while (loopFlag) {
			System.out.println("\n----------Customer Information----------\n");
			System.out.println("              1 add a new Client           \n");
			System.out.println("              2 modify a Client            \n");
			System.out.println("              3 delete a Client            \n");
			System.out.println("              4 list of Clients            \n");
			System.out.println("              5 exit the program            \n");
			System.out.println("             Please choose (1-5):           \n");

			char key = CMUtility.readMenuSelection();
			System.out.println();
			switch (key) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.println("Are you sure you want to exit? Y/N");
				char ans = CMUtility.readConfirmSelection();
				if (ans == 'Y') {
					loopFlag = false;
				}
			}
		}

	}

	public void addNewCustomer() {
		System.out.println("\n----------Adding Customer----------\n");
		System.out.println("Name:");
		String name = CMUtility.readString(20);
		System.out.println("Gender: (M/F)");
		char gender = CMUtility.readChar();
		System.out.println("Age");
		int age = CMUtility.readInt();
		System.out.println("Phone:");
		String phone = CMUtility.readString(15);
		System.out.println("Email:");
		String email = CMUtility.readString(30);

		Customer cust = new Customer(name, gender, age, phone, email);
		boolean flag = customerList.addCustomer(cust);

		if (flag) {
			System.out.println("\n----------Adding Complete----------\n");
		} else {
			System.out.println("\n----------System is FULL-----------\n");
		}

	}

	public void modifyCustomer() {
		System.out.println("\n----------Modifying Customer----------\n");
		Customer cust;
		int number;
		for (;;) {
			System.out.println("Please enter customer index (exit:-1)");
			number = CMUtility.readInt();

			if (number == -1) {
				return;
			}

			cust = customerList.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("Cannot find customer!");
			} else {
				break;
			}
		}

		// change information:
		System.out.println("Name(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());

		System.out.println("Gender(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());

		System.out.println("Age(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());

		System.out.println("Phone(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(15, cust.getPhone());

		System.out.println("Email(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);

		if (isReplaced) {
			System.out.println("\n----------Modify Complete----------\n");
		} else {
			System.out.println("\n----------Modify Failed----------\n");
		}

	}

	public void deleteCustomer() {
		System.out.println("\n----------Deleting Customer----------\n");

		Customer customer;
		int num;
		for (;;) {
			System.out.println("Please enter customer index (exit:-1)");
			num = CMUtility.readInt();

			if (num == -1) {
				return;
			}

			customer = customerList.getCustomer(num - 1);
			if (customer == null) {
				System.out.println("Cannot find customer!");
			} else {
				break;
			}
		}
		
		System.out.println("Are you sure you want to delete? Y/N");
		char isDelete = CMUtility.readConfirmSelection();

		if (isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(num - 1);
			if (deleteSuccess) {
				System.out.println("\n----------Delete Complete----------\n");
			} else {
				System.out.println("\n----------Delete Failed----------\n");
			}	
		} else {
			return;
		}
	}

	public void listAllCustomers() {
		System.out.println("\n----------Customer Information----------\n");
		int total = customerList.getTotal();

		if (total == 0) {
			System.out.println("No record yet!");
		} else {
			System.out.println("number\tname\tgender\tage\t\tphone\t\temail");
			Customer[] custs = customerList.getAllCustomers();
			for (int i = 0; i < total; i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getDetails());
			}
		}

		System.out.println("\n---------End of all Information----------\n");

	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
