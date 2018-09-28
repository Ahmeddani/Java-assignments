package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getLetterGrade() {

		int letterGrade =  this.totalMarks * 100 / possibleMarks;
		if (letterGrade >= 90) {
			return "A";
		}
		else if (letterGrade >= 80 && letterGrade <= 89) {
			return "B";
		}
		else if (letterGrade >= 70 && letterGrade <= 79) {
			return "C";
		}
		else if (letterGrade >= 60 && letterGrade <= 69) {
			return "D";
		}
		
		return "F";
	}
	
	
}
