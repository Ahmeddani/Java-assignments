package com.techelevator;

\
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FruitTreeTest {

	FruitTree fruitTree;
	 
	@Before
	public void setup() {
		 fruitTree = new FruitTree("Apple", 20);
	}

	@Test
	public void verify_type_of_fruit() {
		Assert.assertEquals("Incorrect Fruit Type", "Apple", fruitTree.getTypeOfFruit());
	}
	
	@Test
	public void verify_number_of_pieces() {
		Assert.assertEquals("Starting count incorrect: " + fruitTree.getPiecesOfFruitLeft(), 
				20, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void verify_pick_3_pieces() {
		boolean success = fruitTree.PickFruit(3);
		Assert.assertTrue("Picking 3 fruit was not successful", success);
		Assert.assertEquals("Fruit remaining after picking fruit was incorrect: " + fruitTree.getPiecesOfFruitLeft(), 
				17, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_all_fruit() {
		boolean success = fruitTree.PickFruit(20);
		Assert.assertTrue("Picking all fruit was not successful", success);
		Assert.assertEquals("Fruit remaining after picking fruit was incorrect: " + fruitTree.getPiecesOfFruitLeft(), 
				0, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void try_to_pick_too_many_pieces() {
		boolean success = fruitTree.PickFruit(21);
		Assert.assertFalse("Was able to pick more fruit than allowed", success);
		Assert.assertEquals("Fruit remaining after picking fruit was incorrect: " + fruitTree.getPiecesOfFruitLeft(), 
				20, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_negative_fruit() {
	Assert.assertTrue(fruitTree.PickFruit(-1));
	Assert.assertEquals(20, fruitTree.getPiecesOfFruitLeft());
	}
	
}
