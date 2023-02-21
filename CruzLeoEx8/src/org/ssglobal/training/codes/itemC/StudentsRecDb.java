package org.ssglobal.training.codes.itemC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class StudentsRecDb {
	public String queryHighetAverage(String filename) {
		String fname = filename;
		
		double[] avgScore = new double[5];
		int[] testCounter = new int[5];
		int[] sumScore = new int[5];
		String[] allNames = new String[5];
		String[] hsName = new String[5];
		
		try {
			FileReader fr = new FileReader("./src/files/%s".formatted(fname));
			StreamTokenizer tokenizer = new StreamTokenizer(fr);
			int token = tokenizer.nextToken();
			int index = -1;

			while (! (token == StreamTokenizer.TT_EOF)) {
				if (token == StreamTokenizer.TT_NUMBER) {
					if (index != -1) {
						sumScore[index] += (int) tokenizer.nval;
						testCounter[index] += 1;
					}

				} else if (token == StreamTokenizer.TT_WORD) {
					String names = tokenizer.sval;
					index = switch (names) {
					case "Rossi" -> 0;
					case "Bianchi" -> 1;
					case "Verdi" -> 2;
					case "Leo" -> 3;
					case "Tom" -> 4;
					default -> -1;
					};
					
					if (index != -1) {
						allNames[index] = names;
					}
				}
				token = tokenizer.nextToken();
			}
			
			for (int i = 0; i < sumScore.length; i++) {
				avgScore[i] = sumScore[i] / testCounter[i];
			}
			
			double highScore = avgScore[0];
			int pos = 0;
			for (int j = 0; j < avgScore.length; j++) {
				if (avgScore[j] > highScore) {
					highScore = avgScore[j];
					hsName[pos] = allNames[j];
					
				} else if (highScore == avgScore[j]) {
					highScore = avgScore[j];
					hsName[pos] =  allNames[j];
					pos++;
				}
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Name of student(s) who got High Average %s".formatted(Arrays.toString(hsName).replace("null", ""));
	}
}
