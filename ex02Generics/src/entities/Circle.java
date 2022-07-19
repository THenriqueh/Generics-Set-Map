package entities;

public class Circle implements Shape{
	
	private double radious;

	public Circle() {
		super();
	}

	public Circle(double radious) {
		super();
		this.radious = radious;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	@Override
	public double area() {
		return Math.PI * radious * radious;
	}
	
	

}
