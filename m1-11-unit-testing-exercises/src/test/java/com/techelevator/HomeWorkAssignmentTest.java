package com.techelevator;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class HomeWorkAssignmentTest {

	
	
	HomeworkAssignment homeworkAssignment = new HomeworkAssignment(10);
	
@Test
public void verify_lettera_grade() {
		
		homeworkAssignment.setTotalMarks(9); //Act
		Assert.assertEquals("Incorrect grade", "A", homeworkAssignment.getLetterGrade());;
	}
@Test
public void verify_letterb_grade() {
		
		homeworkAssignment.setTotalMarks(8); //Act
		Assert.assertEquals(homeworkAssignment.getLetterGrade(), "B");
	}
@Test
public void verify_letterc_grade() {
	
	homeworkAssignment.setTotalMarks(7); //Act
	Assert.assertEquals(homeworkAssignment.getLetterGrade(), "C");
}
@Test
public void verify_letterd_grade() {
	
	homeworkAssignment.setTotalMarks(6); //Act
	Assert.assertEquals(homeworkAssignment.getLetterGrade(), "D");
}
@Test
public void verify_letterf_grade() {
	
	homeworkAssignment.setTotalMarks(3); //Act
	Assert.assertEquals(homeworkAssignment.getLetterGrade(), "F");
}
@Test
public void check_for_negative_total_marks() {
	homeworkAssignment.setTotalMarks(-10);
	Assert.assertFalse("Invalid Mark!", false);
}


}
