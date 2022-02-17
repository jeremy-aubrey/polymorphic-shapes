package project2;

public class Sphere extends ThreeDimensionalShape {

	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public String getShapeName() {
		return super.getShapeName();
	}
	
	public String getDimension() {
		return super.getDimension();
	}
	
	@Override
	public double getArea() {
		return 4.0 * PI * (radius * radius);
	}
	
	@Override
	public double getVolume() {
		return (4.0/3.0) * PI * (radius * radius * radius);
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n%-10s %s%n", 
				"Shape:", getShapeName(), 
				"Dimension:", getDimension(),
				"Area:", String.format("%.1f", getArea()),
				"Volume:", String.format("%.1f", getVolume()));
	}

}
