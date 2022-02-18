//********************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     ThreeDimensionalShape.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   Abstract class that extends Shape class. Parent class
//                 for concrete 3D shape classes.
//
//********************************************************************

package project2;

public abstract class ThreeDimensionalShape extends Shape {
	
	private final String dimension = "Three-Dimensional";
	
   //***************************************************************
   //
   //  Method:       getDimension (Non Static)
   // 
   //  Description:  Returns the dimension of the shape.
   //
   //  Parameters:   None
   //
   //  Returns:      String
   //
   //***************************************************************
	public String getDimension() {
		
		return dimension;
		
	}//end getDimension method
	
   //***************************************************************
   //
   //  Method:       getVolume (Abstract)
   // 
   //  Description:  Must be implemented in concrete 3D subclasses.
   //
   //  Parameters:   None
   //
   //  Returns:      double
   //
   //***************************************************************
	public abstract double getVolume();
	
}//end ThreeDimensionalShape class