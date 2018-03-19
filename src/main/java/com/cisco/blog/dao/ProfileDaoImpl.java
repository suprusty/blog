package com.cisco.blog.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.data.profile.Profile;
import com.cisco.blog.exception.persistence.TransactionException;
import com.cisco.blog.persistence.service.PersistenceService;

public class ProfileDaoImpl implements IProfileDao {
	@Autowired
	PersistenceService persistenceService;

	public List<Profile> getProfiles() {
		List<Profile> profiles = null;
		try {
			Class entiyClass = Profile.class;
			profiles = (List<Profile>) persistenceService.getListOfObject(entiyClass);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
		return profiles;

	}

	public Profile addProfile(Profile profile) {
		try {
			persistenceService.addObject(null);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
		return profile;
	}

	public Profile getProfile(String profileName) {

		Profile profile = null;
		/*	try {
			//Class entiyClass = Profile.class;
			profile = (Profile) persistenceService.getObjectById(123, Profile.class);
		} catch (TransactionException e) {
			e.printStackTrace();
		}
	*/
		return profile;

	}

	public Profile updateProfile(String profileName, Profile profile) {

		return null;
	}

	public void deleteProfile(String profileName) {

	}

}
