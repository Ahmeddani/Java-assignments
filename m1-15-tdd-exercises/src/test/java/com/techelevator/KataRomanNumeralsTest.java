package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	//test for number <= 0
	//test > 3000
	//test for 4
	//test for 9
	//test for 40
	//test for 90
	//test for 400
	//test for 900
	KataRomanNumerals romanNumerals;

@Before
   public void setup() {	
    
	romanNumerals = new KataRomanNumerals();

}

//test cases for arabic to numeral
@Test
public void test_for_less_than_or_equal_to_zero() {
	
	String roman = romanNumerals.romanNumerals(0);
	Assert.assertEquals("", roman);
}

@Test
public void test_for_numbers_greater_than_3000() {
	String roman = romanNumerals.romanNumerals(6000);
	Assert.assertEquals("", roman);
}

@Test
public void test_for_2018() {
	String roman = romanNumerals.romanNumerals(2018);
	Assert.assertEquals("MMXVIII", roman);
}
@Test
public void test_for_9() {
	String roman = romanNumerals.romanNumerals(9);
	Assert.assertEquals("IX", roman);
}

@Test
public void test_for_40() {
	String roman = romanNumerals.romanNumerals(40);
	Assert.assertEquals("XL", roman);
}

@Test
public void test_for_90() {
	String roman = romanNumerals.romanNumerals(90);
	Assert.assertEquals("XC", roman);
}

@Test
public void test_for_400() {
	String roman = romanNumerals.romanNumerals(400);
	Assert.assertEquals("CD", roman);
}

@Test
public void test_for_900() {
	String roman = romanNumerals.romanNumerals(9);
	Assert.assertEquals("IX", roman);
}


//---test cases for roman to arabic numerals------
@Test
public void test_for_I() {
	int arabic = romanNumerals.romanToArabic("I");
	Assert.assertEquals(1, arabic);
}

@Test
public void test_for_IV() {
	int arabic = romanNumerals.romanToArabic("IV");
	Assert.assertEquals(4, arabic);
}

@Test
public void test_for_IX() {
	int arabic = romanNumerals.romanToArabic("IX");
	Assert.assertEquals(9, arabic);
}

@Test
public void test_for_XL() {
	int arabic = romanNumerals.romanToArabic("XL");
	Assert.assertEquals(40, arabic);
}

@Test
public void test_for_L() {
	int arabic = romanNumerals.romanToArabic("L");
	Assert.assertEquals(50, arabic);
}

@Test
public void test_for_XC() {
	int arabic = romanNumerals.romanToArabic("XC");
	Assert.assertEquals(90, arabic);
}

@Test
public void test_for_C() {
	int arabic = romanNumerals.romanToArabic("C");
	Assert.assertEquals(100, arabic);
}

@Test
public void test_for_CD() {
	int arabic = romanNumerals.romanToArabic("CD");
	Assert.assertEquals(400, arabic);
}

@Test
public void test_for_D() {
	int arabic = romanNumerals.romanToArabic("D");
	Assert.assertEquals(500, arabic);
}

@Test
public void test_for_CM() {
	int arabic = romanNumerals.romanToArabic("CM");
	Assert.assertEquals(900, arabic);
}

@Test
public void test_for_M() {
	int arabic = romanNumerals.romanToArabic("M");
	Assert.assertEquals(1000, arabic);
}

@Test
public void test_for_MMM() {
	int arabic = romanNumerals.romanToArabic("MMM");
	Assert.assertEquals(3000, arabic);
}
}
