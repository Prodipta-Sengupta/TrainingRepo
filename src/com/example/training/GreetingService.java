 
package com.example.training;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("GreetingService")
public class GreetingService {
	/**
     * Default constructor. 
     */
    public GreetingService() {
        // TODO Auto-generated constructor stub
    }


    /**
     * Retrieves representation of an instance of GreetingService
     * @return an instance of String
     */
	@GET
	@Path("/greet")
	@Produces("text/plain")
	public String resourceMethodGET() { 
		// TODO Auto-generated method stub
		return "Greeting! Welcome to Updated REST Service";
	}

	/**
     * PUT method for updating or creating an instance of GreetingService
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}