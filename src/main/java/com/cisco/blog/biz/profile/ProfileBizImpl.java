package com.cisco.blog.biz.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.dao.IProfileDao;
import com.cisco.blog.data.profile.Profile;

public class ProfileBizImpl implements IProfileBiz {
	@Autowired
	IProfileDao iProfileDao;
	public IProfileDao getiProfileDao() {
		return iProfileDao;
	}

	public void setiProfileDao(IProfileDao iProfileDao) {
		this.iProfileDao = iProfileDao;
	}

	public List<Profile> getProfiles() {
		
		return iProfileDao.getProfiles();

	}

	public Profile addProfile(Profile profile) {
		
		return iProfileDao.addProfile(profile);
	}

	public Profile getProfile(String profileName) {
		
		return iProfileDao.getProfile(profileName);
	}

	public Profile updateProfile(String profileName, Profile profile) {
		
		return iProfileDao.updateProfile(profileName, profile);
	}

	public void deleteProfile(String profileName) {
		
		iProfileDao.deleteProfile(profileName);
	}

}
