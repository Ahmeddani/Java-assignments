package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

	//test for 0 books purchased
	//test for 1 copy of each book
	//test for 
	KataPotter potter;
	int[] books;
@Before
public void setup() {
	potter = new KataPotter();
	
}

@Test
public void test_for_zero_books_return_0() {
	books = new int[]{0,0,0,0,0};
	double cost = potter.getCost(books);
	Assert.assertEquals(0.0, cost,0);
}
}
