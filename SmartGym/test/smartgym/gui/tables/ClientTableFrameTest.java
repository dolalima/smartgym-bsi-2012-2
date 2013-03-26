/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import smartgym.controllers.ClientJpaController;
import smartgym.models.entities.Client;
import smartgym.persistence.PersistenceUnit;

/**
 *
 * @author Carlos
 */
public class ClientTableFrameTest {
    
    ClientJpaController clientController;
    
    
    public ClientTableFrameTest() {
        
    }
    
    @Before
    public void setUp() { 
        PersistenceUnit.start();
        clientController = new ClientJpaController(PersistenceUnit.getEntityManagerFactory());
    }
    
    @After
    public void tearDown() {
        PersistenceUnit.close();
    }

    @Test
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        List objectList = clientController.findClientEntities();
        ClientTableFrame instance = new ClientTableFrame();
        instance.setObjectList(objectList);
        instance.fillTable();
        instance.getObjectTable().setRowSelectionInterval(0, 0);
        Object expResult = objectList.get(0);
        
        assertEquals(expResult, instance.getSelectRow());
        
    }

    
    @Test
    public void testUpdateTable() {
        System.out.println("updateTable");
        List objectList = clientController.findClientEntities();
        ClientTableFrame instance = new ClientTableFrame();
        instance.setObjectList(objectList);
        instance.updateTable();
        
    }

    @Test
    public void testFillTable() {
        System.out.println("fillTable");
        List objectList = clientController.findClientEntities();
        ClientTableFrame instance = new ClientTableFrame();
        instance.setObjectList(objectList);
        instance.fillTable();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(instance);
        frame.setVisible(true);
    }
    
    @Test
    public void testSetObjectlist(){
        System.out.println("setObjectlist");
        List objectList = clientController.findClientEntities();
        ClientTableFrame instance = new ClientTableFrame();
        instance.setObjectList(objectList);
    }
}