package project2;

public class Square extends TwoDimensionalShape {
	
	private double length;
	
	public Square(double length) {
		super("Square");
		this.length = length;
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
