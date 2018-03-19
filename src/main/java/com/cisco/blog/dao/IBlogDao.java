package com.cisco.blog.dao;

import java.util.List;

import com.cisco.blog.data.profile.IBlogEntity;



public interface IBlogDao {

	public List<IBlogEntity> getBlogs();

	public IBlogEntity addBlog(IBlogEntity blog);

	public IBlogEntity updateBlog(long id, IBlogEntity blog);

	public void deleteBlog(long id);

	public IBlogEntity getBlog(long id);
}
