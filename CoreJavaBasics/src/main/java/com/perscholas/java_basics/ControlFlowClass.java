package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowClass {

	public static void main(String[] args) {

		// question #1
		System.out.println("Question #1");

		int x1 = 7;

		if (x1 < 10) {
			System.out.println("Less than 10");
		}

		x1 = 15;

		if (x1 < 10) {
			System.out.println("Less than 10");
		}

		// question #2
		System.out.println("Question #2");

		int x2 = 7;

		if (x2 < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}

		x2 = 15;

		if (x2 < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}

		// question #3
		System.out.println("Question #3");

		int x3 = 15;

		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 >= 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}

		x3 = 50;

		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 >= 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}

		// question #4
		System.out.println("Question #4");

		int x4 = 15;

		if (x4 >= 10 && x4 <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}

		x4 = 5;

		if (x4 >= 10 && x4 <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}

		// question #5
		System.out.println("Question #5");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sore:");
		int userScore = scan.nextInt();

		if (userScore >= 90 && userScore <= 100) {
			System.out.println("Your grade is: A");
		} else if (userScore >= 80) {
			System.out.println("Your grade is: B");
		} else if (userScore >= 70) {
			System.out.println("Your grade is: C");
		} else if (userScore >= 60) {
			System.out.println("Your grade is: D");
		} else if (userScore < 60 && userScore >= 0) {
			System.out.println("Your grade is: F");
		} else {
			System.out.println("Score out of range");
		}

		// scan.close();

		// question #6
		System.out.println("Question #6");

		// Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 1 and 7:");

		int userDay = scan.nextInt();

		switch (userDay) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
		}

		scan.close();

	}

}
