package org.ssglobal.training.codes.streams;

public class Score {
	private String firstName;
	private String lastName;
	private int score;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Score(String lName, String fname, int s) {
		firstName = fname;
		lastName = lName;
		score = s;
	}

}
