package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KataPrimeFactors {

	Set<Integer> primes = new HashSet<Integer>();
	public Set<Integer> factorize(int n){
		int quotient = 0;
		while (n > 1) {
			for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				
				quotient = n /i;
				n = quotient;
				primes.add(i);
				primes.add(quotient);
				
				i = 2;
				}
		}
			primes.add(n);
		
		
	}
		return primes;
	
	
}
}
