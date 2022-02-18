//******************************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     Tetrahedron.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   A concrete class for a tetrahedron that extends ThreeDimensionalShape 
//                 which extends Shape.
//
//******************************************************************************

package project2;

public class Tetrahedron extends ThreeDimensionalShape {

	private double edge;
	
	// constructor
	public Tetrahedron(double edge) {
		
		super("Tetrahedron");
		
		// validation 
		if(edge > 0) {
			this.edge = edge;
		} else {
			this.edge = 0;
		}
		
	}// end constructor
	
   //***************************************************************
   //
   //  Method:       getShapeName (Non Static)
   // 
   //  Description:  Returns the name of the shape by calling super
   //                class method.
   //
   //  Parameters:   None
   //
   //  Returns:      String
   //
   //***************************************************************
	public String getShapeName() {
		
		return super.getShapeName();
		
	}// end getShapeName method
	
   //***************************************************************
   //
   //  Method:       getDimension (Non Static)
   // 
   //  Description:  Returns the dimension of the shape by calling super
   //                class method.
   //
   //  Parameters:   None
   //
   //  Returns:      String
   //
   //***************************************************************
	public String getDimension() {
		
		return super.getDimension();
		
	}//end getDimension method

    //***************************************************************
    //
    //  Method:       getArea (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getArea method 
    //                of Shape. Calculates and returns the area of a
    //                tetrahedron.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getArea() {
		
		return Math.sqrt(3) * (edge * edge);
		
	}// end getArea method

    //***************************************************************
    //
    //  Method:       getVolume (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getVolume method 
    //                of ThreeDimensionalShape. Calculates and returns the 
    //                volume of a tetrahedron.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getVolume() {
		
		return (edge * edge * edge) / (6.0 * Math.sqrt(2));
		
	}// end getVolume
	
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
	
}// end Tetrahedron class