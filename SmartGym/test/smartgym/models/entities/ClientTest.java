/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.models.entities.exceptions.PaymentDayInvalidException;

/**
 *
 * @author Carlos
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetPaymentDay() {
        System.out.println("getPaymentDay");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getPaymentDay();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetPaymentDay() throws PaymentDayInvalidException {
        System.out.println("setPaymentDay");
        int paymentDay = 0;
        Client instance = new Client();
        instance.setPaymentDay(paymentDay);
        
    }

    @Test
    public void testIsRegular() {
        System.out.println("isRegular");
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.isRegular();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetRegular() {
        System.out.println("setRegular");
        boolean regular = false;
        Client instance = new Client();
        instance.setRegular(regular);
        
    }

}