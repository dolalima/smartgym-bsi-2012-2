/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class PaymentTest {
    
    public PaymentTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Payment instance = new Payment();
        instance.setId(1l);
        Long expResult = 1l;
        Long result = instance.getId();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1l;
        Payment instance = new Payment();
        instance.setId(id);
        
    }

    @Test
    public void testGetPaymentedDay() {
        System.out.println("getPaymentedDay");
        Payment instance = new Payment();
        Date expResult = new java.sql.Date(new java.util.Date().getTime());
        Date result = instance.getPaymentedDay();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPaymentedDay() {
        System.out.println("setPaymentedDay");
        Date paymentedDay = null;
        Payment instance = new Payment();
        java.util.Date date =  new java.util.Date();
        instance.setPaymentedDay(new java.sql.Date(date.getTime()));
        
    }

    @Test
    public void testGetPaymentValue() {
        System.out.println("getPaymentValue");
        Payment instance = new Payment();
        instance.setPaymentValue(55.0);
        double expResult = 55.0;
        double result = instance.getPaymentValue();
        assertEquals(expResult, result, 0.0);        
    }

    @Test
    public void testSetPaymentValue() {
        System.out.println("setPaymentValue");
        double paymentValue = 69.0;
        Payment instance = new Payment();
        instance.setPaymentValue(paymentValue);        
    }

    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Payment instance = new Payment();
        Client expResult = null;
        Client result = instance.getClient();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Client client = null;
        Payment instance = new Payment();
        instance.setClient(client);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        Payment instance = new Payment();
        Employee expResult = null;
        Employee result = instance.getEmployee();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmployee() {
        System.out.println("setEmployee");
        Employee employee = null;
        Payment instance = new Payment();
        instance.setEmployee(employee);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Payment instance = new Payment();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Payment instance = new Payment();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}