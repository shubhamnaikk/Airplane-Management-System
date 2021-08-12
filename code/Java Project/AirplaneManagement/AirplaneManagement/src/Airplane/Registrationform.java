
package Airplane;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registrationform extends javax.swing.JFrame {

    
    public Registrationform() {
        initComponents();
        jPanel1.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    Connection con;
    PreparedStatement pst;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(204, 204, 204));
        fname.setText(" First Name");
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(60, 90, 140, 30);

        lname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(204, 204, 204));
        lname.setText(" Last Name");
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname);
        lname.setBounds(220, 90, 140, 30);

        contact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(204, 204, 204));
        contact.setText("  Contact");
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactFocusLost(evt);
            }
        });
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact);
        contact.setBounds(220, 140, 140, 30);

        dob.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(204, 204, 204));
        dob.setText(" D.O.B");
        dob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobFocusLost(evt);
            }
        });
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        getContentPane().add(dob);
        dob.setBounds(60, 140, 140, 30);

        username.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(220, 250, 140, 30);

        address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(204, 204, 204));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(220, 200, 140, 30);

        password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(password);
        password.setBounds(220, 300, 140, 30);

        label1.setBackground(new java.awt.Color(51, 51, 51));
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("SIGNUP");
        getContentPane().add(label1);
        label1.setBounds(170, 30, 80, 30);

        label2.setBackground(new java.awt.Color(51, 51, 51));
        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("ADDRESS:");
        getContentPane().add(label2);
        label2.setBounds(130, 200, 70, 30);

        label3.setBackground(new java.awt.Color(51, 51, 51));
        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Create Username:");
        getContentPane().add(label3);
        label3.setBounds(70, 250, 130, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\Submitbutton.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 350, 80, 30);

        label4.setBackground(new java.awt.Color(51, 51, 51));
        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Create Password:");
        getContentPane().add(label4);
        label4.setBounds(70, 300, 130, 30);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Java Project\\Form pics\\back.png")); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 430);

        setSize(new java.awt.Dimension(460, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(username.getText().length()==0)
        {
        JOptionPane.showMessageDialog(this,"Please Enter Username");
        }
        else if(password.getText().length()==0)
        {
        JOptionPane.showMessageDialog(this,"Please Enter Password");
        }
        else if((fname.getText().length()==0)||(fname.getText().equals(" First Name")))
        {
        JOptionPane.showMessageDialog(this,"Please Enter First name");
        }
        else if((lname.getText().length()==0)||(lname.getText().equals(" Last Name")))
        {
        JOptionPane.showMessageDialog(this,"Please Enter Last Name");
        }
        else if((dob.getText().length()==0)||(dob.getText().equals(" D.O.B"))) 
        {
        JOptionPane.showMessageDialog(this,"Please Enter Date of Birth");
        }
        else if((contact.getText().length()==0)||(contact.getText().equals("  Contact")))
        {
        JOptionPane.showMessageDialog(this,"Please Enter Contact");
        }
        else if(address.getText().length()==0)
        {
        JOptionPane.showMessageDialog(this,"Please Enter Address");
        }
        else if(password.getText().equals("password"))
            JOptionPane.showMessageDialog(this,"Your Password cannot be 'password' ");
        else
        {
        
            
            try {
                String Username = username.getText();
                String Password= password.getText();
                String Fname=fname.getText();
                String Lname=lname.getText();
                String Contact=contact.getText();
                String DOB=dob.getText();
                String add=address.getText();
                
                
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproj","root","GroupC@2020");
                pst = con.prepareStatement("insert into login(fname,lname,dob,contact,address,username,password) values (?,?,?,?,?,?,?)");
                pst.setString(1,Fname);
                pst.setString(2,Lname);
                pst.setString(3,DOB);
                pst.setString(4,Contact);
                pst.setString(5,add);
                pst.setString(6,Username);
                pst.setString(7,Password);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "You Have Been Registred");
                this.setVisible(false);
                new Welcome().setVisible(true);
            } 
            catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Registrationform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        // TODO add your handling code here:
        if(fname.getText().equals(" First Name")){
            fname.setText("");
        }
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        // TODO add your handling code here:
        if(fname.getText().equals("")){
            fname.setText(" First Name");
        }
    }//GEN-LAST:event_fnameFocusLost

    private void lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusGained
        // TODO add your handling code here:
          if(lname.getText().equals(" Last Name")){
            lname.setText("");
        }
    }//GEN-LAST:event_lnameFocusGained

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
        // TODO add your handling code here:
          if(lname.getText().equals("")){
            lname.setText(" Last Name");
        }
    }//GEN-LAST:event_lnameFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        // TODO add your handling code here:
        if(contact.getText().equals("  Contact")){
            contact.setText("");
        }
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
        // TODO add your handling code here:
        if(contact.getText().equals("")){
            contact.setText("  Contact");
        }
    }//GEN-LAST:event_contactFocusLost

    private void dobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusGained
        // TODO add your handling code here:
        if(dob.getText().equals(" D.O.B")){
        dob.setText("");
        }
    }//GEN-LAST:event_dobFocusGained

    private void dobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusLost
        // TODO add your handling code here:
        if(dob.getText().equals("")){
        dob.setText(" D.O.B");
        }
    }//GEN-LAST:event_dobFocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
