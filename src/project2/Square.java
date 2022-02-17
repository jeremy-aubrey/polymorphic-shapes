package project2;

public class Square extends TwoDimensionalShape {
	
	private double length;
	
	public Square(double length) {
		super("Square");
		this.length = length;
	}

	public String getShapeName() {
		return super.getShapeName();
	}
	
	public String getDimension() {
		return super.getDimension();
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n", "Shape:", getShapeName(), "Dimension:", getDimension());
	}
	
}
