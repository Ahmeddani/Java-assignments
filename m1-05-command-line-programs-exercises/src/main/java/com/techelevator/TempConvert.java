package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the temperature: ");
		
		double userInput = input.nextDouble();
		
		//cast double value user input into integer for display later
		
		int intUserInput = (int) (userInput);
		input.nextLine();
		
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String celsiusOrFahrenheit = input.nextLine();
		
		if(celsiusOrFahrenheit.equals("F")){
			
			//we first get the user input as double for precise calculation
			//we put parenthesis to get the difference first then divide by 1.8
			//then explicitly cast the double value into int to display as output 
			int celsius = (int) (((userInput) - 32) / 1.8);
			
			System.out.println(intUserInput +"F " + "is " + celsius + "C." );
			
		}
        
		if(celsiusOrFahrenheit.equals("C")){
			
        	int fahrenheit = (int) (((userInput) - 32) / 1.8);
			
        	System.out.println(intUserInput +"C " + "is " + fahrenheit + "F." );
			
		}

	}

}
