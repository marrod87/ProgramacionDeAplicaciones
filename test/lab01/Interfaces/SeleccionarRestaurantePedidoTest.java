/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

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
public class SeleccionarRestaurantePedidoTest {
    
    public SeleccionarRestaurantePedidoTest() {
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
     * Test of cargarCBbox method, of class SeleccionarRestaurantePedido.
     */
    @Test
    public void testCargarCBbox() {
        System.out.println("cargarCBbox");
        SeleccionarRestaurantePedido instance = new SeleccionarRestaurantePedido();
        instance.cargarCBbox();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}