package org.ssglobal.training.codes.itemB;

import java.util.Comparator;

public class Word implements Comparator<Word> {
	private String word;
	private Integer occurence;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getOccurence() {
		return occurence;
	}

	public void setOccurence(Integer occurence) {
		this.occurence = occurence;
	}

	@Override
	public int compare(Word o1, Word o2) {
		if (o1.getOccurence().compareTo(o2.getOccurence()) == 0) {
			return 0;
		} else if (o1.getOccurence().compareTo(o2.getOccurence()) > 0) {
			return -2;
		} else {
			return 2;
		}

	}

}
