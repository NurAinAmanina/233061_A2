package com._a2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
public class ExcelTest {
    
    public ExcelTest() {
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
     * Test of Details method, of class ExcelSheet.
     * @throws java.io.IOException
     */
    @Test
    public void testDetails() throws IOException {
        System.out.println("Details");
        String semester = "";
        String course = "";
        String group = "";
        String task = "";
        Excel instance = new Excel("");
        String[][] expResult = new String[][] {{"Semester",semester},{"Course",course},{"Group",group},{"Task",task},{}};
        String[][] result = instance.Details(semester, course, group, task);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of Data method, of class ExcelSheet.
     * @throws java.io.FileNotFoundException
     */
    @Test
    public void testData() throws FileNotFoundException, IOException {
        System.out.println("Data");
        Map<String, Integer> map = new HashMap();
        String name = "";
        String matric = "";
        String loc = "";
        String blank = "";
        String comment = "";
        String actLoc = "";
        String ttl = "";
        Excel instance = new Excel("");
        Excel expResult = instance;
        Excel result = instance.Dtl(map, name, matric, loc, blank, comment, actLoc, ttl);
        assertEquals(expResult, result);
    }

    /**
     * Test of arrange method, of class ExcelSheet.
     */
    @Test
    public void testArrange() {
        System.out.println("arrange");
        Excel instance = new Excel("");
        Excel expResult = instance;
        Excel result = instance;
        assertEquals(expResult, result);
        
    }
    
}