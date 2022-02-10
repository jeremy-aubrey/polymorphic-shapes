package project2;

public abstract class ThreeDimensionalShape extends Shape {
	
	private final String shapeName;
	private final String dimension = "Three-Dimensional";
	
	//constructor
	public ThreeDimensionalShape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public String getFirstName() {
		return shapeName;
	}
	
	public String getDimension() {
		return dimension;
	}
	
	//must be implemented in concrete subclasses
	public abstract double getVolume();
	
}
