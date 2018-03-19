package com.cisco.blog.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.biz.IBlogBiz;
import com.cisco.blog.data.profile.Blog;
import com.cisco.blog.data.profile.IBlogEntity;

public class BlogResource implements IBlogResource {
	@Autowired
	IBlogBiz blogBizImpl;
	public IBlogBiz getBlogBizImpl() {
		return blogBizImpl;
	}

	public void setBlogBizImpl(IBlogBiz blogBizImpl) {
		this.blogBizImpl = blogBizImpl;
	}

	public List<IBlogEntity> getBlogs() {
		List<IBlogEntity> blogs = blogBizImpl.getBlogs();
		return blogs;
	}

	public Response addBlog(Blog blog, UriInfo uriInfo) {
		blogBizImpl.addBlog(blog);
		URI uri = uriInfo.getAbsolutePathBuilder().path("121").build();
		return Response.created(uri).status(Status.CREATED).entity(blog).build();
	}

	public Response updateBlog(long id, Blog blog, UriInfo uriInfo) {
		blogBizImpl.updateBlog(id, blog);
		URI uri = uriInfo.getAbsolutePathBuilder().path(blog.getCatagr()).build();
		return Response.created(uri).status(Status.OK).entity(blog).build();
	}

	public Response deleteBlog(Long id, UriInfo uriInfo) {
		blogBizImpl.deleteBlog(id);
		URI uri = uriInfo.getAbsolutePathBuilder().path(id.toString()).build();
		return Response.created(uri).status(Status.OK).build();
	}

	public Blog getBlog(long id, UriInfo uriInfo) {
		blogBizImpl.getBlog(id);
		return null;
	}

	public CommentResource getCommentResource() {

		return new CommentResource();
	}

}
