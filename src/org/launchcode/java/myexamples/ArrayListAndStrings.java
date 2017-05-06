package org.launchcode.java.myexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListAndStrings {
	
	static Scanner scan = new Scanner(System.in);
	
	static void printDivFive(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).length() == 5) {
				System.out.printf("%s\n", arr.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> listy = new ArrayList<String>(Arrays.asList("Jason", "loves", "him", 
				"some", "Java", "programming!"));
		printDivFive(listy);
	}

}
