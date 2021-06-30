package com.bridgelamz.MonthlyPayments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MonthlyPayments {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter the Principle loan amount");
		int P = scanner.nextInt();
		System.out.println("Enter the Years to payoff");
		int Y = scanner.nextInt();
		System.out.println("Enter the interest Percent");
		double R = scanner.nextInt();
		scanner.close();
		int n = 12 * Y ;
		double r = R / 1200;		
		double numerator = P * r ;
		double denominator = 1 - Math.pow(1+r, -(n));
		double payment = numerator/denominator;
		payment=Double.parseDouble(new DecimalFormat(".##").format(payment));
		System.out.println("Payment per month : "+payment);

	}
}

