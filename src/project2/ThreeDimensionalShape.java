//********************************************************************
//
//  Developer:     Instructor
//
//  Project #:     Two
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
//                 for 3D concrete shape classes.
//
//********************************************************************

package project2;

public abstract class ThreeDimensionalShape extends Shape {
	
	protected final String shapeName;
	protected final String dimension = "Three-Dimensional";
	
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
	
}//end ThreeDimensionalShape class
