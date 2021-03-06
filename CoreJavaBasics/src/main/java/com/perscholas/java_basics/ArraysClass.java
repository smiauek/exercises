package com.perscholas.java_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		// question #1
		System.out.println("Question #1");

		int[] arr1 = new int[3];

		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// question #2
		System.out.println("Question #2");

		int[] arr2 = { 13, 5, 7, 68, 2 };

		int x = arr2.length / 2;

		System.out.println(arr2[x]);

		// question #3
		System.out.println("Question #3");

		String[] arr3 = { "red", "green", "blue", "yellow" };

		System.out.println(arr3.length);

		String[] arr3Copy = arr3.clone();

		System.out.println("Original array: " + Arrays.toString(arr3));
		System.out.println("Copy of array: " + Arrays.toString(arr3Copy));

		// question #4
		System.out.println("Question #4");

		int[] arr4 = { 2, 4, 6, 8, 10 };

		System.out.println(arr4[0]);
		System.out.println(arr4[arr4.length - 1]);

		// System.out.println("This should be wrong: " + arr4[arr4.length]);

		// question #5
		System.out.println("Question #5");

		int[] arr5 = new int[5];

		for (int i = 0; i < arr5.length; i++) {

			arr5[i] = i;
		}

		System.out.println(Arrays.toString(arr5));

		// question #6
		System.out.println("Question #6");

		int[] arr6 = new int[5];

		for (int i = 0; i < arr6.length; i++) {

			arr6[i] = i * 2;
		}

		System.out.println(Arrays.toString(arr6));

		// question #7
		System.out.println("Question #7");

		int[] arr7 = { 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr7.length; i++) {

			if (i == arr7.length / 2)
				continue;

			System.out.println(arr7[i]);
		}

		// question #8
		System.out.println("Question #8");

		String[] arr8 = { "cat", "dog", "fish", "bird", "camel" };
		System.out.println(Arrays.toString(arr8));

		String temp = arr8[0];

		arr8[0] = arr8[arr8.length / 2];

		arr8[arr8.length / 2] = temp;

		System.out.println(Arrays.toString(arr8));

		// question #9
		System.out.println("Question #9");

		int[] arr9 = { 4, 2, 9, 13, 1, 0 };

		Arrays.sort(arr9);

		System.out.println(Arrays.toString(arr9));
		System.out.println("smallest: " + arr9[0]);
		System.out.println("biggest: " + arr9[arr9.length - 1]);

		// question #10
		System.out.println("Question #10");

		Object[] arr10 = new Object[5];

		arr10[0] = 1;
		arr10[1] = "cat";
		arr10[2] = "dog";
		arr10[3] = "fish";
		arr10[4] = 1.2;

		System.out.println(Arrays.toString(arr10));

	}

}
