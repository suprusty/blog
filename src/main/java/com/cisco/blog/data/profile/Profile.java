package com.cisco.blog.data.profile;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Profile extends ABlog {

	private String name;
	private String emilId;
	private String phoneno;
	@OneToMany
	private Set<Blog> blogs;
	public Set<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(Set<Blog> blogs) {
		this.blogs = blogs;
	}

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
