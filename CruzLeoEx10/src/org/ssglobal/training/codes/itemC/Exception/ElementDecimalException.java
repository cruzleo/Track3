package org.ssglobal.training.codes.itemC.Exception;

public class ElementDecimalException extends Exception{
	private static final long serialVersionUID = 4882296317957556575L;
	private String message = "Invalid element value: [floating-point]";
	
	public ElementDecimalException() {}
	
	public ElementDecimalException(String newMessage) {
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
