/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.edusys.utils;

import com.edusys.dao.DanhMucDAO;
import com.edusys.ui.DangNhapJD;
import com.edusys.ui.DoiMatKhau;
import com.edusys.ui.GioiThieu;
import com.edusys.ui.QLChuyenDe;
import com.edusys.ui.QLHocVien;
import com.edusys.ui.QLKhoaHOc;
import com.edusys.ui.QLNguoiHoc;
import com.edusys.ui.QLNhanVien;
import com.edusys.ui.QLThongKe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.edusys.utils.XAuth;
import com.edusys.utils.XDate;
import com.edusys.utils.XDialog;
import com.edusys.utils.XImage;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author khang
 */
public class XMenu {

    private JPanel root;
    private String kinSelected = "";

    private List<DanhMucDAO> listItem = null;

    public XMenu(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kinSelected = "NhanVien";

        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QLNhanVien());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucDAO> listItem) {
        this.listItem = listItem;

        for (DanhMucDAO item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public void exit() {
        if (XDialog.confirm(null, "Bạn có muốn kết thúc phiên làm việc không?")) {
            System.exit(0);
        }
    }
public void logout() {
        XAuth.clear();
        XDialog.alert(null, "Bạn đã đăng xuất\nVui lòng đăng nhập để sử dụng!");
        new DangNhapJD(null, true).setVisible(true);
    }
    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "NhanVien":
                    node = new QLNhanVien();
                    break;
            }
            switch (kind) {
                case "ChuyenDe":
                    node = new QLChuyenDe();
                    break;
            }
            switch (kind) {
                case "KhoaHoc":
                    node = new QLKhoaHOc();
                    break;
            }
            switch (kind) {
                case "NguoiHoc":
                    node = new QLNguoiHoc();
                    break;
            }
            switch (kind) {
                case "HocVien":
                    node = new QLHocVien();
                    break;
            }
            switch (kind) {
                case "ThongKe":
                    node = new QLThongKe();
                    break;
            }
            switch (kind) {
                case "DoiMatKhau":
                    node = new DoiMatKhau();
                    break;
            }
            switch (kind) {
                case "GioiThieu":
                    node = new GioiThieu();
                    break;
            }
            switch (kind) {
                case "DangXuat":
                    logout();
                    break;
            }
             switch (kind) {
                case "HuongDan":
                    XDialog.confirm(null, "Tính năng sắp có!");
                    break;
            }
            switch (kind) {
                case "Thoat":
                    exit();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kinSelected = kind;
            jpnItem.setBackground(new Color(90, 100, 191));
            jlbItem.setBackground(new Color(90, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(90, 100, 191));
            jlbItem.setBackground(new Color(90, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kinSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }

        private void setChangeBackground(String kind) {
            for (DanhMucDAO item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(new Color(96, 100, 191));
                    item.getJpn().setBackground(new Color(96, 100, 191));
                } else {
                    item.getJlb().setBackground(new Color(76, 175, 80));
                    item.getJpn().setBackground(new Color(76, 175, 80));
                }
            }
        }
    }
}
