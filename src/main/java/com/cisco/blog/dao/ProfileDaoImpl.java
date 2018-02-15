package com.cisco.blog.dao;

import java.util.List;

import com.cisco.blog.data.profile.Profile;
import com.cisco.blog.exception.persistence.TransactionException;
import com.cisco.blog.persistence.service.PersistenceService;
import com.cisco.blog.spring.BlogBeanFactory;

public class ProfileDaoImpl implements IProfileDao {

	public List<Profile> getProfiles() {

		PersistenceService persistenceService = (PersistenceService) BlogBeanFactory.getBean("persistenceService");
		List<Profile> shipmentTypeList = null;
		try {
			Class entiyClass = Profile.class;
			shipmentTypeList = (List<Profile>) persistenceService.getListOfObject(entiyClass);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
		return shipmentTypeList;

	}

	public Profile addProfile(Profile profile) {
		try {
			PersistenceService persistenceService = (PersistenceService) BlogBeanFactory.getBean("persistenceService");
			persistenceService.addObject(profile);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
		return profile;
	}

	public Profile getProfile(String profileName) {

		PersistenceService persistenceService = (PersistenceService) BlogBeanFactory.getBean("persistenceService");
		Profile profile = null;
		try {
			Class entiyClass = Profile.class;
			profile = (Profile) persistenceService.getObjectById(123, entiyClass);
		} catch (TransactionException e) {
			e.printStackTrace();
		}

		return profile;

	}

	public Profile updateProfile(String profileName, Profile profile) {

		return null;
	}

	public void deleteProfile(String profileName) {

	}

}
