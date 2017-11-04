package com._a2;

import java.io.File;
import java.util.LinkedList;
/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 2 
 * Matric: 233061
 * Name: NurAinAmanina
 */


public class Files extends mainAssignment2{
    
   static LinkedList list = new LinkedList();
    
    static String Files(String PATH) {
        File folder = new File(PATH);
        File[] files = folder.listFiles();
            
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".java"))) { 
                list.add(file.getName());
                
            } else if (file.isDirectory()) {
                Files(file.getAbsolutePath());
            }
        } 
        
        return PATH + "\\" + list.get(0);
        //return PATH + "\\" + list.get(1);
    }
        

    
}
