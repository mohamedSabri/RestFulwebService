package com.websevice.restful.firstApp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepository alienRepo = new AlienRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("getAlien")
	public List<Alien> getAliens() {
		System.err.println(" getAlien called .......");

		return alienRepo.getAliens();
	}
}
