/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author denne
 */
@Path("/hello")
public class HelloService {
    
    // Client: /JavaWeb20210531/rest/hello/john
    @Path("/john")
    @GET
    @Produces("text/plain")
    public String helloJohn() {
        return "Hello John !";
    }
    // Client: /JavaWeb20210531/rest/hello/1
    // Client: /JavaWeb20210531/rest/hello/2?score=100
    @Path("/{id}")
    @GET
    @Produces("text/plain")
    public String helloId(@PathParam("id") Integer id,
                          @DefaultValue("0")@QueryParam("score") Integer score){
        return "Hello ID = "+id+",score = "+score;
    }

}
