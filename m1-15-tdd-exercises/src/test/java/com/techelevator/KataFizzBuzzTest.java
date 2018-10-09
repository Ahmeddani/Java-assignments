package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	// test if < 1
		//test if >1
		//test if 1
		//test if 100
		//test not a multiple of 3 or 5
		//test multiple of 3 or 5
		//test mltiple of 3 not 5
		//test multiple of 5 not 3
		//test multiple of 3 and 5
		//test return as string
		//multiple of 3 return fizz
		//multiple of 5 return buzz
		//multiple of 3 and 5 return fizzbuzz
		//if number contains 3 fizz
		//if contains 5 buzz
		//if contains 3 and 5 fizzbuzz
		//if multiple of 3 and contains 5 fizzbuzz
		//if multiple of 5 and contains 3 fizzbuzz
		
	private KataFizzBuzz fizzBuzz;
	
	@Before
	public void setup() {
		
		fizzBuzz = new KataFizzBuzz();
	}
	
	@Test
	public void returns_a_type_string() {
		//Arrange
		//Act
		String result = fizzBuzz.getFizzBuzz(0);
		assertTrue(result instanceof String); //Assert
	}
	
	@Test
	public void number_must_not_be_less_than_1() {
		String result = fizzBuzz.getFizzBuzz(0);
		assertEquals("", result);
	}
	
	@Test
	public void number_must_not_be_greater_than_100() {
		String result = fizzBuzz.getFizzBuzz(101);
		assertEquals("", result);
	}
	
	@Test
	public void returns_number_when_meets_no_conditions() {

		assertEquals("2", fizzBuzz.getFizzBuzz(2));
		assertEquals("4", fizzBuzz.getFizzBuzz(4));
		assertEquals("82", fizzBuzz.getFizzBuzz(82));
		
	}
	
	@Test
	public void only_if_multiple_of_3_return_fizz() {
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(9));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(18));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(72));
	}
	@Test
	public void only_if_multiple_of_5_return_Buzz() {
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(10));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(40));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(70));
	}
	
	@Test
	public void only_if_multiple_of_3_and_5_return_fizzbuzz() {
		assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(90));
		assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(60));
		
	}
	
	@Test
	public void only_if_contains_3() {
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(13));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(23));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(43));
		
	}
	
	@Test
	public void only_if_contains_5() {
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(52));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(56));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(58));
		
	}
	
@Test
public void contains_3_and_5_returns_fizzbuzz() {
	assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(53));
	assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(35));
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
