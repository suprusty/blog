package com.cisco.blog.dao;

import java.util.List;

import com.cisco.blog.data.profile.Profile;

public interface IProfileDao {

	public List<Profile> getProfiles();

	public Profile addProfile(Profile profile);

	public Profile getProfile(String profileName);

	public Profile updateProfile(String profileName, Profile profile);

	public void deleteProfile(String profileName);

}