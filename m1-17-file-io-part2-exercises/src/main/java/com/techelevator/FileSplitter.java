package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	private final static int MAX_NUMBER_OF_LINES = 100;

	public static void main(String[] args) throws IOException {

		String fileToRead = "/Users/aahmed/Downloads/Alice-in-wonderland.txt";

		File fileIn = new File(fileToRead);
		Scanner in = new Scanner(fileIn);

		int count = 0;
		while (in.hasNextLine()) {

			count++; // create new file with count as sequence number
			
			String fileToWrite = fileIn.getName().concat("-" + count);
			
			File fileOut = new File("/Users/aahmed/development/ahmedahmed-java-blue-exercises/"
					+ "m1-17-file-io-part2-exercises/Alice's-sub-books/" + fileToWrite);

			try (PrintWriter writer = new PrintWriter(fileOut); BufferedWriter bw = new BufferedWriter(writer)) {

				for (int i = 0; i < 100; i++) {

					if (in.hasNextLine()) {

						String line = in.nextLine();

						bw.write(line);
						bw.newLine();

					}

					bw.flush();
				}

			}

		}
		
		in.close();
	}
}
