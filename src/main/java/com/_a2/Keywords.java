/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
package com._a2;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Keywords extends mainAssignment2 {
    
    int counter = 0;
        
    public Map<String, Integer> Keywords() throws FileNotFoundException{
        String keywords[] = {"class","extends","new","package","public","static","void"};
        Map<String,Integer> map = new TreeMap<>();
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
        Scanner input = new Scanner(FILE);
        while (input.hasNext()){ 
            String key = input.next();
            if (key.length() > 0){
                if (keywordSet.contains(key)){
                    Integer value = map.get(key);
                    counter++;
                    if (value == null)
                        value = 0;
                    value++;
                    map.put(key, value);
                }
            }
        }
        return map;
    }
    
    public int noKeywords (){
        return counter;
    }
}