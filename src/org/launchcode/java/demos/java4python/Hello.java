package org.launchcode.java.demos.java4python;

import java.util.*;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
    	String name = scan.nextLine();
        System.out.printf("Hello, %s, that's a nice shirt you are wearing!\n", name);
    }
}
