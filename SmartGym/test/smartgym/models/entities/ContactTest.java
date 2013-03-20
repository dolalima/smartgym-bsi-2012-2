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
public class ContactTest {
    
    public ContactTest() {
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
        Contact instance = new Contact();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Contact instance = new Contact();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetResidencialPhone() {
        System.out.println("getResidencialPhone");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getResidencialPhone();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetResidencialPhone() {
        System.out.println("setResidencialPhone");
        String residencialPhone = "";
        Contact instance = new Contact();
        instance.setResidencialPhone(residencialPhone);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCellPhone() {
        System.out.println("getCellPhone");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getCellPhone();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCellPhone() {
        System.out.println("setCellPhone");
        String cellPhone = "";
        Contact instance = new Contact();
        instance.setCellPhone(cellPhone);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Contact instance = new Contact();
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Contact instance = new Contact();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Contact instance = new Contact();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}