package org.ssglobal.training.codes.itemC.Exception;

public class ElementCharException extends Exception{
	private static final long serialVersionUID = -5730946846536956154L;
	private String message = "Invalid element value: [character]"; //char and string
	
	public ElementCharException() {}
	
	public ElementCharException(String newMessage) {
		message = newMessage;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}

}
