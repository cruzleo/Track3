package org.ssglobal.training.codes.itemA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HTMLChecker {
	private List<String> htmlTags = new ArrayList<>();
	private static final String TAGS_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";

	public boolean validate(String htmlFile) {
		String filePath = "./src/files/%s".formatted(htmlFile);
		File file = new File(filePath);

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {

			String line = br.readLine();
			String[] tags = line.split(" ");
			while (!(line == null)) {
				for (String lookup : tags) {
					htmlTags.add(lookup);
				}
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		for (String lookup : htmlTags) {
			if (lookup.contains(TAGS_PATTERN)) {
				return true;
			} 
		}
		return false;
	}
}
