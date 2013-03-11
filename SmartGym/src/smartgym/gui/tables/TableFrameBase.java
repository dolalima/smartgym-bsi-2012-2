/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.util.List;
import javax.swing.JPanel;

/**
 * Classe base para criação e manipulação de tabelas referentes as entidades
 * basicas do sistema.
 *
 * @author Carlos Eduardo de Souza Lima
 */
public abstract class TableFrameBase extends JPanel {

    protected abstract Object getSelectedRow();    

    protected abstract void updateSelectedRow();

    protected abstract void updateTable();

    protected abstract void fillTable(List objectList);
}
