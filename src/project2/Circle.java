package project2;

public class Circle extends TwoDimensionalShape {
	
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n", "Shape:", shapeName, "Dimension:", dimension);
	}

}
