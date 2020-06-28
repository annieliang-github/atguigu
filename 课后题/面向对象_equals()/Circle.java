package object;

public class Circle extends GeometricObject {
	
	private double radius;
	
	public Circle() {
		super();
		color = "white";
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Circle) {
			Circle circle = (Circle)obj;
			return this.radius == circle.radius;
		}
		return false;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
}
