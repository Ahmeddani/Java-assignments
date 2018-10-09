import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.FizzBuzz;



public class FizzBuzzTest {

 FizzBuzz fizzBuzz;
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void returns_a_type_string() {
		// Arrange
		// Act
		String result = fizzBuzz.getFizzBuzz(0);
		// Assert
		assertTrue(result instanceof String);
	}
	
	@Test
	public void number_must_not_be_less_than_1() {
		String result = fizzBuzz.getFizzBuzz(0);
		assertEquals("", result);
	}
	
	@Test
	public void number_must_not_be_greater_than_300() {
		String result = fizzBuzz.getFizzBuzz(301);
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
	public void only_if_multiple_of_5_return_buzz() {
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(40));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(70));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(10));
	}
	
	@Test
	public void only_if_multiples_of_3_and_5_return_fizzbuzz() {
		assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(90));
		assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(60));
	}
	
	@Test 
	public void only_if_contains_3_return_fizz() {
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(13));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(23));
		assertEquals("Fizz", fizzBuzz.getFizzBuzz(43));
	}
	
	@Test 
	public void only_if_contains_5_return_buzz() {
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(56));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(58));
		assertEquals("Buzz", fizzBuzz.getFizzBuzz(52));
	}
	
	@Test
	public void only_if_contains_3_and_5_return_fizzbuzz() {
		assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(53));
	}

}
