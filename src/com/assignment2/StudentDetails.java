package com.assignment2;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Full Name with Initial: ");
        String fullName = sc.nextLine();
        
        System.out.print("Enter your Roll Number: ");
        int rollno = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter your Grade: ");
        String Grade = sc.nextLine();
        
        System.out.print("Enter your percentage: ");
        int per = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.println("full name of student is "+fullName);
        System.out.println("Roll Number of student is "+rollno);
        System.out.println("Grade of the student is "+Grade);
        System.out.println("Grade of the student is "+per +"%");
        sc.close();
	}
}
