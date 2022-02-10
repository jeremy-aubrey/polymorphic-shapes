package project2;

public abstract class TwoDimensionalShape extends Shape {

	private final String shapeName;
	private final String dimension = "Two-Dimensional";
	
	//constructor
	public TwoDimensionalShape (String shapeName) {
		this.shapeName = shapeName;
	}
	
	public String getFirstName() {
		return shapeName;
	}
	
	public String getDimension() {
		return dimension;
	}
	
}
