package com.bridgelabz.ToBinary;

import java.util.Scanner;

public class ToBinary {
	public static void main(String[] args)
	{
		System.out.println("Enter The Number whose Binary Conversion You want to find : ");
		Scanner scanner = new Scanner(System.in);
		int decimalNumber = scanner.nextInt();
		scanner.close();
		int binaryNumber = 0;
		int powerCount = 0;

		while(decimalNumber > 0)
		{
			int remender = decimalNumber%2;
			int power =(int) Math.pow(10, powerCount);
			binaryNumber += (power * remender);
			decimalNumber = decimalNumber /2 ;
			powerCount++;
		}
		System.out.println("The required Binary number is "+binaryNumber);
	}

}
