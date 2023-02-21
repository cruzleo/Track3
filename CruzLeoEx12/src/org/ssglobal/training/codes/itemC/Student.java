package org.ssglobal.training.codes.itemC;

public class Student {
	private String name;
	private String subject;
	private int year;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Student(String name, String subject, int year) {
		this.name = name;
		this.subject = subject;
		this.year = year;
	}
	
}
