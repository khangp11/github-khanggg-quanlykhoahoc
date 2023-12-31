/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JDialog;

/**
 *
 * @author AnhDT
 */
public class ChaoJD extends JDialog {

    /**
     * Creates new form ChaoJDialog
     *
     * @param parent
     * @param modal
     */
    public ChaoJD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    private void init() {
        setLocationRelativeTo(null);
        System.out.println("Welcome to EduSys management software...");
        //thread là 1 khối mã thực hiện nhiệm vụ
        Thread t = new Thread() {
            int i = -1;

            @Override
            public void run() {
                while (true) {
                    try {
                        i++;
                        progressBar.setValue(i);
                        if (i == 20) {
                            lblStatus.setText("   Đang khởi tạo các mô-đun...");
                        }
                        if (i == 40) {
                            lblStatus.setText("   Đang kết nối với CSDL...");
                        }
                        if (i == 60) {
                            lblStatus.setText("   Đang khởi tạo giao diện...");
                        }
                        if (i == 80) {
                            lblStatus.setText("   Chuẩn bị vào chương trình...");
                        }
                        if (i == 100) {
                            dispose();
                        }
                        Thread.sleep(25); //thread tạm dừng hoạt động trong 25 ms
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start(); //thread bắt đầu hoạt động
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        pnlFooter = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        pnlProgress = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/fpt.png")).getImage());
        setModal(true);
        setUndecorated(true);

        pnlHeader.setBackground(new java.awt.Color(228, 246, 250));
        pnlHeader.setLayout(new java.awt.BorderLayout());

        pnlFooter.setBackground(new java.awt.Color(228, 246, 250));
        pnlFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 141, 120)));
        pnlFooter.setLayout(new java.awt.BorderLayout());

        lblLogo.setBackground(new java.awt.Color(228, 246, 250));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/WEL.png"))); // NOI18N
        pnlFooter.add(lblLogo, java.awt.BorderLayout.PAGE_START);

        lblStatus.setBackground(new java.awt.Color(228, 246, 250));
        lblStatus.setFont(new java.awt.Font("Be Vietnam Pro", 0, 12)); // NOI18N
        lblStatus.setText("   Khởi động ứng dụng...");
        lblStatus.setPreferredSize(new java.awt.Dimension(134, 28));
        pnlFooter.add(lblStatus, java.awt.BorderLayout.CENTER);

        pnlHeader.add(pnlFooter, java.awt.BorderLayout.PAGE_START);

        pnlProgress.setBackground(new java.awt.Color(228, 141, 120));

        progressBar.setBackground(new java.awt.Color(228, 141, 120));
        progressBar.setFont(new java.awt.Font("Be Vietnam Pro", 1, 14)); // NOI18N
        progressBar.setForeground(new java.awt.Color(0, 204, 153));
        progressBar.setPreferredSize(new java.awt.Dimension(890, 27));
        progressBar.setStringPainted(true);
        pnlProgress.add(progressBar);

        pnlHeader.add(pnlProgress, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlProgress;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
