/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationForm;

import DBconnector.DBconnector;
import DBconnector.passwordHasher;
import LoginForm.LoginForm;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
    }

    public static String emails, usernames;
    
    public boolean duplicateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE u_username = '" + uname.getText() + "' OR u_email = '" + email.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    email.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    uname.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
        
    }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
  }
    
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        stat = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registration Form ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Enter First Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Enter Last Name: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Enter Email: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Enter Username:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Enter Password: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Choose Account Type: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 100, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Account Status: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        getContentPane().add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 80, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brownBackgorund.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blueBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || uname.getText().isEmpty() || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All field are required!");

        }else if(password.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above!");
            password.setText("");

        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist");

        }else{

            DBconnector connector = new DBconnector();

            try{
                String pass = passwordHasher.hashPassword(password.getText());

                if(connector.insertData("INSERT INTO tblassign(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status)"
                    +"VALUES ('" + fname.getText() + "','" + lname.getText() + "','" + email.getText() + "','" + uname.getText() + "','"
                    + pass + "','" + type.getSelectedItem() + "','Pending')")){

                JOptionPane.showMessageDialog(null, "Registered Successfully");
                LoginForm login = new LoginForm();
                login.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }

        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> stat;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
