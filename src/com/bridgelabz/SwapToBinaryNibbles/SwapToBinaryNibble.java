package com.bridgelabz.SwapToBinaryNibbles;

import java.util.Scanner;

public class SwapToBinaryNibble {

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number whose Binary Conversion You want to find : ");
		Scanner scanner = new Scanner(System.in);
		int decimalNumber = scanner.nextInt();
		scanner.close();

		int binaryNumber[] = new int[8];
		for(int index = binaryNumber.length-1 ; index>=0 ; index--)
		{
			int remender = decimalNumber%2;
			binaryNumber[index]= remender;
			decimalNumber = decimalNumber /2 ;	
		}
		System.out.println("The decimal to binary conversion : "+Arrays.toString(binaryNumber));
	
		int swapednibble[] = new int[8]; 
		swappednibbles(binaryNumber, swapednibble);
		System.out.println("Swapped 2 nibbles : "+Arrays.toString(swapednibble) );
		
		decimalNumber = binaryToDecimal(decimalNumber, swapednibble);
		System.out.println("New Decimal Number is : "+decimalNumber);
	}

	private static int binaryToDecimal(int decimalNumber, int[] swapednibble) {
		int powerCount =0;
		for (int index = swapednibble.length-1;index >= 0; index--)
		{
			decimalNumber += swapednibble[index] * Math.pow(2,powerCount);
			powerCount++;
		}
		return decimalNumber;
	}

	private static void swappednibbles(int[] binaryNumber, int[] swapednibble) {
		int swapIndexCount1 = 0;

		for( int index = binaryNumber.length-4;index <= binaryNumber.length-1 ; index++ )
		{
			swapednibble[swapIndexCount1] = binaryNumber[index] ;
			swapIndexCount1++;
		}

		for( int index = 0 ;index < binaryNumber.length-4 ; index++)
		{
			swapednibble[swapIndexCount1] = binaryNumber[index] ;
			swapIndexCount1++;
		}
	}

}
