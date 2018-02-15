package com.cisco.blog.rest.profile;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.cisco.blog.biz.profile.IProfileBiz;
import com.cisco.blog.data.profile.Profile;
import com.cisco.blog.spring.BlogBeanFactory;

public class ProfileResource implements IProfileResource {

	public List<Profile> getProfiles() {
		IProfileBiz profileBizImpli = (IProfileBiz) BlogBeanFactory.getBean("profileBiz");
		List<Profile> profiles = profileBizImpli.getProfiles();
		return profiles;
	}

	public Response addProfile(Profile profile, UriInfo uriInfo) {
		IProfileBiz profileBizImpli = (IProfileBiz) BlogBeanFactory.getBean("profileBiz");
		profileBizImpli.addProfile(profile);
		URI uri = uriInfo.getAbsolutePathBuilder().path(profile.getId().toString()).build();
		return Response.created(uri).status(Status.CREATED).entity(profile).build();

	}

	public Profile getProfile(String profileName) {
		IProfileBiz profileBizImpli = (IProfileBiz) BlogBeanFactory.getBean("profileBiz");
		Profile profile = profileBizImpli.getProfile(profileName);
		return profile;
	}

	public Response updateProfile(String profileName, Profile profile, UriInfo uriInfo) {
		IProfileBiz profileBizImpli = (IProfileBiz) BlogBeanFactory.getBean("profileBiz");
		profileBizImpli.updateProfile(profileName, profile);
		URI uri = uriInfo.getAbsolutePathBuilder().path(profileName).build();
		return Response.created(uri).status(Status.OK).entity(profile).build();

	}

	public Response deleteProfile(String profileName, UriInfo uriInfo) {
		IProfileBiz profileBizImpli = (IProfileBiz) BlogBeanFactory.getBean("profileBiz");
		profileBizImpli.deleteProfile(profileName);

		URI uri = uriInfo.getAbsolutePathBuilder().path(profileName).build();
		return Response.created(uri).status(Status.OK).build();

	}

}
