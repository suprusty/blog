

package com.cisco.blog.data.profile;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class Blog extends ABlog {
	private String catagr;
	private String subject;
	private Integer likeCount;
	@OneToMany
	private Set<Comment> comments;
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}	
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
