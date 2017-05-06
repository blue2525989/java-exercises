package org.launchcode.java.myexamples;

import java.util.Scanner;

public class Rectangle {
	
	static Scanner scan = new Scanner(System.in);
	
	static double areaOfRectangle(double l, double w) {
		double area = l * w;
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Please enter the length,\n");
		double length = scan.nextDouble();
		System.out.printf("Please enter the width,\n");
		double width = scan.nextDouble();
		double area = areaOfRectangle(length, width);
		System.out.printf("The area is %f\n", area);
		
	}

}
