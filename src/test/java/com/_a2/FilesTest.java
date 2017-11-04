package com._a2;

import static com._a2.Files.list;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carynne
 */
public class FilesTest {
    
    public FilesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listFiles method, of class ListFiles.
     */
    @Test
    public void testListFiles() {
        System.out.println("listFiles");
        String filename = "TestFileAsg2";
        String dir = System.getProperty("user.dir"); 
        String absolutePath = dir + File.separator + filename;
        Files instance = new Files();
        String expResult = Files.Files(absolutePath);
        String result = instance.PATH + File.separator + list.get(0);
        assertEquals(expResult, result);
    }
    
}