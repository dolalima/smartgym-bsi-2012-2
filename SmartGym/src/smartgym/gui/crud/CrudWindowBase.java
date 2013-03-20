/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.crud;

import java.awt.Frame;
import javax.persistence.EntityManagerFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Classe base para criação, edição, exclução e vizualização
 * de entidades basicas do sistema.
 * 
 * @author Carlos Eduardo de Souza Lima
 */
public abstract class CrudWindowBase extends JDialog {
    
    private CrudWindowType windowsType;
    private final EntityManagerFactory entityManagerFactory;
    protected abstract void restart();
    protected abstract void fillTextFields();
    protected abstract void cleanTextFields();
    protected abstract void fillObject();
    protected abstract boolean existDependence();
    protected abstract void disableTextFields();
    protected abstract void enableTextFields();
    protected abstract void create();
    protected abstract void update();
    protected abstract void delete();
     
    
    public CrudWindowBase(Frame parent,boolean modal,CrudWindowType type,EntityManagerFactory emf){
        super(parent, modal);
        this.windowsType = type;
        this.entityManagerFactory = emf;
    }

    public CrudWindowType getWindowsType() {
        return windowsType;        
    }

    public void setWindowsType(CrudWindowType windowsType) {
        
        this.windowsType = windowsType;
        this.restart();
    }

    public EntityManagerFactory getEntityManagerFactory(){
        return this.entityManagerFactory;
    }   

    protected void cancel(){
        int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Sair", JOptionPane.YES_NO_OPTION);

        if(resp == JOptionPane.YES_OPTION){
            this.dispose();
            restart();
        }
    }
    
}
