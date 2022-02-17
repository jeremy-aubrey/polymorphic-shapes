package project2;

public class Triangle extends TwoDimensionalShape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
	}
	
	public String getShapeName() {
		return super.getShapeName();
	}
	
	public String getDimension() {
		return super.getDimension();
	}

	@Override
	public double getArea() {
		return (base * height) / 2.0;
	}

	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n", 
				"Shape:", getShapeName(), 
				"Dimension:", getDimension(),
				"Area:", String.format("%.1f", getArea()));
	}
	
}
