
package com.cisco.blog.mongodb.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Blog")
public class Blog {
	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String catagr;
	private String subject;
	private Integer likeCount;

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	private String blogDecc;

	public String getCatagr() {
		return catagr;
	}

	public void setCatagr(String catagr) {
		this.catagr = catagr;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBlogDecc() {
		return blogDecc;
	}

	public void setBlogDecc(String blogDecc) {
		this.blogDecc = blogDecc;
	}

}
