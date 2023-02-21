package org.ssglobal.training.codes.itemB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordFinder {
	private Map<String, Integer> wordsCtnr = new HashMap<>();
	private List<Word> wordEntries = new ArrayList<>();
	
	public Map<String, Integer> getWordFreq() {
		return wordsCtnr;
	}

	public void setWordFreq(Map<String, Integer> wordFreq) {
		this.wordsCtnr = wordFreq;
	}

	public void tabulateWords(String fileName) {
		String filePath = "./src/files/%s".formatted(fileName);
		File file = new File(filePath);

		try (FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr);
			){
			String parag = br.readLine().toLowerCase();
			while (!(parag == null)) {
				String[] words = parag.split("[^a-zA-Z']+");
				
				for (String wordStr : words) {
					Integer counter = wordsCtnr.get(wordStr);
					if (counter != null) {
						counter++;
						wordsCtnr.replace(wordStr, counter);
					} else {
						wordsCtnr.put(wordStr, 1);
					}
				}
				parag = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		for (Entry<String, Integer> lookup : wordsCtnr.entrySet()) {
			Word word = new Word();
			word.setWord(lookup.getKey());
			word.setOccurence(lookup.getValue());
			wordEntries.add(word);
		}
		
		// sort then traverse
		Collections.sort(wordEntries, new Word());
		for (Word lookup: wordEntries) {
			System.out.println("\t%s\t%5d".formatted(lookup.getWord(), lookup.getOccurence()));
		}
	}
}
