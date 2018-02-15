package com.cisco.blog.dao;

import java.util.List;

import com.cisco.blog.data.Blog;

public interface IBlogDao {

	public List<Blog> getBlogs();

	public Blog addBlog(Blog blog);

	public Blog updateBlog(long id, Blog blog);

	public void deleteBlog(long id);

	public Blog getBlog(long id);
}
