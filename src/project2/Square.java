//******************************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     Square.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   A concrete class for a square that extends TwoDimensionalShape 
//                 which extends Shape.
//
//******************************************************************************

package project2;

public class Square extends TwoDimensionalShape {
	
	private double length;
	
	// constructor
	public Square(double length) {
		
		super("Square");
		
		// validation
		if(length > 0) {
			this.length = length;
		} else {
			this.length = 0;
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
		
	}// end getDimension method
	
    //***************************************************************
    //
    //  Method:       getArea (Non Static)
    // 
    //  Description:  Implements the inherited, abstract getArea method 
    //                of Shape. Calculates and returns the area of a square.
    //
    //  Parameters:   None
    //
    //  Returns:      double 
    //
    //***************************************************************
	@Override
	public double getArea() {
		
		return length * length;
		
	}//end getArea method
	
    //***************************************************************
    //
    //  Method:       toString (Non Static)
    // 
    //  Description:  Returns a formatted shape description including 
    //                its name, dimension, and area.
    //	
    //  Parameters:   None
    //
    //  Returns:      String 
    //
    //***************************************************************
	@Override
	public String toString() {
		
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n", 
			"Shape:", getShapeName(), 
			"Dimension:", getDimension(),
			"Area:", String.format("%.1f", getArea()));
		
	}// end toString method
	
}// end Square class