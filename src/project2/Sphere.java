//******************************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     Sphere.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   A concrete class for a sphere that extends ThreeDimensionalShape 
//                 which extends Shape.
//
//******************************************************************************

package project2;

public class Sphere extends ThreeDimensionalShape {

	private double radius;
	
	// constructor
	public Sphere(double radius) {
		
		// validation 
		if(radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
		
	}// end constructor
	
    //***************************************************************
    //
    //  Method:       getArea (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getArea method 
    //                of Shape. Calculates and returns the area of a sphere.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getArea() {
		
		return 4.0 * PI * (radius * radius);
		
	}// end getArea method
	
    //***************************************************************
    //
    //  Method:       getVolume (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getVolume method 
    //                of ThreeDimensionalShape. Calculates and returns the 
    //                volume of a sphere.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getVolume() {
		
		return (4.0/3.0) * PI * (radius * radius * radius);
		
	}// end getVolume method
	
    //***************************************************************
    //
    //  Method:       toString (Non Static)
    // 
    //  Description:  Returns a formatted shape description including 
    //                its name, dimension, area, and volume.
    //	
    //  Parameters:   None
    //
    //  Returns:      String 
    //
    //***************************************************************
	@Override
	public String toString() {
		
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n%-10s %s%n", 
			"Shape:", getShapeName(), 
			"Dimension:", getDimension(),
			"Area:", String.format("%.1f", getArea()),
			"Volume:", String.format("%.1f", getVolume()));
		
	}// end toString method

}// end Sphere class