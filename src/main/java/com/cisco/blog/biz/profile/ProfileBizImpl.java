package com.cisco.blog.biz.profile;

import java.util.List;

import com.cisco.blog.dao.IProfileDao;
import com.cisco.blog.data.profile.Profile;
import com.cisco.blog.spring.BlogBeanFactory;

public class ProfileBizImpl implements IProfileBiz {

	public List<Profile> getProfiles() {
		IProfileDao profileDao = (IProfileDao) BlogBeanFactory.getBean("profileDao");
		return profileDao.getProfiles();

	}

	public Profile addProfile(Profile profile) {
		IProfileDao profileDao = (IProfileDao) BlogBeanFactory.getBean("profileDao");
		return profileDao.addProfile(profile);
	}

	public Profile getProfile(String profileName) {
		IProfileDao profileDao = (IProfileDao) BlogBeanFactory.getBean("profileDao");
		return profileDao.getProfile(profileName);
	}

	public Profile updateProfile(String profileName, Profile profile) {
		IProfileDao profileDao = (IProfileDao) BlogBeanFactory.getBean("profileDao");
		return profileDao.updateProfile(profileName, profile);
	}

	public void deleteProfile(String profileName) {
		IProfileDao profileDao = (IProfileDao) BlogBeanFactory.getBean("profileDao");
		profileDao.deleteProfile(profileName);
	}

}
