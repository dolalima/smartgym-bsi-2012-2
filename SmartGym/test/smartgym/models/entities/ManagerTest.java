/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class ManagerTest {
    
    public ManagerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Manager instance = new Manager();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Manager instance = new Manager();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Manager instance = new Manager();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Manager instance = new Manager();
        instance.setLogin(login);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Manager instance = new Manager();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Manager instance = new Manager();
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Manager instance = new Manager();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Manager instance = new Manager();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Manager instance = new Manager();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}