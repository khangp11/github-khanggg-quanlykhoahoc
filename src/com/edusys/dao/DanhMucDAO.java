/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.edusys.dao;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author khang
 */
public class DanhMucDAO {
    private String kind;
    private JPanel jpn;
    private JLabel jlb;

    public DanhMucDAO(String kind, JPanel jpn, JLabel jlb) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
    }

    public DanhMucDAO() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }
    
    
}
