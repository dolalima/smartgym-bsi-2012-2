/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.components;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Carlos
 */
public class CpfTextField extends JFormattedTextField{
    
    public CpfTextField(){
        super();
        try {
            this.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }
    
}
