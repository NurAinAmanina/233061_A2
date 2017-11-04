/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._a2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com._a2.mainAssignment2Test.class, com._a2.CommentTest.class, com._a2.CountLineOfCodesTest.class, com._a2.FilesTest.class, com._a2.ExcelTest.class, com._a2.KeywordsTest.class})
public class _a2Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
