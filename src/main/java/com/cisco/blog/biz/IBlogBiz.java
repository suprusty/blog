package com.cisco.blog.biz;

import java.util.List;

import com.cisco.blog.data.profile.IBlogEntity;

public interface IBlogBiz {

	public List<IBlogEntity> getBlogs();

	public IBlogEntity addBlog(IBlogEntity blog);

	public IBlogEntity updateBlog(long id, IBlogEntity blog);

	public void deleteBlog(long id);

	public IBlogEntity getBlog(long id);
}
