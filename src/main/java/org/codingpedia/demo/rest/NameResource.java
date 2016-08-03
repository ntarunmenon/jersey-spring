package org.codingpedia.demo.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codingpedia.demo.repositories.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/name")
public class NameResource {

	@Autowired
	private NameRepository nameRepository;
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Name> getNames(){
		Name name = new Name("Al","maktoum");
		return Arrays.asList(nameRepository.findOne(1L));
	}
}
