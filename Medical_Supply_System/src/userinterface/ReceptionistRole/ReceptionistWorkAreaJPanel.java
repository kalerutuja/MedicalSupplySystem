/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import Business.EcoSystem;
import Business.Hospital.Receptionist;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Surbhi
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Receptionist receptionist;
    EcoSystem ecoSystem;
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, Receptionist receptionist, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.receptionist = receptionist;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnUpdatePatient = new javax.swing.JButton();
        lblSubTitle = new javax.swing.JLabel();
        btnNewPatient = new javax.swing.JButton();
        btnAssignDoc = new javax.swing.JButton();
        btnAppHistory = new javax.swing.JButton();

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "DOB", "Assigned Doctor", "Last Appointment Date"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        btnUpdatePatient.setText("Update Patient");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        lblSubTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubTitle.setText("Active Patients");

        btnNewPatient.setText("Add New Patient");
        btnNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPatientActionPerformed(evt);
            }
        });

        btnAssignDoc.setText("Assign Doctor");
        btnAssignDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDocActionPerformed(evt);
            }
        });

        btnAppHistory.setText("Appointment History");
        btnAppHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnUpdatePatient)
                        .addGap(18, 18, 18)
                        .addComponent(btnAssignDoc)
                        .addGap(18, 18, 18)
                        .addComponent(btnAppHistory)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblSubTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewPatient)
                    .addComponent(btnUpdatePatient)
                    .addComponent(btnAssignDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppHistory))
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
        UpdatePatientJPanel upjp = new UpdatePatientJPanel(userProcessContainer, receptionist, ecoSystem);     
        userProcessContainer.add("UpdatePatientJPanel",upjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
        
    }//GEN-LAST:event_btnUpdatePatientActionPerformed

    private void btnAssignDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDocActionPerformed
        // TODO add your handling code here:
        AssignDoctorJPanel adjp = new AssignDoctorJPanel(userProcessContainer, receptionist, ecoSystem);     
        userProcessContainer.add("AssignDoctorJPanel",adjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnAssignDocActionPerformed

    private void btnNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPatientActionPerformed
        // TODO add your handling code here:
        
       AddNewPatientJPanel anpjp = new AddNewPatientJPanel
        (userProcessContainer, receptionist, ecoSystem);     
        userProcessContainer.add("AddNewPatientJPanel",anpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
        
        
    }//GEN-LAST:event_btnNewPatientActionPerformed

    private void btnAppHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppHistoryActionPerformed
        // TODO add your handling code here:
        ViewAppHistoryJPanel vahjp = new ViewAppHistoryJPanel
        (userProcessContainer, receptionist, ecoSystem);     
        userProcessContainer.add("ViewAppHistoryJPanel",vahjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnAppHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppHistory;
    private javax.swing.JButton btnAssignDoc;
    private javax.swing.JButton btnNewPatient;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}