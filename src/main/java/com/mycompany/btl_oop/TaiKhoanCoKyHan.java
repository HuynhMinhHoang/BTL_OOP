/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_oop;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class TaiKhoanCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private Calendar ngayDaoHan;

    public TaiKhoanCoKyHan(String maSoTK, String loaiTK, BigDecimal soTienTrongTK, KyHan kyHan, Calendar ngayDaoHan, Date ngayTaoTK) {
        super(maSoTK, "TAI KHOAN CO KY HAN", soTienTrongTK, ngayTaoTK);
        this.kyHan = kyHan;
        this.ngayDaoHan = new GregorianCalendar();
    }

    public TaiKhoanCoKyHan() {
    }

    @Override
    public void xuatTK() {
        super.xuatTK(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Ky han: %s\t", this.kyHan);
        System.out.printf("Ngay dao han: %s\t", f1.format(this.ngayDaoHan.getTime()));
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
