package org.ssglobal.training.codes.itemA;

public class Author {
	private String name;
	private String email;
	private Character gender;
	private static int counter = 1;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	private Author(String name, String email, Character gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public static Author getAuthorInstace(String name, String email, Character gender) throws AuthorException, Exception{
		if (counter <= 5) {
			counter++;
			return new Author(name, email, gender);
		} else {
			throw new AuthorException();
		}
	}
	
	@Override
	public String toString() {
		return "%s %s %s".formatted(name, email, gender);
	}

}


class AuthorException extends Exception{
	private static final long serialVersionUID = -8441052667108169531L;
	private String message = "can only instantiate five times";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}

