package org.ssglobal.training.codes.itemA;

public class Derived extends Base{
	private String infod;
	
	public Derived() {
		super();
		infod = "I am an object of the Derived class";
	}
	
	public String getInfo() {
		return infod + ", " + super.getInfo();
	}
	
	//private String infod;
	// No errors 
	//but following the coding standard global var should be placed at the top.
}
