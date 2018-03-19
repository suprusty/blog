package com.cisco.blog.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.data.profile.Blog;
import com.cisco.blog.data.profile.IBlogEntity;
import com.cisco.blog.exception.persistence.TransactionException;
import com.cisco.blog.persistence.service.PersistenceService;

public class BlogDaoImpl implements IBlogDao {
	@Autowired
	PersistenceService persistenceService;
	public List<IBlogEntity> getBlogs() {
		List<IBlogEntity> blogs = null;
		try {
			Class entiyClass = Blog.class;
			blogs = (List<IBlogEntity>) persistenceService.getListOfObject(entiyClass);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
		return blogs;
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
