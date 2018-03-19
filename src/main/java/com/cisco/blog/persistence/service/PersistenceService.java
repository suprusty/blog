package com.cisco.blog.persistence.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.blog.data.profile.ABlog;
import com.cisco.blog.exception.persistence.TransactionException;

public class PersistenceService extends APersistenceService {
	@PersistenceContext
	public EntityManager entityManager;

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public void addObject(ABlog aBlog) throws TransactionException {
		try {
			entityManager.persist(aBlog);
		} catch (Exception e) {
			throw new TransactionException(e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public void updateObject(ABlog aBlog) throws TransactionException {
		try {
			entityManager.merge(aBlog);
		} catch (Exception e) {
			throw new TransactionException(e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public ABlog getObjectById(Long id, Class entityClass) throws TransactionException {
		ABlog aBlog = null;
		try {
			aBlog = (ABlog) entityManager.find(entityClass, id);
		} catch (Exception e) {
			throw new TransactionException(e);
		}
		return aBlog;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public List<?> getListOfObject(Class entityClass) throws TransactionException {
		List entityClassList = null;
		try {
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();
			CriteriaQuery cq = builder.createQuery(entityClass);
			Root rootEntry = cq.from(entityClass);
			cq.select(rootEntry).orderBy(builder.asc(rootEntry.get("name")));
			entityClassList = entityManager.createQuery(cq).getResultList();
		} catch (Exception e) {
			throw new TransactionException(e);
		}
		return entityClassList;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public void deleteObject(Integer id, Class entityClass) throws TransactionException {
		ABlog aBlog = null;
		try {
			aBlog = (ABlog) entityManager.find(entityClass, id);
			entityManager.remove(aBlog);
		} catch (Exception e) {
			throw new TransactionException(e);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = TransactionException.class)
	public Long getCountByBusinessAndNameText(ABlog aBlog, String namedQuery) throws TransactionException {
		Long count = null;
		try {} catch (Exception e) {
			throw new TransactionException(e);
		}
		return count;
	}
}