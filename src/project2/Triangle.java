package project2;

public class Triangle extends TwoDimensionalShape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
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
