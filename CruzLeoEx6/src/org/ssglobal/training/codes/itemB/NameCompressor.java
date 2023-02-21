package org.ssglobal.training.codes.itemB;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NameCompressor {

	public void compress() {
		Scanner np = new Scanner(System.in);
		String[] name = new String[10];
		String fName;
		String firstLet = "";

		System.out.print("Enter name: ");
		for (int i = 0; i < name.length; i++) {
			name[i] = np.nextLine();

			if (name[i].equalsIgnoreCase("zzz")) {
				StringTokenizer tokenizer = new StringTokenizer(name[i], " ");
			
				String[] tokens = new String[tokenizer.countTokens()];
				int counter = 0;

				while (tokenizer.hasMoreTokens()) {
					tokens[counter] = tokenizer.nextToken();
					firstLet = tokens[tokens.length - 1].substring(0, 1).toUpperCase();
					fName = tokens[0];
					System.out.println("%s, %s.".formatted(fName, firstLet));
					counter++;
					
				}
				
//				for (int j = 0; j < tokens.length; j++) {
//					firstLet = tokens[tokens.length - 1].substring(0, 1);
//					lname = tokens[0];
//					System.out.println("%s, %s.".formatted(fName, firstLet.toUpperCase()));
//				}
			}
			
			
		}

	}
}
