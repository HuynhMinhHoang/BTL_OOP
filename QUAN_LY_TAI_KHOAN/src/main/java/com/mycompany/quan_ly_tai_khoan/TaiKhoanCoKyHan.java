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
import java.util.Scanner;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class TaiKhoanCoKyHan extends TaiKhoan{
    private KyHan kyHan;
    private Calendar ngayDaoHan;
    

    public TaiKhoanCoKyHan(KyHan kyHan, String tenTK, String gioiTinh, String ngaySinh, String queQuan, String CCCD, BigDecimal soTien) {
        super(tenTK, gioiTinh, ngaySinh, queQuan, CCCD, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = new GregorianCalendar();
    }

    

    @Override
    public String toString() {
        return String.format("%s*Ky Han: %s\n*Ngay Dao Han: %s", super.toString(), 
                                this.kyHan, f1.format(this.ngayDaoHan.getTime()));
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
    
    
}
