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
public class DataPedidoTest {
    
    public DataPedidoTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Before
    public void setUp() {
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
    }
    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getId method, of class DataPedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class DataPedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class DataPedido.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        int expResult = 12345;
        int result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class DataPedido.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        int fecha = 0;
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio_total method, of class DataPedido.
     */
    @Test
    public void testGetPrecio_total() {
        System.out.println("getPrecio_total");
        DataPedido instance = new DataPedido(1, 12345, 125.0, estados.ENVIADO);
        double expResult = 125.0;
        double result = instance.getPrecio_total();
        assertEquals(expResult, result, 125.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio_total method, of class DataPedido.
     */
    @Test
    public void testSetPrecio_total() {
        System.out.println("setPrecio_total");
        double precio_total = 125.0;
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        instance.setPrecio_total(precio_total);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class DataPedido.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        estados expResult = estados.ENVIADO;
        estados result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class DataPedido.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        estados estado = estados.ENVIADO;
        DataPedido instance = new DataPedido(1, 12345, 125.00, estados.ENVIADO);
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
