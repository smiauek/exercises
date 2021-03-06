package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class JavaBasicsClass {

	public static void main(String[] args) {

		// question #1
		int x = 32;
		int y = 28;

		int sum = x + y;

		System.out.println("Question #1");
		System.out.println(sum);

		// question #2
		double q = 3.2;
		double w = 2.8;

		double qw_sum = q + w;

		System.out.println("Question #2");
		System.out.println(qw_sum);

		// question #3
		int a = 32;
		double s = 2.8;

		double as_sum = a + s;

		System.out.println("Question #3");
		System.out.println(as_sum);
		System.out.println("Sum of integer and double must be type double.");

		// question #4
		int o = 32;
		int p = 3;

		double op_div = o / p;

		System.out.println("Question #4");
		System.out.println(op_div);

		double i = o;

		double ip_div = i / p;

		System.out.println(ip_div);
		System.out.println("Didn't need any corrections. Result became more accurate.");

		// question #5
		double j = 32.7;
		double k = 2.8;

		double jk_div = j / k;

		System.out.println("Question #5");
		System.out.println(jk_div);

		int int_jk_div = (int) jk_div;

		System.out.println(int_jk_div);

		// question #6
		int xx = 5;
		int yy = 6;

		int qq = yy / xx;

		System.out.println("Question #6");
		System.out.println(qq);

		double dd = yy;

		qq = (int) dd;

		System.out.println(qq);

		// question #7
		final int M_CONSTANT = 30;

		final int N_CONSTANT = 10;

		int result = M_CONSTANT / N_CONSTANT;

		System.out.println("Question #7");
		System.out.println(result);

		// question #8

		double coffee = 3.50;
		double tea = 3.00;
		double water = 0.50;

		double subtotal;
		double totalSale;

		subtotal = 3 * coffee + 4 * tea + 2 * water;

		final double SALES_TAX = 0.9;

		totalSale = subtotal + subtotal * SALES_TAX;

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Question #8");
		System.out.println("Not-formatted total sale: " + totalSale);
		System.out.println("Formatted total sale: " + df.format(totalSale));

	}

}
