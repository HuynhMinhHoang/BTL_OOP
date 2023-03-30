/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_oop;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class KhachHang {
    public static Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    private int maKH = ++dem;

    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private String CCCD;
    private BigDecimal soTienGui;

    public KhachHang(String hoTen, String gioiTinh, String ngaySinh, String queQuan, String CCCD, BigDecimal soTienGui) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.CCCD = CCCD;
        this.soTienGui = soTienGui;
    }

    public KhachHang() {
    }

    
    
    public void nhapKH(){
        System.out.print("Ho & Ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = sc.nextLine();
        System.out.print("CCCD: ");
        this.CCCD = sc.nextLine();
        System.out.print("So Tien Gui(>=50000VND): ");
        this.soTienGui = new BigDecimal(sc.nextDouble());
//        do {
//            if (soTienGui < 50000) {
//                System.out.print("Vui long nhap lai: ");
//                soTienGui = new BigDecimal(sc.nextDouble());
//            }
//        } while (soTienGui < 50000);
        
    }
    
    
    public void xuatKH(){
        System.out.println("==== THONG TIN KHACH HANG ====");
        System.out.printf("ID: %d\n", this.maKH);
        System.out.printf("Ho & Ten: %s\n", this.hoTen);
        System.out.printf("Gioi tinh: %s\n", this.gioiTinh);
        System.out.printf("Ngay sinh: %s\n", this.ngaySinh);
        System.out.printf("Que quan: %s\n", this.queQuan);
        System.out.printf("CCCD: %s\n", this.CCCD);
        System.out.printf("So tien gui: %.0f\n", this.soTienGui);
    }
    
    
    
    
    
    
    
    
    
    /**
     * @return the maKH
     */
    public int getMaKH() {
        return maKH;
    }

    /**
     * @param maKH the maKH to set
     */
    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

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
     * @return the soTienGui
     */
    public BigDecimal getSoTienGui() {
        return soTienGui;
    }

    /**
     * @param soTienGui the soTienGui to set
     */
    public void setSoTienGui(BigDecimal soTienGui) {
        this.soTienGui = soTienGui;
    }

}
