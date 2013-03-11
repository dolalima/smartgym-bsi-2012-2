/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * Classe base para criação e manipulação de tabelas referentes as entidades
 * basicas do sistema.
 *
 * @author Carlos Eduardo de Souza Lima
 */
public abstract class TableFrameBase extends JPanel {
    
    private JTable table;
    
    private String[] tableHeaderl;

    protected abstract Object getSelectedRow();    

    protected abstract void updateSelectedRow();

    protected abstract void updateTable();

    protected abstract void fillTable(List objectList);

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public String[] getTableHeaderl() {
        return tableHeaderl;
    }

    public void setTableHeaderl(String[] tableHeaderl) {
        this.tableHeaderl = tableHeaderl;
    }
    
    
     
           
            
}


