package com.cisco.blog.biz;

import java.util.List;

import com.cisco.blog.dao.ICommentDao;
import com.cisco.blog.data.Comment;
import com.cisco.blog.spring.BlogBeanFactory;

public class CommentBizImpl implements ICommentBiz {

	public List<Comment> getAllComments(long messageId) {
		ICommentDao icommentDao = (ICommentDao) BlogBeanFactory.getBean("commentDao");
		return icommentDao.getAllComments(messageId);
	}

	public Comment addComment(long messageId, Comment comment) {
		ICommentDao icommentDao = (ICommentDao) BlogBeanFactory.getBean("commentDao");
		return icommentDao.addComment(messageId, comment);
	}

	public Comment updateComment(long messageId, long id, Comment comment) {
		ICommentDao icommentDao = (ICommentDao) BlogBeanFactory.getBean("commentDao");
		return icommentDao.updateComment(messageId, id, comment);
	}

	public void deleteComment(long messageId, long commentId) {
		ICommentDao icommentDao = (ICommentDao) BlogBeanFactory.getBean("commentDao");
		icommentDao.deleteComment(messageId, commentId);
	}

	public Comment getComment(long messageId, long commentId) {
		ICommentDao icommentDao = (ICommentDao) BlogBeanFactory.getBean("commentDao");
		return icommentDao.getComment(messageId, commentId);
	}

}
