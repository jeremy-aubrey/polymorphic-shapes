package project2;

public class Tetrahedron extends ThreeDimensionalShape {

	private double edge;
	
	public Tetrahedron(double edge) {
		super("Tetrahedron");
		this.edge = edge;
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
