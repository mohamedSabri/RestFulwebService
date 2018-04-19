package com.websevice.restful.firstApp;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("getAlien")
	public List<Alien> getAliens() {
		System.err.println(" getAlien called .......");
		Alien a1 = new Alien();
		a1.setName("mohamed");
		a1.setPoints(10);

		Alien a2 = new Alien();
		a2.setName("ahmed");
		a2.setPoints(20);

		List<Alien> aliensList = Arrays.asList(a1, a2);
		return aliensList;
	}
}
