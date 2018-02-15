package com.cisco.blog.rest.profile;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.cisco.blog.data.profile.Profile;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface IProfileResource {

	@GET
	public List<Profile> getProfiles();

	@POST
	public Response addProfile(Profile profile, @Context UriInfo uriInfo);

	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName);

	@PUT
	@Path("/{profileName}")
	public Response updateProfile(@PathParam("profileName") String profileName, Profile profile, @Context UriInfo uriInfo);

	@DELETE
	@Path("/{profileName}")
	public Response deleteProfile(@PathParam("profileName") String profileName,@Context UriInfo uriInfo);

}