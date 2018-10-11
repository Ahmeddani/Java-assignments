package com.techelevator;

public class KataRomanNumerals {

 public String romanNumerals(int number) {
	    
	     String asRomanNumerals = "";

	    // Array including numerals in ascending order
	      String[] RN = {"I", "V", "X", "L", "C", "D", "M" };
	      
	      int i = 0; // Index used to keep track which digit we are translating
	    
	      if(number <= 0 || number > 3000) {
	    	  return asRomanNumerals;
	      }
	      
	 while (number > 0) {
	        
	   switch(number % 10) {
	        
	        case 1: 
	        	    asRomanNumerals = RN[i] + asRomanNumerals; 
	                break;
	        case 2: 
	        	    asRomanNumerals = RN[i] + RN[i] + asRomanNumerals; 
	                break;
	        case 3: 
	        	    asRomanNumerals = RN[i] + RN[i] + RN[i] + asRomanNumerals; 
	                break;
	        case 4: 
	        	    asRomanNumerals = RN[i] + RN[i + 1] + asRomanNumerals; 
	                break;
	        case 5: 
	        	    asRomanNumerals = RN[i + 1] + asRomanNumerals; 
	                break;
	        case 6: 
	        	    asRomanNumerals = RN[i + 1] + RN[i] + asRomanNumerals; 
	                break;
	        case 7: 
	        	    asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + asRomanNumerals; 
	                break;
	        case 8: 
	        	    asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + RN[i] +asRomanNumerals; 
	                break;
	        case 9: 
	        	    asRomanNumerals = RN[i] + RN[i + 2] + asRomanNumerals; 
	                break;
	        }
	        number = (int) number / 10;
	        i += 2;
	    }
	    return asRomanNumerals;
}
 
 // method to convert roman numerals to arabic numerals.
 
 public int romanToArabic(String roman) {
	 
	 int current = 0; // current position in the roman numeral
	 int previous = 0; // previous position in the roman numeral
	 int i = 0; // index position of a char in the roman string
	 int arabicNumeral = 0; //arabic value of roman numeral 
	 
	 roman = roman.toUpperCase();

     if (roman.matches(".*[0-9].*") || !roman.matches("[M|D|C|L|X|V|I]*")) {
         System.out.println("Impossible to convert. Wrong roman numeral");
     }
	 
     while(i < roman.length()) {
		 
		 char letter = roman.charAt(i);
		 
		 switch (letter) {
		 
			 case 'I':
				 
				 current = 1;
			     break;
			     
			 case 'V':
				 
				 current = 5;
				 break;
				 
			 case 'X':
				 
				 current = 10;
				 break;
				 
			 case 'L':
				 current = 50;
				 break;
				 
			 case 'C':
				 
				 current = 100;
				 break;
				 
			 case 'D':
				 
				 current = 500;
				 break;
				 
			 case 'M':
			 
				 current = 1000;
				 break;
		
		 }
		 
		 if (current > previous) {
			 
			 arabicNumeral += current - (previous * 2); // we multiply previous twice because it has already been added to arabicNumeral
		 }
		 
		 else {
			 
			 arabicNumeral += current;
		 }
		 
         previous = current;
		 i++;
		
}
	return arabicNumeral;	 
 }
}
