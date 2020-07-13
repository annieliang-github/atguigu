package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

public class Exercise {
	
	//自然排序
	@Test
	public void test1() {
		
		TreeSet set = new TreeSet();
		
		Employee e1 = new Employee("Tom", 15, new MyDate(1998, 5, 12));
		Employee e2 = new Employee("Jerry", 20, new MyDate(2004, 12, 2));
		Employee e3 = new Employee("Li", 50, new MyDate(1963, 10, 23));
		Employee e4 = new Employee("Lisa", 41, new MyDate(1978, 2, 17));
		Employee e5 = new Employee("Misa", 33, new MyDate(1982, 8, 1));
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
		
	@Test
	public void test2() {
		Comparator com = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee e1 = (Employee) o1;
					Employee e2 = (Employee) o2;
					
					MyDate b1 = e1.getBirthday();
					MyDate b2 = e2.getBirthday();
					
					int difYear = b1.getYear() - b2.getYear();
					if (difYear!= 0) {
						return difYear;
					}
					
					int difMonth = b1.getMonth() - b2.getMonth();
					if (difMonth!= 0) {
						return difMonth;
					}
					
					return b1.getDay() - b2.getDay();
					
				}
				throw new RuntimeException("not match");
			}
			
		};
		
		
		TreeSet set = new TreeSet(com);
		
		Employee e1 = new Employee("Tom", 15, new MyDate(1998, 5, 12));
		Employee e2 = new Employee("Jerry", 20, new MyDate(2004, 12, 2));
		Employee e3 = new Employee("Li", 50, new MyDate(1963, 10, 23));
		Employee e4 = new Employee("Lisa", 41, new MyDate(1978, 2, 17));
		Employee e5 = new Employee("Misa", 33, new MyDate(1982, 8, 1));
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}	
}



class Employee implements Comparable{
	private String name;
	private int age;
	private MyDate birthday;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee)o;
			return this.name.compareTo(e.getName());
		} 
		
		throw new RuntimeException("not match");
		
	}
	
}

class MyDate {
	private int year;
	private int month;
	private int day;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public MyDate() {
		super();
	}
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}















