/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test3.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

/**
 *
 * @author BJK187
 */
public class TestConstrollerTest {
    private static final Logger logger = LoggerFactory.getLogger(TestConstrollerTest.class);
    
    public TestConstrollerTest() {
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
     * Test of sayHelloWithSpringMVC method, of class TestConstroller.
     */
    @Test
    public void testSayHelloWithSpringMVC() {
         
    
        logger.info("sayHelloWithSpringMVC");
        String name = "TEST1";
        ModelMap model = new ModelMap();
        TestConstroller instance = new TestConstroller();
        String expResult = "hello";
       /* String result = instance.sayHelloWithSpringMVC(name, model);
        assertEquals(expResult, result);
        assertEquals(expResult, result);
        
        assertTrue(model.containsKey("name"));
        assertEquals(model.get("name"),name );
        */
        

    }
}