package com._a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 2 
 * Matric: 233061
 * Name: NurAinAmanina
 */

public class mainAssignment2 {
    
        final String PATH = "C:\\Users\\admin\\Desktop\\TestFileAsg2";
        
       final File FILE  = new File (Files.Files(PATH));
  
        final static String FILE_NAME = "Display Result.xls";
      
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        //scan details from comment
        Comment scan = new Comment();
        String sem = scan.getSem();
        String course = scan.getCourse();
        String grp = scan.getGroup();
        String task = scan.getTask();
        String name = scan.getName();
        String matric = scan.getMatric();
        
        //count lines of codes
        CountLineOfCodes  count = new CountLineOfCodes ();
        int LOC = count.countLineNumber();
        int blankLines = count.countBlankLineNumber();
        int commentLines = count.countCommentLineNumber();
        int actualLOC = LOC - blankLines - commentLines;
        String ttlLines = Integer.toString(LOC);
        String blank = Integer.toString(blankLines);
        String comment = Integer.toString(commentLines);
        String act = Integer.toString(actualLOC);
        
        //count number of keywords
        Keywords key = new Keywords();
        Map<String,Integer> map = key.Keywords();
        
        //count total values
        int counter = key.noKeywords();
        int totalVal = actualLOC + counter;
        String ttlVal = Integer.toString(totalVal);
        
        //display output in Excel
        Excel excel = new Excel(FILE_NAME);
        excel.Details(sem, course, grp, task);
        excel.Dtl(map, name, matric, ttlLines, blank, comment, act, ttlVal);
        excel.organize();
        
        System.out.println("Done creating Excel File!");
        
        
    }    
}