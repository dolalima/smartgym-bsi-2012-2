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
import smartgym.models.entities.Person;

/**
 *
 * @author Carlos
 */
public class PersonJpaControllerTest {
    
    public PersonJpaControllerTest() {
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
     * Test of getEntityManager method, of class PersonJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PersonJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PersonJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Person person = null;
        PersonJpaController instance = null;
        instance.create(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class PersonJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Person person = null;
        PersonJpaController instance = null;
        instance.edit(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class PersonJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        PersonJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPersonEntities method, of class PersonJpaController.
     */
    @Test
    public void testFindPersonEntities_0args() {
        System.out.println("findPersonEntities");
        PersonJpaController instance = null;
        List expResult = null;
        List result = instance.findPersonEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPersonEntities method, of class PersonJpaController.
     */
    @Test
    public void testFindPersonEntities_int_int() {
        System.out.println("findPersonEntities");
        int maxResults = 0;
        int firstResult = 0;
        PersonJpaController instance = null;
        List expResult = null;
        List result = instance.findPersonEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPerson method, of class PersonJpaController.
     */
    @Test
    public void testFindPerson() {
        System.out.println("findPerson");
        Long id = null;
        PersonJpaController instance = null;
        Person expResult = null;
        Person result = instance.findPerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonCount method, of class PersonJpaController.
     */
    @Test
    public void testGetPersonCount() {
        System.out.println("getPersonCount");
        PersonJpaController instance = null;
        int expResult = 0;
        int result = instance.getPersonCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}