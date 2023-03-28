/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_khoan;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class KhachHang {
//    private int maKH;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private int CCCD;
    private BigDecimal soTienGui;

    public KhachHang(String hoTen, String gioiTinh, String ngaySinh, String queQuan, int CCCD, BigDecimal soTienGui) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.CCCD = CCCD;
        this.soTienGui = soTienGui;
    }
    
    
    
    
    
    
    
    

    /**
//     * @return the maKH
//     */
//    public int getMaKH() {
//        return maKH;
//    }
//
//    /**
//     * @param maKH the maKH to set
//     */
//    public void setMaKH(int maKH) {
//        this.maKH = maKH;
//    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the CCCD
     */
    public int getCCCD() {
        return CCCD;
    }

    /**
     * @param CCCD the CCCD to set
     */
    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }
}
