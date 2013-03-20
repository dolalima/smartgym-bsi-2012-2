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
import smartgym.models.entities.Employee;

/**
 *
 * @author Carlos
 */
public class EmployeeJpaControllerTest {
    
    public EmployeeJpaControllerTest() {
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
        EmployeeJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Employee employee = null;
        EmployeeJpaController instance = null;
        instance.create(employee);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Employee employee = null;
        EmployeeJpaController instance = null;
        instance.edit(employee);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        EmployeeJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindEmployeeEntities_0args() {
        System.out.println("findEmployeeEntities");
        EmployeeJpaController instance = null;
        List expResult = null;
        List result = instance.findEmployeeEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindEmployeeEntities_int_int() {
        System.out.println("findEmployeeEntities");
        int maxResults = 0;
        int firstResult = 0;
        EmployeeJpaController instance = null;
        List expResult = null;
        List result = instance.findEmployeeEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindEmployee() {
        System.out.println("findEmployee");
        Long id = null;
        EmployeeJpaController instance = null;
        Employee expResult = null;
        Employee result = instance.findEmployee(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmployeeCount() {
        System.out.println("getEmployeeCount");
        EmployeeJpaController instance = null;
        int expResult = 0;
        int result = instance.getEmployeeCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}