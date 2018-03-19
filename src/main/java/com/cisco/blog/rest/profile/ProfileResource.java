package com.cisco.blog.rest.profile;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisco.blog.biz.profile.IProfileBiz;
import com.cisco.blog.data.profile.Profile;

public class ProfileResource implements IProfileResource {
	@Autowired
	IProfileBiz profileBiz;

	public List<Profile> getProfiles() {

		List<Profile> profiles = profileBiz.getProfiles();
		return profiles;
	}

	public Response addProfile(Profile profile, UriInfo uriInfo) {
		profileBiz.addProfile(profile);
		URI uri = uriInfo.getAbsolutePathBuilder().path(profile.getId().toString()).build();
		return Response.created(uri).status(Status.CREATED).entity(profile).build();

	}

	public Profile getProfile(String profileName) {
		Profile profile = profileBiz.getProfile(profileName);
		return profile;
	}

	public Response updateProfile(String profileName, Profile profile, UriInfo uriInfo) {
		profileBiz.updateProfile(profileName, profile);
		URI uri = uriInfo.getAbsolutePathBuilder().path(profileName).build();
		return Response.created(uri).status(Status.OK).entity(profile).build();

	}

	public Response deleteProfile(String profileName, UriInfo uriInfo) {

		profileBiz.deleteProfile(profileName);

		URI uri = uriInfo.getAbsolutePathBuilder().path(profileName).build();
		return Response.created(uri).status(Status.OK).build();

	}

	public IProfileBiz getProfileBiz() {
		return profileBiz;
	}

	public void setProfileBiz(IProfileBiz profileBiz) {
		this.profileBiz = profileBiz;
	}

}
