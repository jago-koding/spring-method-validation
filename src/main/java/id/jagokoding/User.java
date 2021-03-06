package id.jagokoding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class User {
	
	@NotEmpty
	private String name;
	@Email
	private String email;

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

	@Override
	public String toString() {
		return "User{" + "name='" + name + '\'' + ", email='" + email + '\'' + '}';
	}
}