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
		return length * length;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n", 
				"Shape:", getShapeName(), 
				"Dimension:", getDimension(),
				"Area:", String.format("%.1f", getArea()));
	}
	
}
