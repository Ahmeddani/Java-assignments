package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KataPrimeFactorsTest {

	
	KataPrimeFactors pf;
	Set<Integer> s;

@Before
public void setup() {
	pf = new KataPrimeFactors();
	
}

@Test
public void test_for_zero() {
	Set<Integer> primeFactors = pf.factorize(0);
	s = new HashSet<Integer>();
	Assert.assertEquals(s.hashCode(), primeFactors);;
	
}

@Test
public void test_for_2() {
	Set<Integer> primeFactors = pf.factorize(2);
	s = new HashSet<Integer>();
	s.add(2);
	Assert.assertEquals(s.hashCode(), primeFactors.hashCode());;
	
}

@Test
public void test_for_20() {
	Set<Integer> primeFactors = pf.factorize(2);
	s = new HashSet<Integer>();
	s.add(2);
	s.add(4);
	s.add(5);
	s.add(10);
	s.add(20);
	Assert.assertEquals(s.hashCode(), primeFactors.hashCode());;
	
}

}
