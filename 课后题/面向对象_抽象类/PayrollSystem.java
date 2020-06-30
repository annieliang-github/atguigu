package abstractExercise;

import java.util.Scanner;

public class PayrollSystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month");
		
		int month = sc.nextInt();
		
		Employee[] employee = new Employee[2];
		
		employee[0] = new SalariedEmployee("Tom", 
				1001, new MyDate(1990, 8, 10), 5000.0);
	
		employee[1] = new HourlyEmployeed("Jerry", 
				1001, new MyDate(1992, 7, 3), 50, 240);
	
		for (int i = 0; i <employee.length; i++) {
			System.out.println(employee[i]);
			System.out.println("Salary is " + employee[i].earnings());
		
			if (month == employee[i].getBirthday().getMonth()) {
				System.out.println("Here is 100 bonus");
			}
		
		
		}
	}
}

