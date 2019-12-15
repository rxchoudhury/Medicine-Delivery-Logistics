/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageAirlinesInterface;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.AirlinerDirectory;
import Business.FlightSchedule;

/**
 *
 * @author rakesh
 */
public class ManageFlightWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightWorkAreaJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    private Airliner airliner;
    private FlightSchedule flightschedule;

    ManageFlightWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Airliner airliner) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.travelAgency = travelAgency;
        this.airliner = airliner;
        this.flightschedule = flightschedule;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createFlightBtn = new javax.swing.JButton();
        viewFlightBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Manage Flights");

        createFlightBtn.setText("Create New Flights");
        createFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightBtnActionPerformed(evt);
            }
        });

        viewFlightBtn.setText("View Flights");
        viewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addGap(76, 76, 76)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backBtn))
                .addGap(63, 63, 63)
                .addComponent(createFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightBtnActionPerformed
        // TODO add your handling code here:
        ViewFlightsJPanel panel = new ViewFlightsJPanel(userProcessContainer, travelAgency, airliner, flightschedule);
        userProcessContainer.add("ViewFlightsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFlightBtnActionPerformed

    private void createFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightBtnActionPerformed
        // TODO add your handling code here:
        CreateNewFlightJPanel panel = new CreateNewFlightJPanel(userProcessContainer, travelAgency, airliner);
        userProcessContainer.add("CreateNewFlightJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createFlightBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createFlightBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewFlightBtn;
    // End of variables declaration//GEN-END:variables
}
