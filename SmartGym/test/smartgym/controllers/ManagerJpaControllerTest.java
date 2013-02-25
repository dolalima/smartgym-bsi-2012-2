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
import smartgym.models.entities.Manager;

/**
 *
 * @author Carlos
 */
public class ManagerJpaControllerTest {
    
    public ManagerJpaControllerTest() {
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
     * Test of getEntityManager method, of class ManagerJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ManagerJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ManagerJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Manager manager = null;
        ManagerJpaController instance = null;
        instance.create(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class ManagerJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Manager manager = null;
        ManagerJpaController instance = null;
        instance.edit(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ManagerJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        ManagerJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findManagerEntities method, of class ManagerJpaController.
     */
    @Test
    public void testFindManagerEntities_0args() {
        System.out.println("findManagerEntities");
        ManagerJpaController instance = null;
        List expResult = null;
        List result = instance.findManagerEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findManagerEntities method, of class ManagerJpaController.
     */
    @Test
    public void testFindManagerEntities_int_int() {
        System.out.println("findManagerEntities");
        int maxResults = 0;
        int firstResult = 0;
        ManagerJpaController instance = null;
        List expResult = null;
        List result = instance.findManagerEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findManager method, of class ManagerJpaController.
     */
    @Test
    public void testFindManager() {
        System.out.println("findManager");
        Long id = null;
        ManagerJpaController instance = null;
        Manager expResult = null;
        Manager result = instance.findManager(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManagerCount method, of class ManagerJpaController.
     */
    @Test
    public void testGetManagerCount() {
        System.out.println("getManagerCount");
        ManagerJpaController instance = null;
        int expResult = 0;
        int result = instance.getManagerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}