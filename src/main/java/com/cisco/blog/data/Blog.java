package com.cisco.blog.data;

public class Blog extends ABlog {
	private String type;
	private String title;
	private int like;
	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlogDecc() {
		return blogDecc;
	}

	public void setBlogDecc(String blogDecc) {
		this.blogDecc = blogDecc;
	}

	private String blogDecc;

}
