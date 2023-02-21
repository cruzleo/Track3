package org.ssglobal.training.codes.itemC.Exception;

public class LetterSizeException extends Exception{
	private static final long serialVersionUID = 4005597071210686697L;
	private String message = "Alpanumeric is Invalid size";
	
	public LetterSizeException() {}
	
	public LetterSizeException(String newMessage) {
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
