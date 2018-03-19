package com.cisco.blog.data.profile;

import javax.persistence.Entity;

@Entity
public class Comment extends ABlog {
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	private Integer likeCount;

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

}
