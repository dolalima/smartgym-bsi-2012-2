/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym;


import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import smartgym.configuration.HibernateConfig;
import smartgym.controllers.AddressJpaController;
import smartgym.controllers.ClientJpaController;
import smartgym.controllers.ContactJpaController;
import smartgym.controllers.EmployeeJpaController;
import smartgym.controllers.PaymentJpaController;


import smartgym.models.entities.Address;
import smartgym.models.entities.Client;
import smartgym.models.entities.Contact;
import smartgym.models.entities.Employee;
import smartgym.models.entities.Payment;




/**
 *
 * @author Carlos
 */
public class SmartGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
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
        
        Client person = new Client();
        person.setName("Carlos Lima");
        person.setCpf("070.058.184-74");
        person.setAddress(adress);
        person.setContact(contact);
        
        Address address2 =  new Address();
        address2.setStreet("Rua do Comercio");        
        address2.setNeighborhood("Centro");
        
        Contact contact2 = new Contact();
        contact2.setResidencialPhone("8196488652");
        contact2.setCellPhone("8136548569");
        contact2.setEmail("algustofms@gmail.com");
        
        
        Employee employee = new Employee();
        employee.setName("Augusto");
        employee.setCpf("125.546.886-85");
        employee.setAddress(address2);
        employee.setContact(contact2);
        employee.setPassword("fkdjd5546");                     
        
        
        ContactJpaController cc = new ContactJpaController(emf);
        AddressJpaController ac = new AddressJpaController(emf);
        ClientJpaController cic = new ClientJpaController(emf);
        EmployeeJpaController ec = new EmployeeJpaController(emf);
        PaymentJpaController pc = new PaymentJpaController(emf);
        
        ac.create(adress);
        cc.create(contact);
        cic.create(person); 
        
        ac.create(address2);
        cc.create(contact2);
        ec.create(employee);
        
        System.out.println(person.getId());
        System.out.println(employee.getId());
        
        Payment payment = new Payment();
        payment.setClient(person);
        payment.setEmployee(employee);
        payment.setPaymentValue(50.00);
        payment.setPaymentedDay(new Date()); 
        
        pc.create(payment);       
        
        emf.close();
        
        
        
        





    }
}
