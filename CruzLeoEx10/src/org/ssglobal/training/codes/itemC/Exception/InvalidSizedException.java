package org.ssglobal.training.codes.itemC.Exception;

public class InvalidSizedException extends Exception{
	private static final long serialVersionUID = -7019636006634008095L;
	private String message = "Invalid size";
	
	public InvalidSizedException() {}
	
	public InvalidSizedException(String newMessage) {
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
