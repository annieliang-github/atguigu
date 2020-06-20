
public class proj1 {
	public static void main(String[] args) {
		int balance = 10000; //initial amount
		String details = "Type\tBalance\t\tAmount\t\tComment\n"; //details of income and spending

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------------Family Spending---------------\n");
			System.out.println("                   1. Summary");
			System.out.println("                   2. Income");
			System.out.println("                   3. Spending");
			System.out.println("                   4. Exit\n");
			System.out.println("                Please choose <1-4>: ");

			char selection = Utility.readMenuSelection();
			System.out.println();

			switch (selection) {
				case '1':
					System.out.println("\n------------------Current Details--------------\n");
					System.out.println(details);
					System.out.println("-----------------------------------------------");
					break;

				case '2':
					System.out.println("Amount of income?");
					int income = Utility.readNumber();
					System.out.println("Comment?");
					String comment1 = Utility.readString();
					balance += income;

					//details:
					details += "Income\t" + balance + "\t\t" + income + "\t\t" + comment1 + "\n";
					System.out.println("----------------Finish Recording---------------\n");
					break;

				case '3':
					System.out.println("Amount of spending?");
					int spend = Utility.readNumber();
					System.out.println("Comment?");
					String comment2 = Utility.readString();

					if (balance >= spend) {
						balance -= spend;
						//details:
						details += "Spend\t" + balance + "\t\t" + spend + "\t\t" + comment2 + "\n";
					} else {
						System.out.println("Not enough money!");
					}

					System.out.println("----------------Finish Recording---------------\n");
					break;

				case '4':
					System.out.println("Are you sure to exit? (Y/N):");
					char isExit = Utility.readConfirmSelection();
					if (isExit == 'Y') {
						isFlag = false;
					}
			}



		}
	}
}