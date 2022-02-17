package project2;

public class Tetrahedron extends ThreeDimensionalShape {

	private double edge;
	
	public Tetrahedron(double edge) {
		super("Tetrahedron");
		this.edge = edge;
	}
	
	public String getShapeName() {
		return super.getShapeName();
	}
	
	public String getDimension() {
		return super.getDimension();
	}

	@Override
	public double getArea() {
		return Math.sqrt(3) * (edge * edge);
	}

	@Override
	public double getVolume() {
		return (edge * edge * edge) / (6.0 * Math.sqrt(2));
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
