package org.ssglobal.training.codes.itemA;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Concordance {
	private Map<Character, LinkedHashSet<Integer>> concordMap = new HashMap<>();

	public Map<Character, LinkedHashSet<Integer>> getConcordMap() {
		return concordMap;
	}

	public void setConcordMap(Map<Character, LinkedHashSet<Integer>> concordMap) {
		this.concordMap = concordMap;
	}

	public Map<Character, LinkedHashSet<Integer>> concord(String str) {
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letter != ' ') {
				LinkedHashSet<Integer> temp = concordMap.get(letter);
				if (temp != null) {
					temp.add(i);
					concordMap.put(letter, temp);
				} else {
					temp = new LinkedHashSet<Integer>();
				}
				temp.add(i);
				concordMap.put(letter, temp);
			} else {
				continue;
			}
		}	
		concordMap = Collections.unmodifiableMap(concordMap);
	
		return concordMap;
	}
}
