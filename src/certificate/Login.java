/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package certificate;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
   
   
    public Login() {
        initComponents();
         
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        lblHide = new javax.swing.JLabel();
        lblShow = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 200, 47));

        lblHide.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\Certificate\\src\\images\\Hide.png")); // NOI18N
        lblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblHideMouseReleased(evt);
            }
        });
        jPanel1.add(lblHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 20, 20));

        lblShow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\Certificate\\src\\images\\Eye.png")); // NOI18N
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowMousePressed(evt);
            }
        });
        jPanel1.add(lblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 30, 40));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 200, 44));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\Certificate\\src\\images\\password1.png")); // NOI18N
        jLabel1.setText("    PASSWORD :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 42));

        btnLogin1.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Log In");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, -1));

        jLabel22.setBackground(new java.awt.Color(0, 102, 255));
        jLabel22.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 153, 255));
        jLabel22.setText("Forgot passoword?");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 153, 255));
        jLabel23.setText("REGISTER");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 77, 31));

        jLabel24.setBackground(new java.awt.Color(0, 102, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 153, 255));
        jLabel24.setText("Don't have an account?");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\Certificate\\src\\images\\User.png")); // NOI18N
        jLabel4.setText("    USERNAME :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 47));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Log In");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 452, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
//       String username = txtUserName.getText();
//        String password = txtPass.getText();
//       
//        
//         if (username.isEmpty() || password.isEmpty()){
//              JOptionPane.showMessageDialog(this, "Fill in the missing information or write correct data formats","Error",JOptionPane.ERROR_MESSAGE);
//         }
//          
// 
//        else{
//            // Start of the login process 
//            userLogin(username , password);
//        
//    }
      
   String username = txtUserName.getText();
String password = txtPass.getText();

try (Connection dbconn = DBConnection.connectDB()) {
    if (dbconn != null) {
        String query = "SELECT * FROM students WHERE username = ? AND passConfirm = ?";
        try (PreparedStatement st = dbconn.prepareStatement(query)) {
            st.setString(1, username);
            st.setString(2, password);
            
            try (ResultSet res = st.executeQuery()) {
                if (res.next()) {
                    BookingForm d = new BookingForm();
                    d.setTitle("User Dashboard");
                    d.setVisible(true);
                } else {
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                    JOptionPane.showMessageDialog(this, "Username/Password not found", "Error", JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");
                    txtPass.setText("");
                }
            }
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
}
      
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        dispose();
        Register in = new Register();
        in.setTitle("Register");
        in.setLocationRelativeTo(null);
        in.setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jLabel22MouseClicked

    private void lblHideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideMouseReleased
        // TODO add your handling code here:
        lblShow.setVisible(false);
        lblHide.setVisible(true);
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_lblHideMouseReleased

    private void lblHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideMousePressed
        // TODO add your handling code here:
        lblShow.setVisible(true);
        lblHide.setVisible(false);
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_lblHideMousePressed

    private void lblShowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblShowMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHide;
    private javax.swing.JLabel lblShow;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

//   private void userLogin(String username, String password) {
//    Connection dbconn = DBConnection.connectDB();
//
//    if (dbconn != null) {
//        try {
//            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM users WHERE username = ? AND passConfirm = ?");
//            st.setString(1, username);
//            st.setString(2, password);
//            ResultSet res = st.executeQuery();
//
//            if (res.next()) {
//                String userType = (String) userCombo.getSelectedItem(); // Assuming userCombo is your JComboBox
//                dispose();
//
//                if ("USER".equals(userType)) {
//                    Dashboard_user d = new Dashboard_user();
//                    d.setTitle("User Dashboard");
//                    d.setVisible(true);
//                } else if ("ADMIN".equals(userType)) {
//                    AdMain d = new AdMain();
//                    d.setTitle("Admin Dashboard");
//                    d.setVisible(true);
//                }
//
//            } else {
//                System.out.println("Username: " + username);
//                System.out.println("Password: " + password);
//                JOptionPane.showMessageDialog(this, "Username/Password not found", "Error", JOptionPane.ERROR_MESSAGE);
//                txtUserName.setText("");
//                txtPass.setText("");
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    } else {
//        System.out.println("The connection is not available");
//    }
//}
}

