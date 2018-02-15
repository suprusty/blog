package com.cisco.blog.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import com.cisco.blog.biz.ICommentBiz;
import com.cisco.blog.data.Comment;
import com.cisco.blog.spring.BlogBeanFactory;

public class CommentResource implements ICommentResource {

	public List<Comment> getAllComments(long messageId) {
		ICommentBiz commentBizImpl = (ICommentBiz) BlogBeanFactory.getBean("commentBiz");
		commentBizImpl.getAllComments(messageId);
		return null;
	}

	public Response addComment(long messageId, Comment comment, UriInfo uriInfo) {
		ICommentBiz commentBizImpl = (ICommentBiz) BlogBeanFactory.getBean("commentBiz");
		commentBizImpl.addComment(messageId, comment);
		URI uri = uriInfo.getAbsolutePathBuilder().path(comment.getId().toString()).build();
		return Response.created(uri).status(Status.CREATED).entity(comment).build();
	}

	public Response updateComment(Long messageId, long id, Comment comment, UriInfo uriInfo) {
		ICommentBiz commentBizImpl = (ICommentBiz) BlogBeanFactory.getBean("commentBiz");
		commentBizImpl.updateComment(messageId, id, comment);
		URI uri = uriInfo.getAbsolutePathBuilder().path(messageId.toString()).build();
		return Response.created(uri).status(Status.OK).entity(comment).build();
	}

	public Response deleteComment(long messageId, Long commentId, UriInfo uriInfo) {
		ICommentBiz commentBizImpl = (ICommentBiz) BlogBeanFactory.getBean("commentBiz");
		commentBizImpl.deleteComment(messageId, commentId);
		URI uri = uriInfo.getAbsolutePathBuilder().path(commentId.toString()).build();
		return Response.created(uri).status(Status.OK).build();
	}

	public Comment getMessage(long messageId, long commentId) {
		ICommentBiz commentBizImpl = (ICommentBiz) BlogBeanFactory.getBean("commentBiz");
		commentBizImpl.getComment(messageId, commentId);
		return null;
	}

}
