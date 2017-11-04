package com._a2;

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
public class CountLineOfCodesTest {
    
    public CountLineOfCodesTest() {
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
     * Test of countLineNumber method, of class CountLOC.
     */
    @Test
    public void testCountLineNumber() {
        System.out.println("countLineNumber");
        CountLineOfCodes instance = new CountLineOfCodes();
        int expResult = 24;
        int result = instance.countLineNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of countBlankLineNumber method, of class CountLOC.
     */
    @Test
    public void testCountBlankLineNumber() {
        System.out.println("countBlankLineNumber");
        CountLineOfCodes instance = new CountLineOfCodes();
        int expResult = 4;
        int result = instance.countBlankLineNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of countCommentLineNumber method, of class CountLOC.
     */
    @Test
    public void testCountCommentLineNumber() {
        System.out.println("countCommentLineNumber");
        CountLineOfCodes instance = new CountLineOfCodes();
        int expResult = 6;
        int result = instance.countCommentLineNumber();
        assertEquals(expResult, result);
    }
    
}