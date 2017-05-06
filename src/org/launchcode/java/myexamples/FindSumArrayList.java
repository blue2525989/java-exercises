package org.launchcode.java.myexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSumArrayList {
	
	static Scanner scan = new Scanner(System.in);
	
	static int sumArrayList(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();		
		for (int i = 0; i < 10; i++) {
			double rand =  Math.random() * 100;
			int rando = (int) rand;
			nums.add(rando);
		}
		
		int sum = sumArrayList(nums);
		System.out.printf("The sum of the list = %d\n", sum);
	}

}
