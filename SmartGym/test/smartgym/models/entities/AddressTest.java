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
public class AddressTest {
    
    public AddressTest() {
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
        Address instance = new Address();
        instance.setId(1l);
        Long expResult = 1l;
        Long result = instance.getId();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1l;
        Address instance = new Address();
        instance.setId(id);        
    }

    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Address instance = new Address();
        instance.setStreet("Rua Jardim Betânia nº75");
        String expResult = "Rua Jardim Betânia nº75";
        String result = instance.getStreet();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "Rua Jardim Betânia nº75";
        Address instance = new Address();
        instance.setStreet(street);        
    }

    @Test
    public void testGetNeighborhood() {
        System.out.println("getNeighborhood");
        Address instance = new Address();
        instance.setNeighborhood("Livramento");
        String expResult = "Livramento";
        String result = instance.getNeighborhood();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetNeighborhood() {
        System.out.println("setNeighborhood");
        String neighborhood = "Livramento";
        Address instance = new Address();
        instance.setNeighborhood(neighborhood);
        
    }

    @Test
    public void testGetComplement() {
        System.out.println("getComplement");
        Address instance = new Address();
        instance.setComplement("Casa");
        String expResult = "Casa";
        String result = instance.getComplement();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetComplement() {
        System.out.println("setComplement");
        String complement = "Casa";
        Address instance = new Address();
        instance.setComplement(complement);        
    }

    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address();
        instance.setCity("Vitória de Santo Antão");
        String expResult = "Vitória de Santo Antão";
        String result = instance.getCity();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "Vitória de Santo Antão";
        Address instance = new Address();
        instance.setCity(city);
    }

    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Address instance = new Address();
        instance.setZipcode("55602-380");
        String expResult = "55602-380";
        String result = instance.getZipcode();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetZipcode() {
        System.out.println("setZipcode");
        String zipcode = "55602-380";
        Address instance = new Address();
        instance.setZipcode(zipcode);        
    }
}