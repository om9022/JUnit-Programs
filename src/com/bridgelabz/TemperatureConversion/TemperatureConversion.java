package com.bridgelabz.TemperatureConversion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConversion {
	public class TemparatureConversion {
		public static final int CELSIUS_TO_FAHRENHIET = 1;
		public static final int FAHRENHIET_TO_CELSIUS = 2;
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number which conversion do you want \n 1) Celsius to Fahrenhiet \n 2) Fahrenhiet to Celsius ");
			int choice = scanner.nextInt();
			System.out.println("Enter the value");
			double number = scanner.nextInt();
			scanner.close();
			double result = 0;
			if (choice == CELSIUS_TO_FAHRENHIET)
			{
				result = (number*1.8) + 32 ;
			}
			else if (choice == FAHRENHIET_TO_CELSIUS)
			{
				result = (number - 32) * (0.55);
			}
			else 
			{			
				System.err.println("invalid input");
				System.exit(0);
			}
			result=Double.parseDouble(new DecimalFormat("####.##").format(result));
			System.out.println("The required value is : "+result);
		}

	}
}
