package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the Fibonacci number: ");
		
		int fibonacciNumber = in.nextInt();
		int f1 = 0, f2 = 1;
		
		while(f1 <= fibonacciNumber) {
			
		
			System.out.print(f1 + ", ");
			
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		

	}

}
