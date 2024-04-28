/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DashBoards;

import DBconnector.DBconnector;
import DBconnector.Session;
import LoginForm.LoginForm;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PERSONAL
 */
public class UsersForm extends javax.swing.JFrame {

    /**
     * Creates new form UsersForm
     */
    public UsersForm() {
        initComponents();
        displayData();
    }
        Color navcolor = new Color(204,204,255);
        Color hovercolor = new Color(204,204,204);
    
        public void displayData(){
        
        try{
            DBconnector connector = new DBconnector();
            ResultSet rs = connector.getData("SELECT u_id, u_fname, u_lname, u_email, u_status FROM tblassign");
            UsersTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        p_add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        p_edit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p_edit1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        p_back = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(UsersTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 310, 440));

        p_add.setBackground(new java.awt.Color(204, 204, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Add");

        javax.swing.GroupLayout p_addLayout = new javax.swing.GroupLayout(p_add);
        p_add.setLayout(p_addLayout);
        p_addLayout.setHorizontalGroup(
            p_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_addLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
        );
        p_addLayout.setVerticalGroup(
            p_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 100, 20));

        p_edit.setBackground(new java.awt.Color(204, 204, 255));
        p_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_editMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Edit");

        javax.swing.GroupLayout p_editLayout = new javax.swing.GroupLayout(p_edit);
        p_edit.setLayout(p_editLayout);
        p_editLayout.setHorizontalGroup(
            p_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_editLayout.setVerticalGroup(
            p_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );

        getContentPane().add(p_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-user-60.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        acc_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        getContentPane().add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        acc_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 255, 255));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("Name");
        getContentPane().add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Users Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brownBackgorund.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 320, 490));

        p_edit1.setBackground(new java.awt.Color(204, 204, 255));
        p_edit1.setForeground(new java.awt.Color(255, 255, 255));
        p_edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_edit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_edit1MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Refresh");

        javax.swing.GroupLayout p_edit1Layout = new javax.swing.GroupLayout(p_edit1);
        p_edit1.setLayout(p_edit1Layout);
        p_edit1Layout.setHorizontalGroup(
            p_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_edit1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );
        p_edit1Layout.setVerticalGroup(
            p_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(p_edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 100, -1));

        p_back.setBackground(new java.awt.Color(204, 204, 255));
        p_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_backMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Back");

        javax.swing.GroupLayout p_backLayout = new javax.swing.GroupLayout(p_back);
        p_back.setLayout(p_backLayout);
        p_backLayout.setHorizontalGroup(
            p_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_backLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(34, 34, 34))
        );
        p_backLayout.setVerticalGroup(
            p_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_backLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(p_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 100, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blueBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No Account, Login First!");
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        
        }else{
            acc_name.setText(""+sess.getFname());
            acc_id.setText(""+sess.getUid());
        }
    }//GEN-LAST:event_formWindowActivated

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        createUserForm cForm = new createUserForm();
        cForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_edit1MouseClicked
        
    }//GEN-LAST:event_p_edit1MouseClicked

    private void p_edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_edit1MouseEntered
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_edit1MouseEntered

    private void p_edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_edit1MouseExited
       p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_edit1MouseExited

    private void p_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseClicked
        int rowIndex = UsersTable.getSelectedRow();

        if(rowIndex <0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{

            try{
                DBconnector dbc = new DBconnector();
                TableModel tbl = UsersTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tblassign WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");

                if(rs.next()){
                    createUserForm cForm = new createUserForm();
                    cForm.id.setText(""+rs.getInt("u_id"));
                    cForm.fn.setText(""+rs.getString("u_fname"));
                    cForm.ln.setText(""+rs.getString("u_lname"));
                    cForm.em.setText(""+rs.getString("u_email"));
                    cForm.un.setText(""+rs.getString("u_username"));
                    cForm.upass.setText(""+rs.getString("u_password"));
                    cForm.utype.setSelectedItem(""+rs.getString("u_type"));
                    cForm.ustat.setSelectedItem(""+rs.getString("u_status"));
                    cForm.add.setEnabled(false);
                    cForm.update.setEnabled(true);

                    cForm.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_p_editMouseClicked

    private void p_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseEntered
        p_edit.setBackground(hovercolor);
    }//GEN-LAST:event_p_editMouseEntered

    private void p_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseExited
        p_edit.setBackground(navcolor);
    }//GEN-LAST:event_p_editMouseExited

    private void p_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseClicked
        AdminDashBoard dash = new AdminDashBoard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_backMouseClicked

    private void p_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseEntered
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_backMouseEntered

    private void p_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_backMouseExited
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_backMouseExited

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
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable UsersTable;
    public javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_back;
    private javax.swing.JPanel p_edit;
    private javax.swing.JPanel p_edit1;
    // End of variables declaration//GEN-END:variables
}
