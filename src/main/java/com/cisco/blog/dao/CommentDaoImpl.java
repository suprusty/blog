package com.cisco.blog.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.data.profile.Comment;
import com.cisco.blog.persistence.service.PersistenceService;


public class CommentDaoImpl implements ICommentDao {
	@Autowired
	PersistenceService persistenceService;
	public List<Comment> getAllComments(long messageId) {

		return null;
	}

	public Comment addComment(long messageId, Comment comment) {

		return null;
	}

	public Comment updateComment(long messageId, long id, Comment comment) {

		return null;
	}

	public void deleteComment(long messageId, long commentId) {

	}

	public Comment getComment(long messageId, long commentId) {

		return null;
	}

}
