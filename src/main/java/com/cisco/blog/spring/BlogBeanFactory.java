package com.cisco.blog.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BlogBeanFactory   {

	/**
	 * spring-context.xml file needs to be in the application classpath.
	 */
	private static final String S_CONFIGFILES = "application/spring/spring-context.xml";

	private static BeanFactory _beanFactory = null;
	private static BlogBeanFactory _fac = null;
	
	public static BlogBeanFactory getInstance() {
			if (_fac == null ) {
				_fac = new BlogBeanFactory();
				ApplicationContext context = new ClassPathXmlApplicationContext(S_CONFIGFILES);
				_beanFactory = context;				
			}

			return _fac;
	}
	
	/**
	 * Instantiate an object based on a supplied bean name. The bean name corresponds to an entry in the spring-context.xml file.
	 * @param beanName
	 * @return The spring object. If no bean is found a NULL is returned.
	 */
	public static Object getBean(String beanName) {
		if ( _beanFactory == null ) {
			getInstance();
		}
		return _beanFactory.getBean(beanName);
	}
	
}
