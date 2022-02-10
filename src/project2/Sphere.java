package project2;

public class Sphere extends ThreeDimensionalShape {

	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n", "Shape:", shapeName, "Dimension:", dimension);
	}

}
