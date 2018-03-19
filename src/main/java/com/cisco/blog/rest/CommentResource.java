package com.cisco.blog.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.biz.ICommentBiz;
import com.cisco.blog.data.profile.Comment;

public class CommentResource implements ICommentResource {
	@Autowired
	ICommentBiz commentBizImpl;
	public ICommentBiz getCommentBizImpl() {
		return commentBizImpl;
	}

	public void setCommentBizImpl(ICommentBiz commentBizImpl) {
		this.commentBizImpl = commentBizImpl;
	}

	public List<Comment> getAllComments(long messageId) {
		commentBizImpl.getAllComments(messageId);
		return null;
	}

	public Response addComment(long messageId, Comment comment, UriInfo uriInfo) {
		commentBizImpl.addComment(messageId, comment);
		URI uri = uriInfo.getAbsolutePathBuilder().path("fsadf").build();
		return Response.created(uri).status(Status.CREATED).entity(comment).build();
	}

	public Response updateComment(Long messageId, long id, Comment comment, UriInfo uriInfo) {
		commentBizImpl.updateComment(messageId, id, comment);
		URI uri = uriInfo.getAbsolutePathBuilder().path(messageId.toString()).build();
		return Response.created(uri).status(Status.OK).entity(comment).build();
	}

	public Response deleteComment(long messageId, Long commentId, UriInfo uriInfo) {
		commentBizImpl.deleteComment(messageId, commentId);
		URI uri = uriInfo.getAbsolutePathBuilder().path(commentId.toString()).build();
		return Response.created(uri).status(Status.OK).build();
	}

	public Comment getMessage(long messageId, long commentId) {
		commentBizImpl.getComment(messageId, commentId);
		return null;
	}

}
