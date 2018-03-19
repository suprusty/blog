package com.cisco.blog.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.cisco.blog.data.profile.Comment;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public interface ICommentResource {

	
	
	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageId);
	
	@POST
	public Response addComment(@PathParam("messageId") long messageId, Comment comment,@Context UriInfo uriInfo);
	
	@PUT
	@Path("/{commentId}")
	public Response updateComment(@PathParam("messageId") Long messageId, @PathParam("commentId") long id, Comment comment,@Context UriInfo uriInfo) ;
	
	@DELETE
	@Path("/{commentId}")
	public Response deleteComment(@PathParam("messageId") long messageId, @PathParam("commentId") Long commentId,@Context UriInfo uriInfo);
	
	@GET
	@Path("/{commentId}")
	public Comment getMessage(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId);
	
}