package abstractExercise;

public class HourlyEmployeed extends Employee {
	private double wage;
	private int hour;
	public HourlyEmployeed(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		
	}

	@Override
	public double earnings() {
		return wage * hour;
	}
	
	public HourlyEmployeed(String name, int number, MyDate birthday, double wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	public String toString() {
		return "HourlyEmployeed[" + super.toString() + "]";
	}
}
