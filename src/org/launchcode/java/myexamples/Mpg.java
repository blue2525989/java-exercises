package org.launchcode.java.myexamples;

import java.util.Scanner;

public class Mpg {

	static Scanner scan = new Scanner(System.in);
	
	static double mpg(double miles, double gallons) {
		double mpg = miles / gallons;
		return mpg;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Please enter the miles driven,\n");
		double miles = scan.nextDouble();
		
		System.out.printf("Please enter the gallons of gas,\n");
		double gallons = scan.nextDouble();
		
		double mpg = mpg(miles, gallons);
		
		System.out.printf("You averaged %.2f MPG", mpg);
		
	}
}
