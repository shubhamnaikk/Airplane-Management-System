/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airplane;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Payment extends javax.swing.JFrame {


    /**
     * Creates new form Payment
     */
    
    public Payment(){
    initComponents();
    }
    
    
    
    public Payment(String para){
    initComponents();
    label2.setText(para);
    if("Economy".equals(label2.getText())){
    label4.setText("Rs. 1000");
   }
   else if("First Class".equals(label2.getText())){
    label4.setText("Rs. 2500");
   }   
   else if("Business".equals(label2.getText())){
    label4.setText("Rs. 4500");
   }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jTextField11 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        label10 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label1.setBackground(new java.awt.Color(51, 51, 51));
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("  Payment Method");
        getContentPane().add(label1);
        label1.setBounds(30, 190, 130, 20);

        label2.setBackground(new java.awt.Color(51, 51, 51));
        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label2);
        label2.setBounds(160, 100, 130, 20);

        label3.setBackground(new java.awt.Color(51, 51, 51));
        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("   Price");
        getContentPane().add(label3);
        label3.setBounds(90, 130, 60, 20);

        label4.setBackground(new java.awt.Color(51, 51, 51));
        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label4);
        label4.setBounds(160, 130, 130, 20);

        label5.setBackground(new java.awt.Color(51, 51, 51));
        label5.setFont(new java.awt.Font("Mont Heavy DEMO", 0, 20)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Payment ");
        getContentPane().add(label5);
        label5.setBounds(200, 0, 100, 40);

        label6.setBackground(new java.awt.Color(51, 51, 51));
        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText(" Full Name");
        getContentPane().add(label6);
        label6.setBounds(60, 70, 90, 20);
        label6.getAccessibleContext().setAccessibleName("");

        jTextField11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(160, 65, 140, 25);

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setFont(new java.awt.Font("Mont Heavy DEMO", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText(" Google Pay");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(40, 230, 120, 23);

        jRadioButton4.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton4.setFont(new java.awt.Font("Mont Heavy DEMO", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText(" Master Card");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(180, 230, 130, 23);

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setFont(new java.awt.Font("Mont Heavy DEMO", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText(" Visa Card");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(330, 230, 110, 23);

        label10.setBackground(new java.awt.Color(51, 51, 51));
        label10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText(" Class Selected");
        getContentPane().add(label10);
        label10.setBounds(30, 100, 120, 20);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\next.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 360, 90, 31);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\back.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 360, 90, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\payment\\mastercard.PNG")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 260, 60, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\payment\\visa.PNG")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 260, 140, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\payment\\googlepay.PNG")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 260, 140, 60);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 410);

        setSize(new java.awt.Dimension(516, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           this.setVisible(false);
        new BookSuccessful().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Bookpage3().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   private void Condition(){
   if("Economy".equals(label2.getText())){
    label4.setText("Rs. 1000");
   }
   else if("First Class".equals(label2.getText())){
    label4.setText("Rs. 2500");
   }   
   else if("Business".equals(label2.getText())){
    label4.setText("Rs. 4500");
   }    
   }
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Payment().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField11;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    // End of variables declaration//GEN-END:variables
}
