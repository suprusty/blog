package com.cisco.blog.biz;

import java.util.List;

import com.cisco.blog.dao.IBlogDao;
import com.cisco.blog.data.Blog;
import com.cisco.blog.spring.BlogBeanFactory;

public class BlogBizImpl implements IBlogBiz {

	public List<Blog> getBlogs() {
		IBlogDao blogDao = (IBlogDao) BlogBeanFactory.getBean("blogDao");
		return blogDao.getBlogs();
	}

	public Blog addBlog(Blog blog) {
		IBlogDao blogDao = (IBlogDao) BlogBeanFactory.getBean("blogDao");
		return blogDao.addBlog(blog);
	}

	public Blog updateBlog(long id, Blog blog) {
		IBlogDao blogDao = (IBlogDao) BlogBeanFactory.getBean("blogDao");
		return blogDao.updateBlog(id, blog);
	}

	public void deleteBlog(long id) {
		IBlogDao blogDao = (IBlogDao) BlogBeanFactory.getBean("blogDao");
		blogDao.deleteBlog(id);
	}

	public Blog getBlog(long id) {
		IBlogDao blogDao = (IBlogDao) BlogBeanFactory.getBean("blogDao");
		return blogDao.getBlog(id);
	}
}
