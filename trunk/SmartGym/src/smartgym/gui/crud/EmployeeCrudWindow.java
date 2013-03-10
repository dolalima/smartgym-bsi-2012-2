/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.crud;

/**
 *
 * @author Carlos
 */
public class EmployeeCrudWindow extends CrudWindowBase {

    /**
     * Creates new form EmployeeWindow
     */
    public EmployeeCrudWindow(java.awt.Frame parent, boolean modal, CrudWindowType type) {
        super(parent, modal, type);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        personCrudPanel = new javax.swing.JPanel();
        personDataPanel = new javax.swing.JPanel();
        personNameLabel = new javax.swing.JLabel();
        personCpfLabel = new javax.swing.JLabel();
        personNameTextField = new javax.swing.JTextField();
        personCpfTextField = new javax.swing.JFormattedTextField();
        personBirthLabel = new javax.swing.JLabel();
        personBirthdayTextField = new javax.swing.JFormattedTextField();
        contactDataPanel = new javax.swing.JPanel();
        contactResidencialPhoneLabel = new javax.swing.JLabel();
        contactCellPhoneLabel = new javax.swing.JLabel();
        contactEmailLabel = new javax.swing.JLabel();
        contactResitencialPhoneTextField = new javax.swing.JFormattedTextField();
        contactCellPhoneTextField = new javax.swing.JFormattedTextField();
        contactEmailTextField = new javax.swing.JTextField();
        addressDataPanel = new javax.swing.JPanel();
        addressStreetLabel = new javax.swing.JLabel();
        addressStreetTextField = new javax.swing.JTextField();
        addressNeiborhoodLabel = new javax.swing.JLabel();
        addressNeiborhoodTextField = new javax.swing.JTextField();
        addressZipcodeLabel = new javax.swing.JLabel();
        addressComplementLabel = new javax.swing.JLabel();
        addressComplementTextField = new javax.swing.JTextField();
        addressCityLabel = new javax.swing.JLabel();
        addressCityTextField = new javax.swing.JTextField();
        addressZipcodeTextField = new javax.swing.JFormattedTextField();
        actionCrudPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        actionButton = new javax.swing.JButton();
        optionCrudPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        personCrudPanel.setLayout(new java.awt.BorderLayout());

        personDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        personNameLabel.setText("Nome:");

        personCpfLabel.setText("CPF:");

        personNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personNameTextFieldActionPerformed(evt);
            }
        });

        try {
            personCpfTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        personBirthLabel.setText("Data Nascimento:");

        try {
            personBirthdayTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout personDataPanelLayout = new javax.swing.GroupLayout(personDataPanel);
        personDataPanel.setLayout(personDataPanelLayout);
        personDataPanelLayout.setHorizontalGroup(
            personDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personDataPanelLayout.createSequentialGroup()
                        .addComponent(personNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personDataPanelLayout.createSequentialGroup()
                        .addComponent(personCpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personBirthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personBirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        personDataPanelLayout.setVerticalGroup(
            personDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personNameLabel)
                    .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personCpfLabel)
                    .addComponent(personCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personBirthLabel)
                    .addComponent(personBirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        personCrudPanel.add(personDataPanel, java.awt.BorderLayout.NORTH);

        contactDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contatos"));

        contactResidencialPhoneLabel.setText("Telefone Residencial:");

        contactCellPhoneLabel.setText("Telefone Celular:");

        contactEmailLabel.setText("E-mail:");

        try {
            contactResitencialPhoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            contactCellPhoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout contactDataPanelLayout = new javax.swing.GroupLayout(contactDataPanel);
        contactDataPanel.setLayout(contactDataPanelLayout);
        contactDataPanelLayout.setHorizontalGroup(
            contactDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactDataPanelLayout.createSequentialGroup()
                        .addComponent(contactResidencialPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactResitencialPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactCellPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactCellPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contactDataPanelLayout.createSequentialGroup()
                        .addComponent(contactEmailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        contactDataPanelLayout.setVerticalGroup(
            contactDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactResidencialPhoneLabel)
                    .addComponent(contactResitencialPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactCellPhoneLabel)
                    .addComponent(contactCellPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactEmailLabel)
                    .addComponent(contactEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        personCrudPanel.add(contactDataPanel, java.awt.BorderLayout.CENTER);

        addressDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        addressStreetLabel.setText("Logradouro:");

        addressNeiborhoodLabel.setText("Bairro:");

        addressZipcodeLabel.setText("CEP:");

        addressComplementLabel.setText("Complemento:");

        addressCityLabel.setText("Cidade:");

        addressCityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressCityTextFieldActionPerformed(evt);
            }
        });

        try {
            addressZipcodeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout addressDataPanelLayout = new javax.swing.GroupLayout(addressDataPanel);
        addressDataPanel.setLayout(addressDataPanelLayout);
        addressDataPanelLayout.setHorizontalGroup(
            addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressDataPanelLayout.createSequentialGroup()
                        .addComponent(addressStreetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addressDataPanelLayout.createSequentialGroup()
                        .addComponent(addressNeiborhoodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressNeiborhoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressZipcodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addressDataPanelLayout.createSequentialGroup()
                        .addComponent(addressComplementLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressComplementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addressDataPanelLayout.createSequentialGroup()
                        .addComponent(addressCityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        addressDataPanelLayout.setVerticalGroup(
            addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressStreetLabel)
                    .addComponent(addressStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressNeiborhoodLabel)
                    .addComponent(addressNeiborhoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressZipcodeLabel)
                    .addComponent(addressZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressComplementLabel)
                    .addComponent(addressComplementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressCityLabel)
                    .addComponent(addressCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        personCrudPanel.add(addressDataPanel, java.awt.BorderLayout.SOUTH);

        mainPanel.add(personCrudPanel, java.awt.BorderLayout.PAGE_START);

        cancelButton.setText("Cancelar");

        actionButton.setText("Ação");

        javax.swing.GroupLayout actionCrudPanelLayout = new javax.swing.GroupLayout(actionCrudPanel);
        actionCrudPanel.setLayout(actionCrudPanelLayout);
        actionCrudPanelLayout.setHorizontalGroup(
            actionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionCrudPanelLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(actionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );
        actionCrudPanelLayout.setVerticalGroup(
            actionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionCrudPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(actionButton))
                .addContainerGap())
        );

        mainPanel.add(actionCrudPanel, java.awt.BorderLayout.SOUTH);

        optionCrudPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jLabel1.setText("Senha:");

        jPasswordField1.setText("jPasswordField1");

        jLabel2.setText("Repetir Senha:");

        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ativo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        javax.swing.GroupLayout optionCrudPanelLayout = new javax.swing.GroupLayout(optionCrudPanel);
        optionCrudPanel.setLayout(optionCrudPanelLayout);
        optionCrudPanelLayout.setHorizontalGroup(
            optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionCrudPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionCrudPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionCrudPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        optionCrudPanelLayout.setVerticalGroup(
            optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionCrudPanelLayout.createSequentialGroup()
                .addGroup(optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(optionCrudPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personNameTextFieldActionPerformed

    private void addressCityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressCityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressCityTextFieldActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeCrudWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeCrudWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeCrudWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeCrudWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                EmployeeCrudWindow dialog = new EmployeeCrudWindow(new javax.swing.JFrame(), true, CrudWindowType.CREATE);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JPanel actionCrudPanel;
    private javax.swing.JLabel addressCityLabel;
    private javax.swing.JTextField addressCityTextField;
    private javax.swing.JLabel addressComplementLabel;
    private javax.swing.JTextField addressComplementTextField;
    private javax.swing.JPanel addressDataPanel;
    private javax.swing.JLabel addressNeiborhoodLabel;
    private javax.swing.JTextField addressNeiborhoodTextField;
    private javax.swing.JLabel addressStreetLabel;
    private javax.swing.JTextField addressStreetTextField;
    private javax.swing.JLabel addressZipcodeLabel;
    private javax.swing.JFormattedTextField addressZipcodeTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel contactCellPhoneLabel;
    private javax.swing.JFormattedTextField contactCellPhoneTextField;
    private javax.swing.JPanel contactDataPanel;
    private javax.swing.JLabel contactEmailLabel;
    private javax.swing.JTextField contactEmailTextField;
    private javax.swing.JLabel contactResidencialPhoneLabel;
    private javax.swing.JFormattedTextField contactResitencialPhoneTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel optionCrudPanel;
    private javax.swing.JLabel personBirthLabel;
    private javax.swing.JFormattedTextField personBirthdayTextField;
    private javax.swing.JLabel personCpfLabel;
    private javax.swing.JFormattedTextField personCpfTextField;
    private javax.swing.JPanel personCrudPanel;
    private javax.swing.JPanel personDataPanel;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField personNameTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void restart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void fillTextfields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean existDependence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void disableTextfields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
