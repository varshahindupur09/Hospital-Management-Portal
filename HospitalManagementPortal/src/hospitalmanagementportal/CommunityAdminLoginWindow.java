/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementportal;

import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CommunityAdminLoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminPortal
     */
    String username = "";
    String password = "";
    String role = "";
    boolean loginVerified = false;
    Community community = null;
    
    public CommunityAdminLoginWindow() {
        initComponents();
        community = new Community();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginPortalPageLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(500, 230, 60, 60);

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setText("Password:");
        getContentPane().add(PasswordLabel);
        PasswordLabel.setBounds(470, 290, 100, 40);

        LoginPortalPageLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoginPortalPageLabel.setText("Community Admin Login Portal:");
        getContentPane().add(LoginPortalPageLabel);
        LoginPortalPageLabel.setBounds(320, 100, 620, 130);

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField);
        EmailTextField.setBounds(570, 250, 190, 30);

        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(220, 50, 150, 32);

        SubmitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton);
        SubmitButton.setBounds(520, 380, 150, 32);

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTextField);
        PasswordTextField.setBounds(570, 300, 190, 30);

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hospitaladminbackgroundimage.jpg"))); // NOI18N
        BackgroundImageLabel.setMaximumSize(new java.awt.Dimension(1500, 720));
        BackgroundImageLabel.setMinimumSize(new java.awt.Dimension(1500, 720));
        BackgroundImageLabel.setPreferredSize(new java.awt.Dimension(1500, 720));
        getContentPane().add(BackgroundImageLabel);
        BackgroundImageLabel.setBounds(0, 0, 1500, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        username = EmailTextField.getText();
//                Community.communityAdminData.get(2); //email
        password = PasswordTextField.getText();
//                Community.communityAdminData.get(4); //password
//        role = Community.communityAdminData.get(3); //role
        
        //validation - null
        if(username.equals("") && password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Username and Password");
        }
        else if(!(username.equals("")) && password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Password");        
        }
        else if(username.equals("") && !(password.equals("")))
        {
            JOptionPane.showMessageDialog(this, "Enter Username");    
        }
        
        System.out.println("username "+username);
        System.out.println("password "+password);
        
        if(username.equals(community.communityAdminData.get(2)))
        {
            if(password.equals(community.communityAdminData.get(4)))
            {
                loginVerified = true;
                AddCommunityPortal addCommunityPortal = new AddCommunityPortal();
                addCommunityPortal.setSize(1500, 720);
                addCommunityPortal.setVisible(true);
//                this.dispose(); use on back button
            }
        }
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
            this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminLoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminLoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminLoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminLoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminLoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel LoginPortalPageLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}