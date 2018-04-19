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

import com.cisco.blog.data.profile.IBlogEntity;
import com.cisco.blog.mongodb.data.Blog;

@Path("/blogs")
@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces(MediaType.APPLICATION_JSON)
public interface IBlogResource {


	@GET
	public List<IBlogEntity> getBlogs();
	
	@POST
	public Response addBlog(Blog blog, @Context UriInfo uriInfo);
	
	@PUT
	@Path("/{blogId}")
	public Response updateBlog(@PathParam("blogId") long id, Blog blog,@Context UriInfo uriInfo);
	
	@DELETE
	@Path("/{blogId}")
	public Response deleteBlog(@PathParam("blogId") Long id,@Context UriInfo uriInfo);
	
	
	@GET
	@Path("/{blogId}")
	public IBlogEntity getBlog(@PathParam("blogId") long id, @Context UriInfo uriInfo);

	@Path("/{blogId}/comments")
	public CommentResource getCommentResource();
}
