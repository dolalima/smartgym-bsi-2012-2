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
import smartgym.models.entities.Contact;

/**
 *
 * @author Carlos
 */
public class ContactJpaControllerTest {
    
    public ContactJpaControllerTest() {
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
        ContactJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Contact contact = null;
        ContactJpaController instance = null;
        instance.create(contact);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Contact contact = null;
        ContactJpaController instance = null;
        instance.edit(contact);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        ContactJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindContactEntities_0args() {
        System.out.println("findContactEntities");
        ContactJpaController instance = null;
        List expResult = null;
        List result = instance.findContactEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindContactEntities_int_int() {
        System.out.println("findContactEntities");
        int maxResults = 0;
        int firstResult = 0;
        ContactJpaController instance = null;
        List expResult = null;
        List result = instance.findContactEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindContact() {
        System.out.println("findContact");
        Long id = null;
        ContactJpaController instance = null;
        Contact expResult = null;
        Contact result = instance.findContact(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetContactCount() {
        System.out.println("getContactCount");
        ContactJpaController instance = null;
        int expResult = 0;
        int result = instance.getContactCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}