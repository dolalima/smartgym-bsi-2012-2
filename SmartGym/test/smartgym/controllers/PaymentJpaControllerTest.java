/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.models.entities.Payment;

/**
 *
 * @author Carlos
 */
public class PaymentJpaControllerTest {
    
    public PaymentJpaControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PaymentJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Payment payment = null;
        PaymentJpaController instance = null;
        instance.create(payment);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Payment payment = null;
        PaymentJpaController instance = null;
        instance.edit(payment);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        PaymentJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPaymentEntities_0args() {
        System.out.println("findPaymentEntities");
        PaymentJpaController instance = null;
        List expResult = null;
        List result = instance.findPaymentEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPaymentEntities_int_int() {
        System.out.println("findPaymentEntities");
        int maxResults = 0;
        int firstResult = 0;
        PaymentJpaController instance = null;
        List expResult = null;
        List result = instance.findPaymentEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPayment() {
        System.out.println("findPayment");
        Long id = null;
        PaymentJpaController instance = null;
        Payment expResult = null;
        Payment result = instance.findPayment(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPaymentCount() {
        System.out.println("getPaymentCount");
        PaymentJpaController instance = null;
        int expResult = 0;
        int result = instance.getPaymentCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}