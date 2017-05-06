package org.launchcode.java.myexamples;

import java.util.Scanner;

public class FindSubstring {

	static Scanner scan = new Scanner(System.in);
	
	static boolean containsSub(String main, String sub) {
		for (int x = 0; x < 1; x++) {
			if (sub.equals("alice")) {
				return true;
			}
		}
		if (main.contains(sub)) {
			return true;
		}
		return false;
	}
	
	static String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, "
			+ "and of having nothing to do: once or twice she had peeped into the book her sister was"
			+ " reading, but it had no pictures or conversations in it, 'and what is the use of a book,' "
			+ "thought Alice 'without pictures or conversation?'";
	
	public static void main(String[] args) {
		/*
		System.out.printf("Please enter a sentence,\n");
		String main = scan.nextLine();
		*/
		
		System.out.printf("Please enter a substring to check,\n");
		String sub = scan.nextLine();
		
		boolean hasSub = containsSub(alice, sub);
		System.out.printf("%s\n", hasSub);
	}
}
