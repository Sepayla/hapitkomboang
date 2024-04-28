/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DashBoards;

import DBconnector.DBconnector;
import static RegistrationForm.RegistrationForm.emails;
import static RegistrationForm.RegistrationForm.usernames;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    
    public boolean duplicateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    em.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    un.setText("");
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
    
       public boolean updateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE (u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "') AND u_id !=' "+id.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    em.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    un.setText("");
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
    private String hash(String password) {
        return null;
    
 }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        upass = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        ustat = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setText("Add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, -1));

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, -1));

        refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, -1));

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 80, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("User ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Enter First Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Enter Last Name: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Enter Email: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Enter Username:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Enter Password: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setText("Choose Account Type: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("Account Status: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        id.setEnabled(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));
        getContentPane().add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 140, -1));
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 140, -1));
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 140, -1));
        getContentPane().add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));

        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        getContentPane().add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 100, -1));

        ustat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        getContentPane().add(ustat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 310, 410));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("User Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel3)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brownBackgorund.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 310, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blueBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || un.getText().isEmpty() || upass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All field are required!");

        }else if(upass.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above!");
            upass.setText("");

        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist");

        }else{

            DBconnector connector = new DBconnector();

            if(connector.insertData("INSERT INTO tblassign(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status)VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + upass.getText() + "','" + utype.getSelectedItem() + "','"+ustat.getSelectedItem()+"')")){
                JOptionPane.showMessageDialog(null, "Registered Successfully");
                UsersForm uForm = new UsersForm();
                uForm.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fn.getText().isEmpty()|| ln.getText().isEmpty()|| em.getText().isEmpty()
            ||un.getText().isEmpty()||upass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required! ");
        }else if(upass.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above.");
            upass.setText("");
        }else if(updateChecker()){
            System.out.println("Duplicate Exit! ");
        }else{
            String hashingpass = hash("(u_password = '"+upass.getText()+"')");
            DBconnector dbc = new DBconnector();
            dbc.updateData("UPDATE tblassign SET u_fname = '"+fn.getText()+"', u_lname = '"+ln.getText()+"',"
                + "u_email = '"+em.getText()+"',u_username = '"+un.getText()+"',u_password = '"+upass.getText()+"',"
                + "u_type = '"+utype.getSelectedItem()+"',u_status = '"+ustat.getSelectedItem()+"' WHERE u_id = '"+id.getText()+"'");

            UsersForm sfr = new UsersForm();
            sfr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText("");
        fn.setText("");
        ln.setText("");
        em.setText("");
        un.setText("");
        upass.setText("");

    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        String previousId = id.getText();
        String previousFname = fn.getText();
        String previousLname = ln.getText();
        String previousEmail = em.getText();
        String previousUsername = un.getText();
        String previousPassword = upass.getText();
        Object previousType = utype.getSelectedItem();
        Object previousStatus = ustat.getSelectedItem();

        id.setText("");
        fn.setText("");
        ln.setText("");
        em.setText("");
        un.setText("");
        upass.setText("");
        utype.setSelectedItem(null);
        ustat.setSelectedItem(null);

        if (!previousId.isEmpty()) {
            id.setText(previousId);
        }
        if (!previousFname.isEmpty()) {
            fn.setText(previousFname);
        }
        if (!previousLname.isEmpty()) {
            ln.setText(previousLname);
        }
        if (!previousEmail.isEmpty()) {
            em.setText(previousEmail);
        }
        if (!previousUsername.isEmpty()) {
            un.setText(previousUsername);
        }
        if (!previousPassword.isEmpty()) {
            upass.setText(previousPassword);
        }
        if (previousType != null) {
            utype.setSelectedItem(previousType);
        }
        if (previousStatus != null) {
            ustat.setSelectedItem(previousStatus);
        }
        JOptionPane.showMessageDialog(null, "REFRESH...");
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        UsersForm uForm = new UsersForm();
        uForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JButton refresh;
    public javax.swing.JTextField un;
    public javax.swing.JTextField upass;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> ustat;
    public javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
