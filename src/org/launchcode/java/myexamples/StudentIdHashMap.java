package org.launchcode.java.myexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIdHashMap {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int id;
        String temp;

        System.out.println("Enter your students (or ENTER to finish):");
        
        // Get student id and name
        do {
            System.out.print("Student ID: ");
            temp = in.nextLine();
            if (!temp.equals("")) {
                id = Integer.parseInt(temp);
                System.out.print("Student Name: ");
                String name = in.nextLine();
                students.put(id, name);
            }

        } while(!temp.equals(""));
        
        while (!temp.equals("")) {
        	
        }

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Key: " + student.getKey() + " value: " + student.getValue() + ".");
        }

    }

}
