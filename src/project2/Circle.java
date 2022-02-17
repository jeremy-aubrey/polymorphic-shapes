//******************************************************************************
//
//  Developer:     Jeremy Aubrey
//
//  Project #:     Project 2
//
//  File Name:     Circle.java
//
//  Course:        COSC 4301 - Modern Programming
//
//  Due Date:      2/20/2022
//
//  Instructor:    Fred Kumi 
//
//  Description:   A concrete class for a circle that extends TwoDimensionalShape 
//                 which extends Shape.
//
//******************************************************************************

package project2;

public class Circle extends TwoDimensionalShape {
	
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public String getShapeName() {
		return super.getShapeName();
	}
	
	public String getDimension() {
		return super.getDimension();
	}
	
	@Override
	public double getArea() {
		return PI * (radius * radius);
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %s%n%-9s %s%n%-10s %s%n", 
				"Shape:", getShapeName(), 
				"Dimension:", getDimension(),
				"Area:", String.format("%.1f", getArea()));
	}

}
