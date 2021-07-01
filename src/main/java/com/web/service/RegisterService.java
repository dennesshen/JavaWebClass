/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author dennesshen
 */
public class RegisterService {
    private static Map<Integer, String> times;
    static  {
        times = new LinkedHashMap<>();
        times.put(1, "早上");
        times.put(2, "下午");
        times.put(3, "晚上");
    }
    
    public List<String> getTimesName(List<Integer> times){
        
        List<String> resultTimes = times.stream().map(t -> this.times.get(t)).collect(toList());
        
        return resultTimes;
        
    }
    
    public String payOrNot(Boolean pay){
        if (pay) {
            return "已繳費";
        }
        return "未繳費";
    }
    
    
    
    
    
}
