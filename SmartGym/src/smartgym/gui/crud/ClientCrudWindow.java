/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.crud;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import smartgym.controllers.ClientJpaController;
import smartgym.controllers.exceptions.NonexistentEntityException;
import smartgym.models.entities.Address;
import smartgym.models.entities.Client;
import smartgym.models.entities.Contact;
import smartgym.models.entities.exceptions.CpfInvalidException;
import smartgym.models.entities.exceptions.PaymentDayInvalidException;
import smartgym.persistence.PersistenceUnit;

/**
 *
 * @author Carlos
 */
public class ClientCrudWindow extends CrudWindowBase {

    private Client client;

    /**
     * Creates new form ClientWindowDialog
     */
    public ClientCrudWindow(java.awt.Frame parent, boolean modal, CrudWindowType type, EntityManagerFactory emf) {
        super(parent, modal, type, emf);
        initComponents();
        switch (type) {
            case CREATE:
                actionButton.setText("Salvar");
                break;
            case UPDATE:
                actionButton.setText("Atualizar");
                break;
            case REMOVE:
                actionButton.setText("Remover");
                break;
            case VIEW:
                actionButton.setVisible(false);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
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
        clientActiveLabel = new javax.swing.JLabel();
        clientActiveComboBox = new javax.swing.JComboBox();
        paydayLabel = new javax.swing.JLabel();
        paydaySpinner = new javax.swing.JSpinner();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 480));
        setPreferredSize(new java.awt.Dimension(440, 480));
        setResizable(false);

