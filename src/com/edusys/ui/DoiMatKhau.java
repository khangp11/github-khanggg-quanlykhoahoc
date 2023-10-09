/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.utils.XAuth;
import com.edusys.utils.XDialog;
import com.edusys.utils.XValidate;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author AnhDT
 */
public class DoiMatKhau extends javax.swing.JPanel {

    NhanVienDAO nvdao = new NhanVienDAO();

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
        initComponents();
        initComponents();
        init();
    }

    private void init() {
        txtTenNV.setText(XAuth.user.getMaNV());
        txtTenNV.setEditable(false);
        txtTenNV.setBackground(Color.white);
    }

    private void doiMatKhau() {
        try {
            String matKhau = new String(txtMatKhau.getPassword());
            String matKhauMoi = new String(txtMKMoi.getPassword());
            String xacNhanMK = new String(txtMKMoi2.getPassword());

            if (!matKhau.equals(XAuth.user.getMatKhau())) {
                XDialog.alert(this, "Sai mật khẩu hiện tại!");
            } else if (!matKhauMoi.equals(xacNhanMK)) {
                XDialog.alert(this, "Xác nhận mật khẩu không đúng!");
            } else {
                XAuth.user.setMatKhau(matKhauMoi);
                nvdao.update(XAuth.user);
                XDialog.alert(this, "Đổi mật khẩu thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlReset = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserIcon = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNewPass = new javax.swing.JLabel();
        lblPassIcon = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblshow = new javax.swing.JLabel();
        lblhide = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblPass = new javax.swing.JLabel();
        lbPassIcon1 = new javax.swing.JLabel();
        txtMKMoi = new javax.swing.JPasswordField();
        lblshow1 = new javax.swing.JLabel();
        lblhide1 = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblConfirmPass = new javax.swing.JLabel();
        lblPassIcon2 = new javax.swing.JLabel();
        txtMKMoi2 = new javax.swing.JPasswordField();
        lblshow2 = new javax.swing.JLabel();
        lblhide2 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        pnlReset.setBackground(new java.awt.Color(228, 246, 250));
        pnlReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 141, 120), 2));
        pnlReset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-users.png"))); // NOI18N
        pnlReset.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 100, 100));

        lblUsername.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(238, 112, 82));
        lblUsername.setText("Tài khoản:");
        pnlReset.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, -1));

        lblUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-user.png"))); // NOI18N
        pnlReset.add(lblUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 40));

        txtTenNV.setBackground(new java.awt.Color(228, 246, 250));
        txtTenNV.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtTenNV.setForeground(new java.awt.Color(250, 105, 0));
        txtTenNV.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlReset.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 210, 40));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pnlReset.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 260, 20));

        lblNewPass.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblNewPass.setForeground(new java.awt.Color(238, 112, 82));
        lblNewPass.setText("Mật khẩu mới:");
        pnlReset.add(lblNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblPassIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-key.png"))); // NOI18N
        pnlReset.add(lblPassIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 40));

        txtMatKhau.setBackground(new java.awt.Color(228, 246, 250));
        txtMatKhau.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(187, 187, 187));
        txtMatKhau.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });
        pnlReset.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 40));

        lblshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowMouseClicked(evt);
            }
        });
        pnlReset.add(lblshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 40, 20));

        lblhide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhideMouseClicked(evt);
            }
        });
        pnlReset.add(lblhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 40, 20));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"))); // NOI18N
        pnlReset.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pnlReset.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 260, 20));

        lblPass.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(238, 112, 82));
        lblPass.setText("Mật khẩu:");
        pnlReset.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        lbPassIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-password.png"))); // NOI18N
        pnlReset.add(lbPassIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 40));

        txtMKMoi.setBackground(new java.awt.Color(228, 246, 250));
        txtMKMoi.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtMKMoi.setForeground(new java.awt.Color(187, 187, 187));
        txtMKMoi.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        txtMKMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKMoiKeyPressed(evt);
            }
        });
        pnlReset.add(txtMKMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 160, 40));

        lblshow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshow1MouseClicked(evt);
            }
        });
        pnlReset.add(lblshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, 20));

        lblhide1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhide1MouseClicked(evt);
            }
        });
        pnlReset.add(lblhide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, 20));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"))); // NOI18N
        pnlReset.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 20, 20));

        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pnlReset.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 260, 20));

        lblConfirmPass.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblConfirmPass.setForeground(new java.awt.Color(238, 112, 82));
        lblConfirmPass.setText("Xác nhận mật khẩu:");
        pnlReset.add(lblConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 200, -1));

        lblPassIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-password.png"))); // NOI18N
        pnlReset.add(lblPassIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, 40));

        txtMKMoi2.setBackground(new java.awt.Color(228, 246, 250));
        txtMKMoi2.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtMKMoi2.setForeground(new java.awt.Color(187, 187, 187));
        txtMKMoi2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        txtMKMoi2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKMoi2KeyPressed(evt);
            }
        });
        pnlReset.add(txtMKMoi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 160, 40));

        lblshow2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshow2MouseClicked(evt);
            }
        });
        pnlReset.add(lblshow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 40, 20));

        lblhide2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhide2MouseClicked(evt);
            }
        });
        pnlReset.add(lblhide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 40, 20));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"))); // NOI18N
        pnlReset.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 20, 20));

        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pnlReset.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 260, 20));

        btnSubmit.setBackground(new java.awt.Color(0, 95, 95));
        btnSubmit.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-update.png"))); // NOI18N
        btnSubmit.setText("Đổi mật khẩu");
        btnSubmit.setBorder(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlReset.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 170, 45));

        btnBack.setBackground(new java.awt.Color(0, 95, 95));
        btnBack.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-back.png"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlReset.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 130, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlReset, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlReset, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnSubmit);
            btnSubmit.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            // this.dispose();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void lblshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshowMouseClicked
        // TODO add your handling code here:
        lblhide.setVisible(true);
        lblhide.setEnabled(true);
        txtMatKhau.setEchoChar((char) 8226);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"));
        lblIcon.setIcon(icon);
        lblshow.setVisible(false);
        lblshow.setEnabled(false);
    }//GEN-LAST:event_lblshowMouseClicked

    private void lblhideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhideMouseClicked
        // TODO add your handling code here:
        lblshow.setVisible(true);
        lblshow.setEnabled(true);
        txtMatKhau.setEchoChar((char) 0);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-hide.png"));
        lblIcon.setIcon(icon);
        lblhide.setVisible(false);
        lblhide.setEnabled(false);
    }//GEN-LAST:event_lblhideMouseClicked

    private void txtMKMoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKMoiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnSubmit);
            btnSubmit.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            // this.dispose();
        }
    }//GEN-LAST:event_txtMKMoiKeyPressed

    private void lblshow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshow1MouseClicked
        // TODO add your handling code here:
        lblhide1.setVisible(true);
        lblhide1.setEnabled(true);
        txtMKMoi.setEchoChar((char) 8226);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"));
        lblIcon1.setIcon(icon);
        lblshow1.setVisible(false);
        lblshow1.setEnabled(false);
    }//GEN-LAST:event_lblshow1MouseClicked

    private void lblhide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhide1MouseClicked
        // TODO add your handling code here:
        lblshow1.setVisible(true);
        lblshow1.setEnabled(true);
        txtMKMoi.setEchoChar((char) 0);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-hide.png"));
        lblIcon1.setIcon(icon);
        lblhide1.setVisible(false);
        lblhide1.setEnabled(false);
    }//GEN-LAST:event_lblhide1MouseClicked

    private void txtMKMoi2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKMoi2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnSubmit);
            btnSubmit.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            // this.dispose();
        }
    }//GEN-LAST:event_txtMKMoi2KeyPressed

    private void lblshow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshow2MouseClicked
        // TODO add your handling code here:
        lblhide2.setVisible(true);
        lblhide2.setEnabled(true);
        txtMKMoi2.setEchoChar((char) 8226);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"));
        lblIcon2.setIcon(icon);
        lblshow2.setVisible(false);
        lblshow2.setEnabled(false);
    }//GEN-LAST:event_lblshow2MouseClicked

    private void lblhide2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhide2MouseClicked
        // TODO add your handling code here:
        lblshow2.setVisible(true);
        lblshow2.setEnabled(true);
        txtMKMoi2.setEchoChar((char) 0);
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/edusys/icons/icons8-hide.png"));
        lblIcon2.setIcon(icon);
        lblhide2.setVisible(false);
        lblhide2.setEnabled(false);
    }//GEN-LAST:event_lblhide2MouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (XValidate.checkNullPass(txtMatKhau)
                && XValidate.checkNullPass(txtMKMoi)
                && XValidate.checkNullPass(txtMKMoi2)) {
            this.doiMatKhau();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbPassIcon1;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassIcon;
    private javax.swing.JLabel lblPassIcon2;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblhide;
    private javax.swing.JLabel lblhide1;
    private javax.swing.JLabel lblhide2;
    private javax.swing.JLabel lblshow;
    private javax.swing.JLabel lblshow1;
    private javax.swing.JLabel lblshow2;
    private javax.swing.JPanel pnlReset;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtMKMoi2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

}