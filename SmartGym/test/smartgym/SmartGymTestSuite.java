/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import smartgym.controllers.AddressJpaControllerTest;
import smartgym.gui.tables.ClientTableFrameTest;
import smartgym.gui.tables.PaymentTableFrameTest;
import smartgym.gui.tables.TableFrameBaseTest;
import smartgym.models.entities.AddressTest;
import smartgym.models.entities.ClientTest;
import smartgym.models.entities.ContactTest;
import smartgym.models.entities.EmployeeTest;
import smartgym.models.entities.PaymentTest;
import smartgym.models.entities.PersonTest;


/**
 *
 * @author Carlos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    // Entities
    AddressTest.class,
    ClientTest.class,
    ContactTest.class,
    EmployeeTest.class,
    PaymentTest.class,
    PersonTest.class,
    // Tabelas
    ClientTableFrameTest.class,
    PaymentTableFrameTest.class,
    TableFrameBaseTest.class
    // Controladores
    //AddressJpaControllerTest.class
        
        
    
})
public class SmartGymTestSuite {
    
}