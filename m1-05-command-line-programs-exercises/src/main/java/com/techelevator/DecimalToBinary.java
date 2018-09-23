package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userInput = in.nextLine();
		String[] decimalArray = userInput.split(" ");
		
		
		for(int i = 0; i < decimalArray.length; i++) {
			
			String binaryStr = "";
			
			int a = Integer.parseInt(decimalArray[i]);
			// check if the decimal number is greater than zero
			while(a > 0) {
			int remainder = a % 2;
			a = a / 2;
			binaryStr = binaryStr + "" + remainder;
			
			}
			System.out.println(decimalArray[i] + " in binary is " + binaryStr);
			
		}

	}

}
