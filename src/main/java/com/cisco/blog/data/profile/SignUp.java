
package com.cisco.blog.data.profile;

import javax.persistence.Entity;



@Entity
public class SignUp extends ABlog{
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
		
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
