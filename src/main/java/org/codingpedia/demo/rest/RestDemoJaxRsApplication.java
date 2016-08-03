package org.codingpedia.demo.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Registers the components to be used by the JAX-RS application  
 * 
 * @author ama
 *
 */
public class RestDemoJaxRsApplication extends ResourceConfig {

    /**
	* Register JAX-RS application components.
	*/	
	public RestDemoJaxRsApplication(){
		register(RequestContextFilter.class);
		register(JacksonFeature.class);	
		register(NameResource.class);
	}
}