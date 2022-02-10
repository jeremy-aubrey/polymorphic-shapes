//********************************************************************
//
//  Developer:     Instructor
//
//  Project #:     Two
//
//  File Name:     TwoDimensionalShape.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/13/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   Abstract class that extends Shape class. Parent class
//                 for 2D concrete shape classes.
//
//********************************************************************

package project2;

public abstract class TwoDimensionalShape extends Shape {

	protected final String shapeName;
	protected final String dimension = "Two-Dimensional";
	
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
	
}//end TwoDimensionalShape class
