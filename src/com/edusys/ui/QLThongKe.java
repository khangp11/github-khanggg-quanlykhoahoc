/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.edusys.ui;

import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.model.KhoaHoc;
import com.edusys.utils.XAuth;
import com.edusys.utils.XDate;
import com.edusys.utils.XExcel;
import com.edusys.utils.XValidate;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnhDT
 */
public class QLThongKe extends javax.swing.JPanel {

    ThongKeDAO tkdao = new ThongKeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    int index = 0;

    /**
     * Creates new form QLThongKe
     */
    public QLThongKe() {
        initComponents();
        init();
    }

    private void init() {
        this.fillComboBoxKhoaHoc();
        this.fillComboBoxNam();
        this.fillTableBangDiem();
        this.fillTableNguoiHoc();
        this.fillTableDiemChuyenDe();
        this.fillTableDoanhThu();

        this.selectTab(0);
        if (!XAuth.isManager()) {
            tabs.remove(3); // xoá bảng doanh thu nếu là nhân viên
        }

        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        tblNguoiHoc.getColumnModel().getColumn(0).setCellRenderer(render);
        tblNguoiHoc.getColumnModel().getColumn(1).setCellRenderer(render);
        tblNguoiHoc.getColumnModel().getColumn(2).setCellRenderer(render);
        tblNguoiHoc.getColumnModel().getColumn(3).setCellRenderer(render);

        tblBangDiem.getColumnModel().getColumn(0).setCellRenderer(render);
        tblBangDiem.getColumnModel().getColumn(2).setCellRenderer(render);
        tblBangDiem.getColumnModel().getColumn(3).setCellRenderer(render);

        tblDiemChuyenDe.getColumnModel().getColumn(0).setMinWidth(250);
        tblDiemChuyenDe.getColumnModel().getColumn(1).setCellRenderer(render);
        tblDiemChuyenDe.getColumnModel().getColumn(2).setCellRenderer(render);
        tblDiemChuyenDe.getColumnModel().getColumn(3).setCellRenderer(render);
        tblDiemChuyenDe.getColumnModel().getColumn(4).setCellRenderer(render);

        tblDoanhThu.getColumnModel().getColumn(0).setMinWidth(250);
        tblDoanhThu.getColumnModel().getColumn(1).setCellRenderer(render);
        tblDoanhThu.getColumnModel().getColumn(2).setCellRenderer(render);
        tblDoanhThu.getColumnModel().getColumn(3).setCellRenderer(render);
        tblDoanhThu.getColumnModel().getColumn(4).setCellRenderer(render);
        tblDoanhThu.getColumnModel().getColumn(5).setCellRenderer(render);
        tblDoanhThu.getColumnModel().getColumn(6).setCellRenderer(render);
    }

    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxKhoaHoc() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
            model.removeAllElements();
            List<KhoaHoc> list = khdao.selectAll();
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxNam() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
            model.removeAllElements();
            List<Integer> list = khdao.selectByNam();
            for (Integer yr : list) {
                model.addElement(yr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableNguoiHoc() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
            model.setRowCount(0);
            List<Object[]> list = tkdao.getLuongNguoiHoc();
            for (Object[] row : list) {
                model.addRow(new Object[]{row[0], row[1],
                    XDate.toString((Date) row[2]),
                    XDate.toString((Date) row[3])
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableBangDiem() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
            model.setRowCount(0);
            KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();
            List<Object[]> list = tkdao.getBangDiem(kh.getMaKH());
            for (Object[] row : list) {
                double diem = (double) row[2];
                model.addRow(new Object[]{row[0], row[1], diem, XValidate.getRank(diem)});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableDiemChuyenDe() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDiemChuyenDe.getModel();
            model.setRowCount(0);
            List<Object[]> list = tkdao.getDiemChuyenDe();
            for (Object[] row : list) {
                model.addRow(new Object[]{row[0], row[1], row[2], row[3],
                    String.format("%.1f", row[4])
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableDoanhThu() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
            model.setRowCount(0);
            int nam = (Integer) cboNam.getSelectedItem();
            List<Object[]> list = tkdao.getDoanhThu(nam);
            for (Object[] row : list) {
                model.addRow(new Object[]{row[0], row[1], row[2],
                    String.format("%.1f", row[3]),
                    String.format("%.1f", row[4]),
                    String.format("%.1f", row[5]),
                    String.format("%.1f", row[6])
                });
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

        tabs = new javax.swing.JTabbedPane();
        pnlBangDiem = new javax.swing.JPanel();
        jspBangDiem = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        pnlKhoaHoc = new javax.swing.JPanel();
        lblKhoaHoc = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        pnlNguoiHoc = new javax.swing.JPanel();
        jspNguoiHoc = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        pnlDiemChuyenDe = new javax.swing.JPanel();
        jspDiemChuyenDe = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        pnlDoanhThu = new javax.swing.JPanel();
        jspDoanhThu = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        pnlNam = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();

        tabs.setToolTipText("");
        tabs.setFont(new java.awt.Font("Be Vietnam Pro", 0, 15)); // NOI18N

        pnlBangDiem.setLayout(new java.awt.BorderLayout());

        jspBangDiem.setBackground(new java.awt.Color(228, 246, 250));

        tblBangDiem.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NGƯỜI HỌC", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBangDiem.setToolTipText("TK Bảng Điểm");
        tblBangDiem.setRowHeight(30);
        jspBangDiem.setViewportView(tblBangDiem);

        pnlBangDiem.add(jspBangDiem, java.awt.BorderLayout.CENTER);

        pnlKhoaHoc.setBackground(new java.awt.Color(228, 246, 250));
        pnlKhoaHoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        pnlKhoaHoc.setMinimumSize(new java.awt.Dimension(136, 35));
        pnlKhoaHoc.setPreferredSize(new java.awt.Dimension(102, 43));
        pnlKhoaHoc.setLayout(new java.awt.BorderLayout());

        lblKhoaHoc.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        lblKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-certificate.png"))); // NOI18N
        lblKhoaHoc.setText("KHÓA HỌC: ");
        lblKhoaHoc.setPreferredSize(new java.awt.Dimension(125, 32));
        pnlKhoaHoc.add(lblKhoaHoc, java.awt.BorderLayout.LINE_START);

        cboKhoaHoc.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        cboKhoaHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboKhoaHoc.setPreferredSize(new java.awt.Dimension(31, 30));
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });
        pnlKhoaHoc.add(cboKhoaHoc, java.awt.BorderLayout.CENTER);

        pnlBangDiem.add(pnlKhoaHoc, java.awt.BorderLayout.PAGE_START);

        tabs.addTab("BẢNG ĐIỂM", new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-bulleted-list.png")), pnlBangDiem); // NOI18N

        pnlNguoiHoc.setLayout(new java.awt.BorderLayout());

        tblNguoiHoc.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NĂM", "SỐ NGƯỜI HỌC", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setToolTipText("TK Người Học");
        tblNguoiHoc.setRowHeight(30);
        jspNguoiHoc.setViewportView(tblNguoiHoc);

        pnlNguoiHoc.add(jspNguoiHoc, java.awt.BorderLayout.CENTER);

        tabs.addTab("NGƯỜI HỌC", new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-nguoihoc-45px.png")), pnlNguoiHoc); // NOI18N

        pnlDiemChuyenDe.setLayout(new java.awt.BorderLayout());

        tblDiemChuyenDe.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TÊN CHUYÊN ĐỀ", "SỐ HỌC VIÊN", "ĐIỂM THẤP NHẤT", "ĐIỂM CAO NHẤT", "ĐIỂM TRUNG BÌNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemChuyenDe.setToolTipText("TK Điểm Chuyên Đề");
        tblDiemChuyenDe.setRowHeight(30);
        jspDiemChuyenDe.setViewportView(tblDiemChuyenDe);

        pnlDiemChuyenDe.add(jspDiemChuyenDe, java.awt.BorderLayout.CENTER);

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-chuyende-45px.png")), pnlDiemChuyenDe, ""); // NOI18N

        pnlDoanhThu.setLayout(new java.awt.BorderLayout());

        tblDoanhThu.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KHOÁ HỌC", "SỐ HỌC VIÊN", "DOANH THU", "HP THẤP NHẤT", "HP CAO NHẤT", "HP TRUNG BÌNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThu.setToolTipText("TK Doanh Thu");
        tblDoanhThu.setRowHeight(30);
        jspDoanhThu.setViewportView(tblDoanhThu);

        pnlDoanhThu.add(jspDoanhThu, java.awt.BorderLayout.CENTER);

        pnlNam.setBackground(new java.awt.Color(228, 246, 250));
        pnlNam.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        pnlNam.setPreferredSize(new java.awt.Dimension(100, 43));
        pnlNam.setLayout(new java.awt.BorderLayout());

        lblNam.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        lblNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-calculator.png"))); // NOI18N
        lblNam.setText("NĂM: ");
        lblNam.setPreferredSize(new java.awt.Dimension(80, 30));
        pnlNam.add(lblNam, java.awt.BorderLayout.LINE_START);

        cboNam.setFont(new java.awt.Font("Be Vietnam Pro", 0, 14)); // NOI18N
        cboNam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboNam.setPreferredSize(new java.awt.Dimension(30, 30));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });
        pnlNam.add(cboNam, java.awt.BorderLayout.CENTER);

        pnlDoanhThu.add(pnlNam, java.awt.BorderLayout.PAGE_START);

        tabs.addTab("DOANH THU", new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/icons8-thongke-40px.png")), pnlDoanhThu); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        this.fillTableBangDiem();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        this.fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JScrollPane jspBangDiem;
    private javax.swing.JScrollPane jspDiemChuyenDe;
    private javax.swing.JScrollPane jspDoanhThu;
    private javax.swing.JScrollPane jspNguoiHoc;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblNam;
    private javax.swing.JPanel pnlBangDiem;
    private javax.swing.JPanel pnlDiemChuyenDe;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlKhoaHoc;
    private javax.swing.JPanel pnlNam;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    // End of variables declaration//GEN-END:variables
}
