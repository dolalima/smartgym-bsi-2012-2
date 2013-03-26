/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.util.List;
import javax.swing.JTable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class TableFrameBaseTest {
    
    public TableFrameBaseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetTableHeader() {
        System.out.println("getTableHeader");
        TableFrameBase instance = new TableFrameBaseImpl();
        String[] header = {"codigo","cliente","cpf"};
        instance.setTableHeader(header);
        String[] expResult = {"codigo","cliente","cpf"};
        String[] result = instance.getTableHeader();
        assertArrayEquals(expResult, result);        
    }

    @Test
    public void testSetTableHeader() {
        System.out.println("setTableHeader");
        String[] tableHeader = {"codigo","cliente","cpf"};
        TableFrameBase instance = new TableFrameBaseImpl();
        instance.setTableHeader(tableHeader);
    }

        

    public class TableFrameBaseImpl extends TableFrameBase {
    }
}