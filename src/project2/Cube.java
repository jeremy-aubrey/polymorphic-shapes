//******************************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     Cube.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   A concrete class for a cube that extends ThreeDimensionalShape 
//                 which extends Shape.
//
//******************************************************************************

package project2;

public class Cube extends ThreeDimensionalShape {

	private double edge;
	
	// constructor
	public Cube(double edge) {
		
		// validation
		if(edge > 0) {
			this.edge = edge;
		} else {
			this.edge = 0;
		}
		
	}// end constructor
	
    //***************************************************************
    //
    //  Method:       getArea (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getArea method 
    //                of Shape. Calculates and returns the area of a cube.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getArea() {
		
		return 6.0 * (edge * edge);
		
	}// end getArea method

    //***************************************************************
    //
    //  Method:       getVolume (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getVolume method 
    //                of ThreeDimensionalShape. Calculates and returns the 
    //                volume of a cube.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getVolume() {
		
		return (edge * edge * edge);
		
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
	
}// end Cube class