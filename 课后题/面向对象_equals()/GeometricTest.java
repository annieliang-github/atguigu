package object;

public class GeometricTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.3);
		Circle c2 = new Circle(2.5, "white", 2.0);
		
		System.out.println(c1.getColor().equals(c2.getColor()));
	
		System.out.println(c1.equals(c2));
	
		System.out.println(c1.toString());
	
	}
}
