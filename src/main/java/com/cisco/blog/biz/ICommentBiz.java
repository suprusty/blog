package com.cisco.blog.biz;

import java.util.List;

import com.cisco.blog.data.profile.Comment;

public interface ICommentBiz {

	public List<Comment> getAllComments(long messageId);

	public Comment addComment(long messageId, Comment comment);

	public Comment updateComment(long messageId, long id,
			Comment comment);

	public void deleteComment(long messageId, long commentId);

	public Comment getComment(long messageId, long commentId);

}