package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String fileName = "FizzBuzz.txt";
		File file = new File(fileName);
		String letter = "";

		// create an object of FizzBuzz class
		FizzBuzz fizzBuzz = new FizzBuzz();

		try (PrintWriter writer = new PrintWriter(file); BufferedWriter bf = new BufferedWriter(writer)) {

			if (!file.exists()) {
				file.createNewFile();
			}

			for (int i = 1; i <= 300; i++) {

				letter = fizzBuzz.getFizzBuzz(i); // call getFizzBuzz method of FizzBuzz class

				bf.write(letter);

				bf.write(" ");

				if (i % 30 == 0) {
					bf.newLine();
				}

			}

			bf.flush();
		}

	}

}
