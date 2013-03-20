/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.configuration.HibernateConfig;
import smartgym.models.entities.Person;

/**
 *
 * @author Carlos
 */
public class PersonJpaControllerTest {
    
    private EntityManagerFactory emf;
    
    public PersonJpaControllerTest() {
    }
    
    @Before
    public void setUp() {
        HibernateConfig.CreatePersistenceTables();
        this.emf = Persistence.createEntityManagerFactory("SmartGymPU");
    }
    
    @After
    public void tearDown() {
        this.emf.close();
    }

    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PersonJpaController instance = new PersonJpaController(this.emf);
        EntityManager expResult = this.emf.createEntityManager();
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);        
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Person person = null;
        PersonJpaController instance = null;
        instance.create(person);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Person person = null;
        PersonJpaController instance = null;
        instance.edit(person);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        PersonJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPersonEntities_0args() {
        System.out.println("findPersonEntities");
        PersonJpaController instance = null;
        List expResult = null;
        List result = instance.findPersonEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPersonEntities_int_int() {
        System.out.println("findPersonEntities");
        int maxResults = 0;
        int firstResult = 0;
        PersonJpaController instance = null;
        List expResult = null;
        List result = instance.findPersonEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindPerson() {
        System.out.println("findPerson");
        Long id = null;
        PersonJpaController instance = null;
        Person expResult = null;
        Person result = instance.findPerson(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPersonCount() {
        System.out.println("getPersonCount");
        PersonJpaController instance = null;
        int expResult = 0;
        int result = instance.getPersonCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}