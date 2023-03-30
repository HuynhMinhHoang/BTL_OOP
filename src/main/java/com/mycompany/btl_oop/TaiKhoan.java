/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_oop;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class TaiKhoan {

    public static final SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    private String maSoTK;
    private int matKhau = (int) (Math.random() * 999999 + 1);
    private String loaiTK;
    private BigDecimal soTienTrongTK;
    private Date ngayTaoTK;

    {
        GregorianCalendar d = new GregorianCalendar();
        maSoTK = (String.format("%d%d%d%04d", d.get(Calendar.DAY_OF_MONTH), d.get(Calendar.MONTH) + 1,
                d.get(Calendar.YEAR), ++dem));
        ngayTaoTK = (new Date());
//        soTienTrongTK = kh.getSoTienGui();
    }

    public TaiKhoan() {
        this.loaiTK = "TAI KHOAN KHONG KY HAN";
    }

    public TaiKhoan(String maSoTK, String loaiTK, BigDecimal soTienTrongTK, Date ngayTaoTK) {
        this.maSoTK = maSoTK;
        this.loaiTK = loaiTK;
        this.soTienTrongTK = soTienTrongTK;
        this.ngayTaoTK = ngayTaoTK;
    }

//    @Override
//    public String toString() {
//        return String.format("==== THONG TIN TAI KHOAN ====\nTK: %s\nMK: %d\nLoai TK: %s\nSo du TK: %.0f\nNgay tao TK: %s\n"
//                ,this.maSoTK, this.matKhau, this.loaiTK, this.soTienTrongTK, f1.format(this.ngayTaoTK));
//    }
    public void xuatTK() {
        System.out.println("==== THONG TIN TAI KHOAN ====");
        System.out.printf("TK: %s\n", this.maSoTK);
        System.out.printf("MK: %d\n", this.matKhau);
        System.out.printf("Loai TK: %s\n", this.loaiTK);
        System.out.printf("So du TK: %.0f\n", this.soTienTrongTK);
        System.out.printf("Ngay tao TK: %s\n", f1.format(this.ngayTaoTK));
    }

    
    
    
    
    
    
    
    /**
     * @return the soTK
     */
    public String getSoTK() {
        return maSoTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.maSoTK = soTK;
    }

    /**
     * @return the matKhau
     */
    public int getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(int matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the loaiTK
     */
    public String getLoaiTK() {
        return loaiTK;
    }

    /**
     * @param loaiTK the loaiTK to set
     */
    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    /**
     * @return the soTienTrongTK
     */
    public BigDecimal getSoTienTrongTK() {
        return soTienTrongTK;
    }

    /**
     * @param soTienTrongTK the soTienTrongTK to set
     */
    public void setSoTienTrongTK(BigDecimal soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
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
