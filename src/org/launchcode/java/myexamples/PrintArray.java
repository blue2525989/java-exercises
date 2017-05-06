package org.launchcode.java.myexamples;

public class PrintArray {
	
	public static void main(String[] args) {
		// added the 10 and padded with zero ;)
		int[] nums = {1, 1, 2, 3, 5, 8, 10};
		for (int num : nums) {
			System.out.printf("%02d\n", num);
		}
	}

}
