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
        Long expResult = 1l;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1l;
        Contact instance = new Contact();
        instance.setId(id);
        
    }

    @Test
    public void testGetResidencialPhone() {
        System.out.println("getResidencialPhone");
        Contact instance = new Contact();
        String expResult = "(81)3523-6946";
        instance.setResidencialPhone(expResult);
        String result = instance.getResidencialPhone();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetResidencialPhone() {
        System.out.println("setResidencialPhone");
        String residencialPhone = "(81)3523-6946";
        Contact instance = new Contact();
        instance.setResidencialPhone(residencialPhone);
        
    }

    @Test
    public void testGetCellPhone() {
        System.out.println("getCellPhone");
        Contact instance = new Contact();
        String expResult = "(81)8619-6629";
        instance.setCellPhone(expResult);
        String result = instance.getCellPhone();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCellPhone() {
        System.out.println("setCellPhone");
        String cellPhone = "(81)8619-6629";
        Contact instance = new Contact();
        instance.setCellPhone(cellPhone);        
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Contact instance = new Contact();
        
        String expResult = "dolalima@gmail.com";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "dolalima@gmail.com";
        Contact instance = new Contact();
        instance.setEmail(email);
        
    }

}