package com.cisco.blog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.dao.ICommentDao;
import com.cisco.blog.data.profile.Comment;

public class CommentBizImpl implements ICommentBiz {
	@Autowired
	ICommentDao iCommentDao;
	public ICommentDao getiCommentDao() {
		return iCommentDao;
	}

	public void setiCommentDao(ICommentDao iCommentDao) {
		this.iCommentDao = iCommentDao;
	}

	public List<Comment> getAllComments(long messageId) {
		return iCommentDao.getAllComments(messageId);
	}

	public Comment addComment(long messageId, Comment comment) {
		return iCommentDao.addComment(messageId, comment);
	}

	public Comment updateComment(long messageId, long id, Comment comment) {
		return iCommentDao.updateComment(messageId, id, comment);
	}

	public void deleteComment(long messageId, long commentId) {
		iCommentDao.deleteComment(messageId, commentId);
	}

	public Comment getComment(long messageId, long commentId) {
		return iCommentDao.getComment(messageId, commentId);
	}

}
