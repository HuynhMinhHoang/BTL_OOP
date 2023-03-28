/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_khoan;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class TaiKhoan {    
    public static final SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");    
    public static Scanner sc = new Scanner(System.in);
    private static int dem;
    protected String soTK;    
    protected int matkhau = (int)(Math.random() * 999999 + 1);      
    private String tenTK;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private String CCCD;    
    private BigDecimal soTien;         
    private Date ngayTaoTK;
    
    {
        GregorianCalendar d = new GregorianCalendar();
        soTK = (String.format("%d%d%d%04d",d.get(Calendar.DAY_OF_MONTH),d.get(Calendar.MONTH)+1,
                d.get(Calendar.YEAR), ++dem));
        ngayTaoTK = (new Date());
    }
    //contractor
    public TaiKhoan(String tenTK, String gioiTinh, String ngaySinh, String queQuan, String CCCD, BigDecimal soTien) {
        this.tenTK = tenTK;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.CCCD = CCCD;
        this.soTien = soTien;
    }
    
    
 
    //toString
    @Override
    public String toString() {
        return String.format("==============\n*So Tai Khoan: %s\n*Mat Khau: %d\n*So Tien: %.0f VND\nTen Tai Khoan: %s\nGioi tinh: %s \nNgay Sinh: %s \nQue Quan: %s\nCCCD: %s\nNgay Tao: %s\n",
                 this.soTK,this.matkhau,this.soTien,this.tenTK, this.gioiTinh, this.ngaySinh, this.queQuan, 
                this.CCCD, f1.format(this.ngayTaoTK));
    }

    
    
    
    
    
    
    
    
    /**
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    /**
     * @return the matkhau
     */
    public int getMatkhau() {
        return matkhau;
    }

    /**
     * @param matkhau the matkhau to set
     */
    public void setMatkhau(int matkhau) {
        this.matkhau = matkhau;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
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
    public String getCCCD() {
        return CCCD;
    }

    /**
     * @param CCCD the CCCD to set
     */
    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    /**
     * @return the soTien
     */
    public BigDecimal getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTaoTK
     */
    public Date getNgayTaoTK() {
        return ngayTaoTK;
    }

    /**
     * @param ngayTaoTK the ngayTaoTK to set
     */
    public void setNgayTaoTK(Date ngayTaoTK) {
        this.ngayTaoTK = ngayTaoTK;
    }
    
    
}
    
    
    
 