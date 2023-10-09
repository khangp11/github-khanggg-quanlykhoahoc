/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.model.NhanVien;
import com.edusys.utils.XAuth;
import com.edusys.utils.XDialog;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author AnhDT
 */
public class DangNhapJD extends javax.swing.JDialog {

    NhanVienDAO nvdao = new NhanVienDAO();

    /**
     * Creates new form DangNhapJDialog
     *
     * @param parent
     * @param modal
     */
    public DangNhapJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    private void login() {
        String manv = txtMaNV.getText();
        String mk = new String(txtMatKhau.getPassword());
        NhanVien nv = nvdao.selectById(manv);
        if (nv == null) {
            XDialog.alert(this, "Sai tên đăng nhập!");
        } else if (!mk.equals(nv.getMatKhau())) {
            XDialog.alert(this, "Sai mật khẩu!");
        } else {
            System.out.println("Logged in successfully...");
            XDialog.alert(this, "Đăng nhập thành công!");
            XAuth.user = nv;
            this.dispose();
        }
    }

    private void introduce() {
        new GioiThieu().setVisible(true);
    }

    private void exit() {
        if (XDialog.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
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

        jpnlDangNhap = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblPassword1 = new javax.swing.JLabel();
        lblhide = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblUser1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblshow = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jpnlDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 141, 120)));

        pnlLogin.setBackground(new java.awt.Color(228, 246, 250));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(228, 141, 120), 1, true));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitle.setBackground(new java.awt.Color(51, 153, 0));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 105, 0)));
        pnlTitle.setPreferredSize(new java.awt.Dimension(700, 68));

        lblTitle.setFont(new java.awt.Font("Be Vietnam Pro", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("PHẦN MỀM QUẢN LÝ HỌC VIÊN");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/lg2.png"))); // NOI18N

        btnReset.setBackground(new java.awt.Color(51, 69, 72));
        btnReset.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-forgot.png"))); // NOI18N
        btnReset.setText("Forgot Password?");
        btnReset.setBorder(null);
        btnReset.setBorderPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 95, 95));
        btnCancel.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 95, 95));
        btnLogin.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-key.png"))); // NOI18N

        lblhide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhideMouseClicked(evt);
            }
        });

        txtMaNV.setBackground(new java.awt.Color(228, 246, 250));
        txtMaNV.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(250, 102, 0));
        txtMaNV.setText("AnhDT");
        txtMaNV.setToolTipText("Tài khoản");
        txtMaNV.setBorder(null);
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaNVKeyPressed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(238, 112, 82));
        lblUser.setText("Tài khoản:");

        lblPassword.setFont(new java.awt.Font("Be Vietnam Pro", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(238, 112, 82));
        lblPassword.setText("Mật khẩu:");

        txtMatKhau.setBackground(new java.awt.Color(228, 246, 250));
        txtMatKhau.setFont(new java.awt.Font("Be Vietnam Pro", 1, 16)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(250, 102, 0));
        txtMatKhau.setText("123456");
        txtMatKhau.setToolTipText("Mật khẩu");
        txtMatKhau.setBorder(null);
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        lblUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-user.png"))); // NOI18N

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowMouseClicked(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-show.png"))); // NOI18N

        javax.swing.GroupLayout jpnlDangNhapLayout = new javax.swing.GroupLayout(jpnlDangNhap);
        jpnlDangNhap.setLayout(jpnlDangNhapLayout);
        jpnlDangNhapLayout.setHorizontalGroup(
            jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDangNhapLayout.createSequentialGroup()
                .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDangNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBG, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                                .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                                        .addComponent(lblUser1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDangNhapLayout.createSequentialGroup()
                                        .addComponent(lblPassword1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIcon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDangNhapLayout.createSequentialGroup()
                                .addComponent(lblshow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblhide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnlDangNhapLayout.setVerticalGroup(
            jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblUser)
                        .addGap(18, 18, 18)
                        .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnlDangNhapLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblIcon)))
                        .addGap(35, 35, 35)
                        .addGroup(jpnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBG, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblshow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(lblhide, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnLogin);
            btnLogin.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.exit();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnLogin);
            btnLogin.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.exit();
        }
    }//GEN-LAST:event_txtMaNVKeyPressed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (txtMaNV.getText().trim().length() > 0) {
            if (txtMatKhau.getPassword().length > 0) {
                this.login();
            } else {
                XDialog.alert(this, "Không được để trống tên mật khẩu.");
            }
        } else {
            XDialog.alert(this, "Không được để trống tên đăng nhập.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ForgotJD(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpnlDangNhap;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblhide;
    private javax.swing.JLabel lblshow;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
}
