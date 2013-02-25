/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class ClientTest {
    
    public ClientTest() {
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
     * Test of getPaymentDay method, of class Client.
     */
    @Test
    public void testGetPaymentDay() {
        System.out.println("getPaymentDay");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getPaymentDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentDay method, of class Client.
     */
    @Test
    public void testSetPaymentDay() {
        System.out.println("setPaymentDay");
        int paymentDay = 0;
        Client instance = new Client();
        instance.setPaymentDay(paymentDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRegular method, of class Client.
     */
    @Test
    public void testIsRegular() {
        System.out.println("isRegular");
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.isRegular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegular method, of class Client.
     */
    @Test
    public void testSetRegular() {
        System.out.println("setRegular");
        boolean regular = false;
        Client instance = new Client();
        instance.setRegular(regular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Client.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Client.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Client instance = new Client();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}