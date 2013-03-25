/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.controllers;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.models.entities.Address;
import smartgym.models.entities.Contact;
import smartgym.models.entities.Manager;
import smartgym.models.entities.exceptions.CpfInvalidException;
import smartgym.persistence.PersistenceUnit;

/**
 *
 * @author Carlos
 */
public class ManagerJpaControllerTest {
    
    public ManagerJpaControllerTest() {
    }
    
    @Before
    public void setUp() {
        PersistenceUnit.start();
    }
    
    @After
    public void tearDown() {
        PersistenceUnit.close();
    }

    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ManagerJpaController instance = new ManagerJpaController(PersistenceUnit.getEntityManagerFactory());        
        EntityManager expResult = PersistenceUnit.getEntityManagerFactory().createEntityManager();
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);        
    }

    @Test
    public void testCreate() throws CpfInvalidException {
        System.out.println("create");
        Manager manager = new Manager();
        manager.setName("Carlos Eduardo de Souza Lima");
        manager.setCpf("070.058.184-74");
        Date date = new Date();
        date.setDate(24);
        date.setMonth(3);
        date.setYear(1985);
        manager.setBirthday((java.sql.Date) date);
        Contact contact = new Contact();
        contact.setCellPhone("(81)8619-6629");
        contact.setResidencialPhone("(81)3523-6946");
        contact.setEmail("dolalima@gmail.com");
        manager.setContact(contact);
        Address address = new Address();
        address.setStreet("Rua Jardim Betânia nº 75");
        address.setNeighborhood("Livrament");
        address.setZipcode("55602-380");
        address.setCity("Vitória de Santo Antão");
        manager.setAddress(address);
        manager.setPassword("lima1807");
        ManagerJpaController instance = new ManagerJpaController(PersistenceUnit.getEntityManagerFactory());
        instance.create(manager);
        
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Manager manager = null;
        ManagerJpaController instance = null;
        instance.edit(manager);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Long id = null;
        ManagerJpaController instance = null;
        instance.destroy(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindManagerEntities_0args() {
        System.out.println("findManagerEntities");
        ManagerJpaController instance = null;
        List expResult = null;
        List result = instance.findManagerEntities();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindManagerEntities_int_int() {
        System.out.println("findManagerEntities");
        int maxResults = 0;
        int firstResult = 0;
        ManagerJpaController instance = null;
        List expResult = null;
        List result = instance.findManagerEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindManager() {
        System.out.println("findManager");
        Long id = null;
        ManagerJpaController instance = null;
        Manager expResult = null;
        Manager result = instance.findManager(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetManagerCount() {
        System.out.println("getManagerCount");
        ManagerJpaController instance = null;
        int expResult = 0;
        int result = instance.getManagerCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}