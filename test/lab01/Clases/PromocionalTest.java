/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin
 */
public class PromocionalTest {
    
    public PromocionalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Promocional instance = new Promocional(true, 20.0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isActiva method, of class Promocional.
     */
    @Test
    public void testIsActiva() {
        System.out.println("isActiva");
        Promocional instance = new Promocional(true, 20.0);
        boolean expResult = true;
        boolean result = instance.isActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setActiva method, of class Promocional.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");
        boolean activa = true;
        Promocional instance = new Promocional(true, 20.0);
        instance.setActiva(activa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class Promocional.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        Promocional instance = new Promocional(true, 20.0);
        double expResult = 20.0;
        double result = instance.getDescuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class Promocional.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        double descuento = 20.0;
        Promocional instance = new Promocional(true, 20.0);
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPromo method, of class Promocional.
     */
    @Test
    public void testGetDataPromo() {
        System.out.println("getDataPromo");
        Promocional instance = new Promocional(true, 20.0);
        DataPromocional expResult = null;
        DataPromocional result = instance.getDataPromo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
