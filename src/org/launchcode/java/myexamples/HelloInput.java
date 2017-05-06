package org.launchcode.java.myexamples;

import java.util.Scanner;

public class HelloInput {
		static Scanner scan = new Scanner(System.in);
		
	    public static void main(String[] args) {
	    	String name = scan.nextLine();
	        System.out.printf("Hello, %s, that's a nice shirt you are wearing!\n", name);
	    }
	}

