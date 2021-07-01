/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author dennesshen
 */
public class Lotto {
    
    public List get539(){
        List resultList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            int n = new Random().nextInt(39) + 1 ;
            resultList.add(n);
        }
        return  resultList;
        
    }
    
}
