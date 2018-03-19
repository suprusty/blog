package com.cisco.blog.persistence.service;

import java.util.List;

import com.cisco.blog.data.profile.ABlog;
import com.cisco.blog.exception.persistence.TransactionException;


public abstract class APersistenceService
{
	abstract void addObject (ABlog aBlog) throws TransactionException;
	abstract void updateObject (ABlog aBlog) throws TransactionException;
	abstract ABlog getObjectById (Long id,Class entityClass) throws TransactionException;
	abstract List<?> getListOfObject(Class entityClass) throws TransactionException;
	abstract void deleteObject(Integer id,Class entityClass) throws TransactionException;
	abstract Long getCountByBusinessAndNameText(ABlog aBlog,String namedQuery) throws TransactionException;
}