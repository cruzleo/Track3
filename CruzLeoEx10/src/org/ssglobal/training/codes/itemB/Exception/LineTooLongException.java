package org.ssglobal.training.codes.itemB.Exception;

public class LineTooLongException extends Exception{
	private static final long serialVersionUID = 3405765961837731L;
	private String message = "The strings are too long";
	
	public LineTooLongException() {}
	
	public LineTooLongException(String newMessage) {
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
