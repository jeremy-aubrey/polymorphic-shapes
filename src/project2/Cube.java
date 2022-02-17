package project2;

public class Cube extends ThreeDimensionalShape {

	private double edge;
	
	public Cube(double edge) {
		super("Cube");
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
		return 6 * (edge * edge);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n", 
				"Shape:", getShapeName(), 
				"Dimension:", getDimension(),
				"Area:", String.format("%.1f", getArea()));
	}
}
