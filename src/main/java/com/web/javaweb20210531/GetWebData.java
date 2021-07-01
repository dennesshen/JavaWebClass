
package com.web.javaweb20210531;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetWebData {
    public static void main(String[] args) throws Exception {
        String path = "http://localhost:8080/JavaWeb20210531/index.html";
        URL url = new URL(path);
        String html = new Scanner(url.openStream())
                .useDelimiter("\\A")
                .next();
        System.out.println(html);
        
        
    }
    
}
