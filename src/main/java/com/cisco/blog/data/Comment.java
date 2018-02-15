package com.cisco.blog.data;

public class Comment extends ABlog {
private String comments;
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public int getLike() {
	return like;
}
public void setLike(int like) {
	this.like = like;
}
private int like;

}
