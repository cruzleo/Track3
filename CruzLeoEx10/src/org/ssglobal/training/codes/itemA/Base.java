package org.ssglobal.training.codes.itemA;

public class Base {
	private String infob; 
	
	public Base() {
		  infob = "I am an object of the Base class";
	}
	
	public String getInfo() {
		return infob;
	}
	
	//private String infob; 
	// no errors 
	//but following the coding standard global var should be placed at the top.
}

