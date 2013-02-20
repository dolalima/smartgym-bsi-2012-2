/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import smartgym.configuration.HibernateConfig;
import smartgym.controllers.AddressJpaController;
import smartgym.controllers.ContactJpaController;
import smartgym.controllers.EmployeeJpaController;
import smartgym.models.entities.Address;
import smartgym.models.entities.Contact;
import smartgym.models.entities.Employee;


/**
 *
 * @author Carlos
 */
public class SmartGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        HibernateConfig.CreatePersistenceTables();


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SmartGymPU");
        
        
        Address adress = new Address();
        adress.setStreet("Rua Jardim Betania");
        adress.setNeighborhood("Livramento");
        adress.setZipcode("55602380");
        adress.setCity("Recife");
        
        Contact contact = new Contact();
        contact.setResidencialPhone("8135230897");
        contact.setCellPhone("8196196629");
        contact.setEmail("dolalima@gmail.com");
        
        Employee person = new Employee();
        person.setName("Carlos Lima");
        person.setCpf("07005818474");
        person.setAddress(adress);
        person.setContact(contact);
        person.setPassword("12345");
        
        
        
        ContactJpaController cc = new ContactJpaController(null, emf);
        AddressJpaController ac = new AddressJpaController(null, emf);
        EmployeeJpaController pe = new EmployeeJpaController(null, emf);
        cc.create(contact);
        ac.create(adress);
        pe.create(person);
        
        
        
        emf.close();





    }
}
