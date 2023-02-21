package org.ssglobal.training.codes.itemB.Exception;

public class SpaceCharException extends Exception {
	private static final long serialVersionUID = 2633835004738264231L;
	private String message = "Empty space detected";
	
	public SpaceCharException() {}
	
	public SpaceCharException(String newMessage) {
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
