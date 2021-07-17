/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


/**
 *
 * @author denne
 */
@ApplicationPath("/rest")
public class MyRestApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new LinkedHashSet();
        classes.add(HelloService.class);
        classes.add(BMIService.class);
        classes.add(BookService.class);
        return classes;
    }
    
 

}
