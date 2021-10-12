package com.automation.org;

import java.util.Scanner;

public class Scanner_Concepts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence");

		String sentence = sc.nextLine();

		System.out.println("Entered : " + sentence);

		System.out.println("Enter your id");

		// ctrl+2, L
		int id = sc.nextInt();

		System.out.println("My id is " + id);

		System.out.println("Enter your name");

		String name = sc.next();
		String name1 = sc.next();
		String initial = sc.next();

		System.out.println("My name is " + name + " " + name1 + "." + initial);

		System.out.println("Enter your percentage");

		double percentage = sc.nextDouble();

		System.out.println("My percentage is " + percentage);
	}

}
