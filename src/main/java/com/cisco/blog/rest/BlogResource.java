package com.cisco.blog.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.cisco.blog.biz.IBlogBiz;
import com.cisco.blog.data.Blog;
import com.cisco.blog.spring.BlogBeanFactory;

public class BlogResource implements IBlogResource {

	public List<Blog> getBlogs() {
		IBlogBiz blogBizImpl = (IBlogBiz) BlogBeanFactory.getBean("blogBiz");
		List<Blog> blogs = blogBizImpl.getBlogs();
		return blogs;
	}

	public Response addBlog(Blog blog, UriInfo uriInfo) {
		IBlogBiz blogBizImpl = (IBlogBiz) BlogBeanFactory.getBean("blogBiz");
		blogBizImpl.addBlog(blog);
		URI uri = uriInfo.getAbsolutePathBuilder().path(blog.getId().toString()).build();
		return Response.created(uri).status(Status.CREATED).entity(blog).build();
	}

	public Response updateBlog(long id, Blog blog, UriInfo uriInfo) {
		IBlogBiz blogBizImpl = (IBlogBiz) BlogBeanFactory.getBean("blogBiz");
		blogBizImpl.updateBlog(id, blog);
		URI uri = uriInfo.getAbsolutePathBuilder().path(blog.getTitle()).build();
		return Response.created(uri).status(Status.OK).entity(blog).build();
	}

	public Response deleteBlog(Long id, UriInfo uriInfo) {
		IBlogBiz blogBizImpl = (IBlogBiz) BlogBeanFactory.getBean("blogBiz");
		blogBizImpl.deleteBlog(id);
		URI uri = uriInfo.getAbsolutePathBuilder().path(id.toString()).build();
		return Response.created(uri).status(Status.OK).build();
	}

	public Blog getBlog(long id, UriInfo uriInfo) {
		IBlogBiz blogBizImpl = (IBlogBiz) BlogBeanFactory.getBean("blogBiz");
		blogBizImpl.getBlog(id);
		return null;
	}

	public CommentResource getCommentResource() {

		return new CommentResource();
	}

}
