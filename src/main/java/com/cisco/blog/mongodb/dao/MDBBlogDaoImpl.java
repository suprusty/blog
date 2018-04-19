package com.cisco.blog.mongodb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import com.cisco.blog.dao.IBlogDao;
import com.cisco.blog.data.profile.IBlogEntity;
import com.cisco.blog.mongodb.data.Blog;
import com.cisco.blog.mongodb.persistence.service.MongoDbPersistenceService;


public class MDBBlogDaoImpl implements IBlogDao {

	@Autowired
	MongoDbPersistenceService mongoDbPersistenceService;

	public MongoDbPersistenceService getMongoDbPersistenceService() {
		return mongoDbPersistenceService;
	}

	public void setMongoDbPersistenceService(MongoDbPersistenceService mongoDbPersistenceService) {
		this.mongoDbPersistenceService = mongoDbPersistenceService;
	}

	public List<IBlogEntity> getBlogs() {
		MongoOperations mongoOperation = (MongoOperations)mongoDbPersistenceService.getMongoTemplate();
		List listUser = mongoOperation.findAll(Blog.class);
		return listUser;
	}

	public void addBlog(IBlogEntity blog) {
		MongoOperations mongoOperation = (MongoOperations)mongoDbPersistenceService.getMongoTemplate();
		mongoOperation.save(blog);
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
	}

}
