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
		return String.format("%-10s %s%n%-9s %s%n", "Shape:", getShapeName(), "Dimension:", getDimension());
	}
	
}
