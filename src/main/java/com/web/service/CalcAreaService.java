/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class CalcAreaService {

    private static Map<Integer, String> types;

    static {
        types = new LinkedHashMap<>();
        types.put(1, "圓面積");
        types.put(2, "球體積");

    }

    private String getTypeName(int valueOfType) {
        return types.get(valueOfType);
    }

    private double getAreaResult(int valueOfType, int radio) {
        double result = 0.0;

        switch (valueOfType) {
            case 1: //圓面積
                result = Math.pow(radio, 2) * Math.PI;
                break;
            case 2: //球體積
                result = Math.pow(radio, 3) * Math.PI * 4 / 3;
                break;
        }
        return result;
    }

    public List<Map> getFinalResult(String[] typesOfYouWantCalc, String[] stringsOfRadios) {
        List<Map> resultList = new ArrayList<Map>();
        for (int i = 0; i < typesOfYouWantCalc.length; i++) {
            if (stringsOfRadios[i].equals("") || stringsOfRadios[i] == null) {
                stringsOfRadios[i] = "0";
            }
            int radio = Integer.parseInt(stringsOfRadios[i]);
            int typeOfValue = Integer.parseInt(typesOfYouWantCalc[i]);
            String resultAreaOfTwoDigital = String.format("%.2f", getAreaResult(typeOfValue, radio));
            Map map = new LinkedHashMap();
            map.put("Radio", radio);
            map.put("Result", resultAreaOfTwoDigital);
            map.put("TypeName", getTypeName(typeOfValue));

            resultList.add(map);   
        }

        return resultList;
    }

}
