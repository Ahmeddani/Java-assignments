package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KataPrimeFactorsTest {

	
	KataPrimeFactors pf;
	List<Integer> s;

@Before
public void setup() {
	pf = new KataPrimeFactors();
	
}

@Test
public void test_for_zero() {
	List<Integer> primeFactors = pf.factorize(0);
	s = new ArrayList<Integer>();
	Assert.assertEquals(s, primeFactors);
	
}

@Test
public void test_for_2() {
	List<Integer> primeFactors = pf.factorize(2);
	s = new ArrayList<Integer>();
	s.add(2);
	Assert.assertEquals(s, primeFactors);;
	
}

@Test
public void test_for_20() {
	List<Integer> primeFactors = pf.factorize(20);
	s = new ArrayList<Integer>();
	s.add(2);
	s.add(2);
	s.add(5);
	Assert.assertEquals(s, primeFactors);
	
}

@Test
public void test_for_5() {
	List<Integer> primeFactors = pf.factorize(5);
	s = new ArrayList<Integer>();
	s.add(5);
	Assert.assertEquals(s, primeFactors);
	
}

@Test
public void test_for_8() {
	List<Integer> primeFactors = pf.factorize(8);
	s = new ArrayList<Integer>();
	s.add(2);
	s.add(2);
	s.add(2);
	Assert.assertEquals(s, primeFactors);
	
}

@Test
public void test_for_9() {
	List<Integer> primeFactors = pf.factorize(9);
	s = new ArrayList<Integer>();
	s.add(3);
	s.add(3);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_11() {
	List<Integer> primeFactors = pf.factorize(11);
	s = new ArrayList<Integer>();
	s.add(11);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_21() {
	List<Integer> primeFactors = pf.factorize(21);
	s = new ArrayList<Integer>();
	s.add(3);
	s.add(7);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_25() {
	List<Integer> primeFactors = pf.factorize(25);
	s = new ArrayList<Integer>();
	s.add(5);
	s.add(5);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_81() {
	List<Integer> primeFactors = pf.factorize(81);
	s = new ArrayList<Integer>();
	s.add(3);
	s.add(3);
	s.add(3);
	s.add(3);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_978() {
	List<Integer> primeFactors = pf.factorize(978);
	s = new ArrayList<Integer>();
	s.add(2);
	s.add(3);
	s.add(163);
	Assert.assertEquals(s, primeFactors);
}

@Test
public void test_for_5868() {
	List<Integer> primeFactors = pf.factorize(5868);
	s = new ArrayList<Integer>();
	s.add(2);
	s.add(2);
	s.add(3);
	s.add(3);
	s.add(163);
	Assert.assertEquals(s, primeFactors);
}
}