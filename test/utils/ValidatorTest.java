/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package utils;

import modelo.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Estremor
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

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


    /**
     * Test of isNumeric method, of class Validator.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = false;
        boolean result = Validator.isNumeric(str);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of validaPersona method, of class Validator.
     */
    @Test
    public void testValidaPersona() {
        System.out.println("validaPersona");
        Persona p = new Persona();
        p.setDocumento("");
        p.setNombre("Miguel");
        p.setRol("");
        boolean expResult = false;
        boolean result = Validator.validaPersona(p);
        assertEquals(expResult, result);
      
    }
    
}
