/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
     * Test of getEntityManager method, of class PaymentJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PaymentJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PaymentJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Payment payment = null;
        PaymentJpaController instance = null;
        instance.create(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class PaymentJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Payment payment = null;
        PaymentJpaController instance = null;
        instance.edit(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class PaymentJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        PaymentJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPaymentEntities method, of class PaymentJpaController.
     */
    @Test
    public void testFindPaymentEntities_0args() {
        System.out.println("findPaymentEntities");
        PaymentJpaController instance = null;
        List expResult = null;
        List result = instance.findPaymentEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPaymentEntities method, of class PaymentJpaController.
     */
    @Test
    public void testFindPaymentEntities_int_int() {
        System.out.println("findPaymentEntities");
        int maxResults = 0;
        int firstResult = 0;
        PaymentJpaController instance = null;
        List expResult = null;
        List result = instance.findPaymentEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPayment method, of class PaymentJpaController.
     */
    @Test
    public void testFindPayment() {
        System.out.println("findPayment");
        Long id = null;
        PaymentJpaController instance = null;
        Payment expResult = null;
        Payment result = instance.findPayment(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentCount method, of class PaymentJpaController.
     */
    @Test
    public void testGetPaymentCount() {
        System.out.println("getPaymentCount");
        PaymentJpaController instance = null;
        int expResult = 0;
        int result = instance.getPaymentCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}