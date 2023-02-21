package org.ssglobal.training.codes.itemC.Exception;

public class BadIndexException extends Exception{
	private static final long serialVersionUID = 2059183473649495544L;
	private String message = "Bad Index";
	
	public BadIndexException() {}
	
	public BadIndexException(String newMessage) {
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
