/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finals;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class FlightRecords extends javax.swing.JFrame {

  String name,destination;

   
    public FlightRecords() {
        initComponents();
        
        
       
            }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Records1 = new javax.swing.JTable();
        MenuBack = new javax.swing.JButton();
        Click = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Records1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Records1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact No.", "Seat No.", "Departure Time", "Departure Date", "Origin", "Destination", "Payment Mehtod", "Transaction No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Records1);
        if (Records1.getColumnModel().getColumnCount() > 0) {
            Records1.getColumnModel().getColumn(0).setPreferredWidth(140);
            Records1.getColumnModel().getColumn(2).setPreferredWidth(30);
            Records1.getColumnModel().getColumn(5).setPreferredWidth(120);
            Records1.getColumnModel().getColumn(6).setPreferredWidth(120);
            Records1.getColumnModel().getColumn(8).setPreferredWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 900, 440));

        MenuBack.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        MenuBack.setText("Menu");
        MenuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackActionPerformed(evt);
            }
        });
        getContentPane().add(MenuBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 140, 40));

        Click.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Click.setText("Show");
        Click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickActionPerformed(evt);
            }
        });
        getContentPane().add(Click, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/FirstClass2.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackActionPerformed
    
        EnumFrame kent34 = new EnumFrame();
        
        kent34.setVisible(true);
        this.setVisible(false);
       
        
    }//GEN-LAST:event_MenuBackActionPerformed

    private void ClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickActionPerformed
      try {
          DefaultTableModel kent34 = (DefaultTableModel) Records1.getModel();
          final FileInputStream is;
          File f = new File("D:\\Java File Handling\\FlightRecords.txt");
          is = new FileInputStream(f);
          InsertData(is);
          
          Scanner scan = new Scanner(is);
          String[] array;
          while (scan.hasNextLine()) {
              String line = scan.nextLine();
              if(line.indexOf(",")>-1)
                  array = line.split(",");
              else
                  array = line.split("\t");
              Object[] data = new Object[array.length];
              System.arraycopy(array, 0, data, 0, array.length);
              kent34.addRow(data);
          }
          Records1.setModel(kent34);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(FlightRecords.class.getName()).log(Level.SEVERE, null, ex);
      }
      Click.setEnabled(false);

    }//GEN-LAST:event_ClickActionPerformed

    public void InsertData(FileInputStream is){
        
    DefaultTableModel kent34 = (DefaultTableModel) Records1.getModel();
        
    Scanner scan = new Scanner(is);
    String[] array;
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        if(line.indexOf(",")>-1)
            array = line.split(",");
        else
            array = line.split("\t");
        Object[] data = new Object[array.length];
        System.arraycopy(array, 0, data, 0, array.length);
        kent34.addRow(data);
   }
    Records1.setModel(kent34);
    }
    public static void main(String args[])  {
       
        
                
                
                
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
            java.util.logging.Logger.getLogger(FlightRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Click;
    private javax.swing.JButton MenuBack;
    private javax.swing.JTable Records1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
