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
public class DataPromocionalTest {
    
    public DataPromocionalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setActiva method, of class DataPromocional.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");
        boolean activa = false;
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setActiva(activa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getActiva method, of class DataPromocional.
     */
    @Test
    public void testGetActiva() {
        System.out.println("getActiva");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        boolean expResult = true;
        boolean result = instance.getActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNombre method, of class DataPromocional.
     */
    @Test
    public void testGetDataNombre() {
        System.out.println("getDataNombre");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        String expResult = "promo";
        String result = instance.getDataNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNombre method, of class DataPromocional.
     */
    @Test
    public void testSetDataNombre() {
        System.out.println("setDataNombre");
        String DataNombre = "promo";
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setDataNombre(DataNombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDescripcion method, of class DataPromocional.
     */
    @Test
    public void testGetDataDescripcion() {
        System.out.println("getDataDescripcion");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        String expResult = "pizza";
        String result = instance.getDataDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDescripcion method, of class DataPromocional.
     */
    @Test
    public void testSetDataDescripcion() {
        System.out.println("setDataDescripcion");
        String DataDescripcion = "pizza";
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setDataDescripcion(DataDescripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPrecio method, of class DataPromocional.
     */
    @Test
    public void testGetDataPrecio() {
        System.out.println("getDataPrecio");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        double expResult = 100.0;
        double result = instance.getDataPrecio();
        assertEquals(expResult, result, 100.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPrecio method, of class DataPromocional.
     */
    @Test
    public void testSetDataPrecio() {
        System.out.println("setDataPrecio");
        double DataPrecio = 100.0;
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setDataPrecio(DataPrecio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataImagen method, of class DataPromocional.
     */
    @Test
    public void testGetDataImagen() {
        System.out.println("getDataImagen");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        String expResult = "hola";
        String result = instance.getDataImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataImagen method, of class DataPromocional.
     */
    @Test
    public void testSetDataImagen() {
        System.out.println("setDataImagen");
        String DataImagen = "hola";
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setDataImagen(DataImagen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class DataPromocional.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        double descuento = 20.0;
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class DataPromocional.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        DataPromocional instance = new DataPromocional(true, 20.0, "promo", "pizza", 100.0, "hola");
        double expResult = 20.0;
        double result = instance.getDescuento();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
