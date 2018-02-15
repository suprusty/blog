package com.cisco.blog.data.profile;

import com.cisco.blog.data.ABlog;

public class Profile extends ABlog {
	private String name;
	private String emilId;
	private String phoneno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmilId() {
		return emilId;
	}

	public void setEmilId(String emilId) {
		this.emilId = emilId;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}
