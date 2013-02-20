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
import smartgym.models.entities.Client;

/**
 *
 * @author Carlos
 */
public class ClientJpaControllerTest {
    
    public ClientJpaControllerTest() {
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
     * Test of getEntityManager method, of class ClientJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ClientJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ClientJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Client client = null;
        ClientJpaController instance = null;
        instance.create(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class ClientJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Client client = null;
        ClientJpaController instance = null;
        instance.edit(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ClientJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        ClientJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findClientEntities method, of class ClientJpaController.
     */
    @Test
    public void testFindClientEntities_0args() {
        System.out.println("findClientEntities");
        ClientJpaController instance = null;
        List expResult = null;
        List result = instance.findClientEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findClientEntities method, of class ClientJpaController.
     */
    @Test
    public void testFindClientEntities_int_int() {
        System.out.println("findClientEntities");
        int maxResults = 0;
        int firstResult = 0;
        ClientJpaController instance = null;
        List expResult = null;
        List result = instance.findClientEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findClient method, of class ClientJpaController.
     */
    @Test
    public void testFindClient() {
        System.out.println("findClient");
        Long id = null;
        ClientJpaController instance = null;
        Client expResult = null;
        Client result = instance.findClient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientCount method, of class ClientJpaController.
     */
    @Test
    public void testGetClientCount() {
        System.out.println("getClientCount");
        ClientJpaController instance = null;
        int expResult = 0;
        int result = instance.getClientCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
