package org.ssglobal.training.codes.itemA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Uniquely {

	private Map<String, Integer> words = new HashMap<>();

	public Map<String, Integer> getWords() {
		return words;
	}

	public void setWords(Map<String, Integer> words) {
		this.words = words;
	}

	public int createUniques(String str) {
		Set<Character> occur = new TreeSet<>();
		Set<Character> duplicate = new TreeSet<>();

		if (words.containsKey(str)) {
			return words.get(str);
		} else {
			for (int i = 0; i < str.length(); i++) {
				char letter = str.charAt(i);
				if (duplicate.contains(letter)) {
					continue;
				}
				boolean newOccurance = occur.add(letter);
				if (!newOccurance) {
					duplicate.add(letter);
				}
			}
		}

		occur.removeAll(duplicate);
		int count = occur.size();
		words.put(str, count);
		return count;
	}
}