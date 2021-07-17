/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author denne
 */
@Path("bmi")
public class BMIService {
    @Path("/{height}/{weight}")
    @GET
    @Produces("text/plain")
    public String BMICalculator1(@PathParam("height") double height,
                         @PathParam("weight") double weight){
        double bmi = weight/Math.pow(height/100, 2);
        return String.format("BMI = %.2f", bmi);
    }
    
    @Path("/")
    @GET
    @Produces("text/plain")
    public String BMICalculator2(@QueryParam("h") double height,
                         @QueryParam("w") double weight){
        double bmi = weight/Math.pow(height/100, 2);
        return String.format("BMI = %.2f", bmi);
    }
}
