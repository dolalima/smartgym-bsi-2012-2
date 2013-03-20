/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.models.entities;

import java.sql.Timestamp;
import java.sql.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.models.entities.exceptions.CpfInvalidException;

/**
 *
 * @author Carlos
 */
public class PersonTest {
    
    public PersonTest() {
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
        Person instance = new Person();
        instance.setId(1l);
        Long expResult = 1l;
        Long result = instance.getId();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1l;
        Person instance = new Person();
        instance.setId(id);        
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        instance.setName("Dola Lima");
        String expResult = "Dola Lima";
        String result = instance.getName();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Dola Lima";
        Person instance = new Person();
        instance.setName(name);
    }

    @Test
    public void testGetCpf()throws Exception {
        System.out.println("getCpf");
        Person instance = new Person();       
        instance.setCpf("070.058.184.74");        
        String expResult = "070.058.184.74";
        String result = instance.getCpf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCpf() throws Exception {
        System.out.println("setCpf");
        String cpf = "070.058.184-74";
        Person instance = new Person();
        instance.setCpf(cpf);
        
    }
    
    @Test(expected= CpfInvalidException.class)
    public void testSetInvalidCpf() throws Exception {
        System.out.println("setCpf");
        String cpf = "156584624";
        Person instance = new Person();
        instance.setCpf(cpf);        
    }

    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        Person instance = new Person();
        Date date = new Date(1985, 3, 24);
        instance.setBirthday(date);
        Date expResult = new Date(1985, 3, 24);
        Date result = instance.getBirthday();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        Date birthday = new Date(1985, 3, 24);
        Person instance = new Person();
        instance.setBirthday(birthday);
    }
    
    @Test
    public void testSetBirthdayByString() {
        System.out.println("setBirthday");        
        Person instance = new Person();
        instance.setBirthday("24/03/1985");
    }

    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Person instance = new Person();
        instance.setContact(new Contact());
        Contact expResult = new Contact();
        Contact result = instance.getContact();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetContact() {
        System.out.println("setContact");
        Contact contact = new Contact();
        Person instance = new Person();
        instance.setContact(contact);
    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new Person();
        Address expResult = null;
        Address result = instance.getAddress();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Address address = new Address();
        Person instance = new Person();
        instance.setAddress(address);
    }

    @Test
    public void testIsActive() {
        System.out.println("isActive");
        Person instance = new Person();
        instance.setActive(false);
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetActive() {
        System.out.println("setActive");
        boolean active = false;
        Person instance = new Person();
        instance.setActive(active);
    }    
}