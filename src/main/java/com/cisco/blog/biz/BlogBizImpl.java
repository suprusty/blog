package com.cisco.blog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.dao.IBlogDao;
import com.cisco.blog.data.profile.IBlogEntity;

public class BlogBizImpl implements IBlogBiz {
	@Autowired
	IBlogDao imongodbBlogDao;
	
	

	public IBlogDao getImongodbBlogDao() {
		return imongodbBlogDao;
	}

	public void setImongodbBlogDao(IBlogDao imongodbBlogDao) {
		this.imongodbBlogDao = imongodbBlogDao;
	}

	public List<IBlogEntity> getBlogs() {
		return imongodbBlogDao.getBlogs();
	}

	public IBlogEntity addBlog(IBlogEntity blog) {
		// TODO Auto-generated method stub
		return null;
	}

	public IBlogEntity updateBlog(long id, IBlogEntity blog) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBlog(long id) {
		// TODO Auto-generated method stub
		
	}

	public IBlogEntity getBlog(long id) {
		// TODO Auto-generated method stub
		return null;
	}}
