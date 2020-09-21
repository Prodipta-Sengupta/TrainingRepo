 
package com.example.training1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("greet")
public class GreetingService {
	/**
     * Default constructor. 
     */
    public GreetingService() {
        // TODO Auto-generated constructor stub
		//Added another comment to test build
		//Comment 2
    }


    /**
     * Retrieves representation of an instance of GreetingService
     * @return an instance of String
     */
	@GET
	@Produces("text/plain")
	public String resourceMethodGET() { 
		return "Greetings! welcome to Updated DevOps Tools Discussion";
	}


	@GET
	@Path("hello")
	@Produces("text/plain")
	public String resourceMethodGET2() { 
		return "Hello! Welcome to Jenkins CICD";
	}
	
	@GET
	@Path("hi")
	@Produces("text/plain")
	public String resourceMethodGET3() { 
		return "Hi! Welcome to Jenkins CICD course";
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
