/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.controllers.PaymentJpaController;
import smartgym.models.entities.Payment;
import smartgym.persistence.PersistenceUnit;

/**
 *
 * @author Carlos
 */
public class PaymentTableFrameTest {
    
    PaymentJpaController paymentController;
    
    public PaymentTableFrameTest() {
        
    }
    
    @Before
    public void setUp() {
        PersistenceUnit.start();
        paymentController = new PaymentJpaController(PersistenceUnit.getEntityManagerFactory());
    }
    
    @After
    public void tearDown() {
        PersistenceUnit.close();
    }

    @Test
    public void testGetSelectRow() {
        System.out.println("getSelectRow");
        // Instancias
        List objectList = paymentController.findPaymentEntities();         
        PaymentTableFrame instance = new PaymentTableFrame();
        //Configuração
        instance.setObjectList(objectList);
        instance.getObjectTable().setRowSelectionInterval(0, 0);
        //Resultados
        Object expResult = objectList.get(0);
        Object result = instance.getSelectRow();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testFillTable() {
        System.out.println("fillTable");
        // Instancias
        List objectList = paymentController.findPaymentEntities();
        PaymentTableFrame instance = new PaymentTableFrame();
        // Configuração
        instance.setObjectList(objectList);
        // Execução
        instance.fillTable();
        
    }

    @Test
    public void testSetObjectList() {
        System.out.println("setObjectList");
        // Instacias
        List object = paymentController.findPaymentEntities();
        PaymentTableFrame instance = new PaymentTableFrame();
        // Execução
        instance.setObjectList(object);
        
    }
}