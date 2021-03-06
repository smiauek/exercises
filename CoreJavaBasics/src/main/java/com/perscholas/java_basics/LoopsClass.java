package com.perscholas.java_basics;

import java.util.Iterator;

public class LoopsClass {

	public static void main(String[] args) {

		// question #1
		System.out.println("Question #1");

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		// question #2
		System.out.println("Question #2");

		int y = 0;

		while (y < 101) {
			System.out.println(y);
			y += 10;
		}

		// question #3
		System.out.println("Question #3");

		int y2 = 1;

		do {
			System.out.println(y2);
			y2++;
		} while (y2 < 11);

		// question #4
		System.out.println("Question #4");

		for (int i = 1; i < 101; i++) {
			if (i > 25 && i < 75) {
				continue;
			}

			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

		// question #5
		System.out.println("Question #5");

		for (int i = 1; i < 100; i++) {

			if (i % 5 == 0) {
				System.out.println(i);
			}

			if (i == 50) {
				break;
			}
		}

		// question #6
		System.out.println("Question #6");

		for (int i = 1; i < 3; i++) {
			System.out.println("Week " + i + ":");

			for (int j = 1; j < 6; j++) {
				System.out.println("Day " + j);
			}
		}

		// question #7
		System.out.println("Question #7");

		for (int i = 1; i < 20; i++) {

			if (i < 10) {
				System.out.print(i);
				System.out.print(i);
				System.out.print(", ");
			} else {
				for (int j = 1; j < 2; j++) {
					System.out.print(i);
					System.out.print(j);
					System.out.print(", ");
				}
			}
		}

		// question #7 alternative
		System.out.println(" ");
		System.out.println("Question #7 alternative");

		for (int i = 1; i < 100; i++) {

			int x = Integer.parseInt(Integer.toString(i).substring(0, 1));

			System.out.print(i);
			System.out.print(x);
			System.out.print(", ");
		}

		// question #8
		System.out.println(" ");
		System.out.println("Question #8");

		int previousNumber = 0;
		int currentNumber = 1;

		for (int i = 1; i < 50; i++) {

			if (previousNumber > 50) {
				break;
			}

			System.out.println(previousNumber);

			int sum = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = sum;

		}

		// question #9
		System.out.println("Question #9");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
}
