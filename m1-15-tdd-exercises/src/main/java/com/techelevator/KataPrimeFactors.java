package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {

	List<Integer> primes = new ArrayList<Integer>();

	public List<Integer> factorize(int n) {

		int i;

		for (i = 2; i <= n;) {

			if ((n % i) == 0) {
				primes.add(i);
				n = n / i;
				continue;

			}

			i++;
		}

		return primes;

	}

}
