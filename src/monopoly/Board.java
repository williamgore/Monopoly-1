/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author r.pablo
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
        this.setVisible(true);
        this.setSize(1365, 2000);// change the size

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPicture = new javax.swing.JLabel();
        lbldisplay = new javax.swing.JLabel();
        lblDisplay2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnRoll = new javax.swing.JButton();
        btnHouse = new javax.swing.JButton();
        btnProperties = new javax.swing.JButton();
        btnmoney = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setIcon(new javax.swing.ImageIcon("C:\\Users\\r.pablo\\Desktop\\s-l300.jpg")); // NOI18N
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPicture);
        lblPicture.setBounds(10, 0, 1024, 1020);

        lbldisplay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbldisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldisplay.setText("Player");
        lbldisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbldisplay);
        lbldisplay.setBounds(1040, 0, 50, 40);

        lblDisplay2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDisplay2.setText("turn");
        getContentPane().add(lblDisplay2);
        lblDisplay2.setBounds(1110, 10, 40, 20);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1060, 950, 80, 30);

        btnRoll.setText("Roll");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoll);
        btnRoll.setBounds(1040, 670, 80, 23);

        btnHouse.setText("Buy houses/ Sell house");
        getContentPane().add(btnHouse);
        btnHouse.setBounds(1030, 750, 190, 30);

        btnProperties.setText("Check Properties");
        btnProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropertiesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProperties);
        btnProperties.setBounds(1040, 700, 160, 30);

        btnmoney.setText("Check Money");
        getContentPane().add(btnmoney);
        btnmoney.setBounds(1030, 810, 150, 23);

        btnSell.setText("Mortage");
        getContentPane().add(btnSell);
        btnSell.setBounds(1030, 780, 90, 23);

        lblNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(lblNumber);
        lblNumber.setBounds(1090, 10, 30, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Thanks for playing", "Monpoly", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRollActionPerformed

    private void btnPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropertiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPropertiesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHouse;
    private javax.swing.JButton btnProperties;
    private javax.swing.JButton btnRoll;
    private javax.swing.JButton btnSell;
    private javax.swing.JButton btnmoney;
    private javax.swing.JLabel lblDisplay2;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lbldisplay;
    // End of variables declaration//GEN-END:variables
}
