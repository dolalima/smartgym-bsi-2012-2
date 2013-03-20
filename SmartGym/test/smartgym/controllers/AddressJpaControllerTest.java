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
import smartgym.models.entities.Address;

/**
 *
 * @author Carlos
 */
public class AddressJpaControllerTest {
    
    public AddressJpaControllerTest() {
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
        AddressJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Address address = null;
        AddressJpaController instance = null;
        instance.create(address);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Address address = null;
        AddressJpaController instance = null;
        instance.edit(address);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        AddressJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAddressEntities_0args() {
        System.out.println("findAddressEntities");
        AddressJpaController instance = null;
        List expResult = null;
        List result = instance.findAddressEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAddressEntities_int_int() {
        System.out.println("findAddressEntities");
        int maxResults = 0;
        int firstResult = 0;
        AddressJpaController instance = null;
        List expResult = null;
        List result = instance.findAddressEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAddress() {
        System.out.println("findAddress");
        Long id = null;
        AddressJpaController instance = null;
        Address expResult = null;
        Address result = instance.findAddress(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAddressCount() {
        System.out.println("getAddressCount");
        AddressJpaController instance = null;
        int expResult = 0;
        int result = instance.getAddressCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}