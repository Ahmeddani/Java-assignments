package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class KataPrimeFactorsTest {

	
	KataPrimeFactors pf;
	

@Before
public void setup() {
	pf = new KataPrimeFactors();
}

@Test
public void test_for_zero() {
	List<Integer> primeFactors = pf.factorize(0);
	Assert.assertEquals(0, primeFactors);;
	
}
}