        mainPanel.setPreferredSize(getPreferredSize());
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
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(16, Short.MAX_VALUE))
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
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        actionButton.setText("Ação");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionCrudPanelLayout = new javax.swing.GroupLayout(actionCrudPanel);
        actionCrudPanel.setLayout(actionCrudPanelLayout);
        actionCrudPanelLayout.setHorizontalGroup(
            actionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionCrudPanelLayout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
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

        clientActiveLabel.setText("Ativo:");

        clientActiveComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        paydayLabel.setText("Vencimento:");

        paydaySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        javax.swing.GroupLayout optionCrudPanelLayout = new javax.swing.GroupLayout(optionCrudPanel);
        optionCrudPanel.setLayout(optionCrudPanelLayout);
        optionCrudPanelLayout.setHorizontalGroup(
            optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionCrudPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientActiveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientActiveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paydayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paydaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        optionCrudPanelLayout.setVerticalGroup(
            optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionCrudPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionCrudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientActiveLabel)
                    .addComponent(clientActiveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paydayLabel)
                    .addComponent(paydaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        // TODO add your handling code here:

        switch (this.getWindowsType()) {
            case CREATE:
                this.create();
                break;
            case UPDATE:
                this.update();
                break;
            case REMOVE:
                this.delete();
                break;
        }
    }//GEN-LAST:event_actionButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.cancel();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientCrudWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PersistenceUnit.start();
                ClientCrudWindow dialog = new ClientCrudWindow(new javax.swing.JFrame(), true, CrudWindowType.CREATE, PersistenceUnit.getEntityManagerFactory());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                PersistenceUnit.close();
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
    private javax.swing.JComboBox clientActiveComboBox;
    private javax.swing.JLabel clientActiveLabel;
    private javax.swing.JLabel contactCellPhoneLabel;
    private javax.swing.JFormattedTextField contactCellPhoneTextField;
    private javax.swing.JPanel contactDataPanel;
    private javax.swing.JLabel contactEmailLabel;
    private javax.swing.JTextField contactEmailTextField;
    private javax.swing.JLabel contactResidencialPhoneLabel;
    private javax.swing.JFormattedTextField contactResitencialPhoneTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel optionCrudPanel;
    private javax.swing.JLabel paydayLabel;
    private javax.swing.JSpinner paydaySpinner;
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
        switch (this.getWindowsType()) {
            case CREATE:                
                actionButton.setText("Salvar");
                actionButton.setVisible(true);
                this.client = null;
                enableTextFields();
                cleanTextFields();
                break;
            case UPDATE:
                actionButton.setText("Atualizar");
                actionButton.setVisible(true);
                enableTextFields();
                fillTextFields();
                break;
            case REMOVE:
                actionButton.setText("Remover");
                actionButton.setVisible(true);
                fillObject();
                fillTextFields();
                break;
            case VIEW:
                actionButton.setVisible(false);
                fillObject();
                fillTextFields();
                break;
        }
    }

    @Override
    protected void fillTextFields() {
        if (client != null) {

            personNameTextField.setText(client.getName());
            personCpfTextField.setText(client.getCpf());
            personBirthdayTextField.setText(
                    new SimpleDateFormat("dd/MM/yyy").format(client.getBirthday()));

            addressStreetTextField.setText(client.getAddress().getStreet());
            addressNeiborhoodTextField.setText(client.getAddress().getNeighborhood());
            addressComplementTextField.setText(client.getAddress().getComplement());
            addressZipcodeTextField.setText(client.getAddress().getZipcode());
            addressCityTextField.setText(client.getAddress().getCity());

            contactResitencialPhoneTextField.setText(client.getContact().getResidencialPhone());
            contactCellPhoneTextField.setText(client.getContact().getCellPhone());
            contactEmailTextField.setText(client.getContact().getEmail());

            if (client.isActive()) {
                clientActiveComboBox.setSelectedIndex(0);
            } else {
                clientActiveComboBox.setSelectedIndex(1);
            }

            paydaySpinner.setValue(client.getPaymentDay());
        }
    }

    @Override
    protected boolean existDependence() {
        boolean dependence = false;
        String dependenceList = "";

        if (this.personNameTextField.getText().equals("")) {
            dependenceList = dependenceList + "-NOME-\n";
            dependence = true;
        }

        if (this.personBirthdayTextField.getText().equals("")) {
            dependenceList = dependenceList + "-DATA NASCIMENTO-\n";
            dependence = true;
        }

        if (this.personCpfTextField.getText().equals("")) {
            dependenceList = dependenceList + "-CPF-\n";
            dependence = true;
        }

        if (dependence) {
            JDialog alert = new JDialog(this, dependenceList, true);
            alert.setVisible(true);
        }


        return dependence;
    }

    /*
     * Disabilita os campos do formulario do Crud de Client.
     */
    @Override
    protected void disableTextFields() {

        personNameTextField.setEnabled(false);
        personCpfTextField.setEnabled(false);
        personBirthdayTextField.setEnabled(false);
        contactResitencialPhoneTextField.setEnabled(false);
        contactCellPhoneTextField.setEnabled(false);
        contactResitencialPhoneTextField.setEnabled(false);
        contactEmailTextField.setEnabled(false);
        addressStreetTextField.setEnabled(false);
        addressNeiborhoodTextField.setEnabled(false);
        addressComplementTextField.setEnabled(false);
        addressZipcodeTextField.setEnabled(false);
        addressCityTextField.setEnabled(false);
        paydaySpinner.setEnabled(false);
    }

    @Override
    protected void create() {
        if (!this.existDependence()) {
            fillObject();
            ClientJpaController clienteController = new ClientJpaController(this.getEntityManagerFactory());
            clienteController.create(client);

        } else {
            return;
        }
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sussesso");
        
        
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar ou Cliente?", "Sair", JOptionPane.YES_NO_OPTION);

        if(resp == JOptionPane.YES_OPTION){            
            restart();
        }else{
            this.dispose();
        }

    }

    @Override
    protected void update() {
        if (!this.existDependence()) {
            fillObject();

            ClientJpaController clienteController = new ClientJpaController(this.getEntityManagerFactory());
            try {
                clienteController.edit(client);
                JOptionPane.showMessageDialog(this, "Cliente atualizado  com sussesso");
                this.dispose();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
        }

    }

    @Override
    protected void delete() {


        ClientJpaController clienteController = new ClientJpaController(this.getEntityManagerFactory());
        try {
            clienteController.destroy(client.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void fillObject() {
        if (this.getWindowsType() == CrudWindowType.CREATE) {
            client = new Client();
            Address address = new Address();
            Contact contact = new Contact();

            client.setName(this.personNameTextField.getText());
            try {
                client.setCpf(this.personCpfTextField.getText());
            } catch (CpfInvalidException ex) {
                JOptionPane.showMessageDialog(this, "Cpf invalido.");
                return;
            }
            

            client.setBirthday(personBirthdayTextField.getText());

            if (this.clientActiveComboBox.getSelectedIndex() == 0) {
                client.setActive(true);
            } else {
                client.setActive(false);
            }

            address.setStreet(this.addressStreetTextField.getText());
            address.setNeighborhood(this.addressNeiborhoodTextField.getText());
            address.setComplement(this.addressComplementTextField.getText());
            address.setZipcode(this.addressZipcodeTextField.getText());
            address.setCity(this.addressCityTextField.getText());

            contact.setResidencialPhone(this.contactResitencialPhoneTextField.getText());
            contact.setCellPhone(this.contactCellPhoneTextField.getText());
            contact.setEmail(this.contactEmailTextField.getText());

            client.setAddress(address);
            client.setContact(contact);
            try {
                client.setPaymentDay((int) this.paydaySpinner.getValue());
            } catch (PaymentDayInvalidException ex) {
                Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            client.setName(this.personNameTextField.getText());
            try {
                client.setCpf(this.personCpfTextField.getText());
            } catch (CpfInvalidException ex) {
                JOptionPane.showMessageDialog(this, "Cpf invalido.");
                return;
            }
            client.setBirthday(this.personBirthdayTextField.getText());
            if (this.clientActiveComboBox.getSelectedIndex() == 0) {
                client.setActive(true);
            } else {
                client.setActive(false);
            }

            client.getAddress().setStreet(this.addressStreetTextField.getText());
            client.getAddress().setNeighborhood(this.addressNeiborhoodTextField.getText());
            client.getAddress().setComplement(this.addressComplementTextField.getText());
            client.getAddress().setZipcode(this.addressZipcodeTextField.getText());
            client.getAddress().setCity(this.addressCityTextField.getText());

            client.getContact().setResidencialPhone(this.contactResitencialPhoneTextField.getText());
            client.getContact().setCellPhone(this.contactCellPhoneTextField.getText());
            client.getContact().setEmail(this.contactEmailTextField.getText());
            try {
                client.setPaymentDay((int) this.paydaySpinner.getValue());
            } catch (PaymentDayInvalidException ex) {
                Logger.getLogger(ClientCrudWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             

        }

    }

    @Override
    protected void cleanTextFields() {
        if (client == null) {

            personNameTextField.setText("");
            personCpfTextField.setText("");
            personBirthdayTextField.setText("");

            addressStreetTextField.setText("");
            addressNeiborhoodTextField.setText("");
            addressComplementTextField.setText("");
            addressZipcodeTextField.setText("");
            addressCityTextField.setText("");

            contactResitencialPhoneTextField.setText("");
            contactCellPhoneTextField.setText("");
            contactEmailTextField.setText("");

            clientActiveComboBox.setSelectedIndex(0);

            paydaySpinner.setValue(1);
        }
    }

    @Override
    protected void enableTextFields() {
        personNameTextField.setEnabled(true);
        personCpfTextField.setEnabled(true);
        personBirthdayTextField.setEnabled(true);
        contactResitencialPhoneTextField.setEnabled(true);
        contactCellPhoneTextField.setEnabled(true);
        contactResitencialPhoneTextField.setEnabled(true);
        contactEmailTextField.setEnabled(true);
        addressStreetTextField.setEnabled(true);
        addressNeiborhoodTextField.setEnabled(true);
        addressComplementTextField.setEnabled(true);
        addressZipcodeTextField.setEnabled(true);
        addressCityTextField.setEnabled(true);
        paydaySpinner.setEnabled(true);
        
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
