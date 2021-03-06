package com.perscholas.java_basics;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;

public class OperatorsAndNumbersClass {

	public static void main(String[] args) {

		// question #1
//		decimal 1
//		binary 1
//		
//		decimal 8
//		binary 1000
//		
//		decimal 33
//		binary 100001
//		
//		decimal 78
//		binary 1001110
//		
//		decimal 787
//		binary 1100010011
//		
//		decimal 33987
//		binary 1000010011000011

		// question #2
//		binary 0010
//		decimal 2
//		
//		binary 1001
//		decimal 9
//		
//		binary 0011 0100
//		decimal 52
//		
//		binary 0111 0010
//		decimal 114
//		
//		binary 0010 0001 1111
//		decimal 543
//		
//		binary 0010 1100 0110 0111
//		decimal 11367

		// question #3
		System.out.println("Question #3");

		int x = 2;

		System.out.println("for x = 2");
		System.out.println(Integer.toBinaryString(x));

		x = x << 1;

		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

		System.out.println("for x = 9");
		x = 9;

		System.out.println(Integer.toBinaryString(x));

		x = x << 1;

		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

		System.out.println("for x = 17");
		x = 17;

		System.out.println(Integer.toBinaryString(x));

		x = x << 1;

		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

		System.out.println("for x = 88");
		x = 88;

		System.out.println(Integer.toBinaryString(x));

		x = x << 1;

		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

		// question #4
		System.out.println("Question #4");

		int y = 150;

		System.out.println("for y = 150");
		System.out.println(Integer.toBinaryString(y));

		y = y >> 2;

		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));

		System.out.println("for y = 225");
		y = 225;

		System.out.println(Integer.toBinaryString(y));

		y = y >> 2;

		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));

		System.out.println("for y = 1555");
		y = 1555;

		System.out.println(Integer.toBinaryString(y));

		y = y >> 2;

		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));

		System.out.println("for y = 32456");
		y = 32456;

		System.out.println(Integer.toBinaryString(y));

		y = y >> 2;

		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));

		// question #5
		System.out.println("Question #5");

		int xx = 7;
		int yy = 17;

		int zz = xx & yy;

		System.out.println("bitwise & operation");
		System.out.println("decimal - " + zz);
		System.out.println("binary - " + Integer.toBinaryString(zz));

		zz = xx | yy;

		System.out.println("bitwise | operation");
		System.out.println("decimal - " + zz);
		System.out.println("binary - " + Integer.toBinaryString(zz));

		// question #6
		System.out.println("Question #6");

		int post = 5;

		System.out.println("before - " + post);

		post++;

		System.out.println("after - " + post);

		// question #7
		System.out.println("Question #7");

		int test = 2;

		System.out.println("before - " + test);

		test++;

		System.out.println("1st postfix increment - " + test);

		test++;

		System.out.println("2nd postfix increment - " + test);

		++test;

		System.out.println("1st prefix increment - " + test);

		++test;

		System.out.println("2nd prefix increment - " + test);

		test = test + 1;

		System.out.println("1st 'normal' increment - " + test);

		test = test + 1;

		System.out.println("2nd 'normal' increment - " + test);

		// question #8
		System.out.println("Question #8");

		int xxx = 5;
		int yyy = 8;

		int xy_sum = ++xxx + yyy;

		System.out.println("prefix increment (++x + y) - " + xy_sum);
		System.out.println("x = " + xxx);
		System.out.println("y = " + yyy);

		xy_sum = xxx++ + yyy;

		System.out.println("postfix increment (x++ + y) - " + xy_sum);
		System.out.println("x = " + xxx);
		System.out.println("y = " + yyy);

	}

}
