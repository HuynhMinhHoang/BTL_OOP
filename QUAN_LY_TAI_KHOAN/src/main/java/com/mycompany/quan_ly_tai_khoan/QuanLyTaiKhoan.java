/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_khoan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class QuanLyTaiKhoan {

    public List<TaiKhoan> ds = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

//    public void taoTK(TaiKhoan tk) {
//        this.ds.add(tk);
//    }
    //contractor
    public QuanLyTaiKhoan() {
    }

    public void taoTK() {
//        System.out.print("==TAO TAI KHOAN==\n");
        System.out.print("Ho & Ten: ");
        String ht = sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gt = sc.nextLine();
        System.out.print("Ngay Sinh: ");
        String ns = sc.nextLine();
        System.out.print("Que Quan: ");
        String qq = sc.nextLine();
        System.out.print("CCCD: ");
        String cccd = sc.nextLine();
        System.out.print("So Tien Gui(>=50000VND): ");
        double tiengui = sc.nextDouble();
        do {
            if (tiengui < 50000) {
                System.out.print("Vui long nhap lai: ");
                tiengui = sc.nextDouble();
            }
        } while (tiengui < 50000);

        TaiKhoan tk = new TaiKhoan(ht, gt, ns, qq, cccd, new BigDecimal(tiengui));
        this.ds.add(tk);

    }
    public void taoTKCoKyHan(){
        System.out.print("Nhap Ky Han: ");
    }

//    public void Login(){
//        System.out.println("====WECOME====");
//        System.out.println("Username: ");
//        String tk = sc.nextLine();
//        System.out.println("Password: ");
//        int mk = sc.nextInt();
//    }
    public void xuatDSTK() {
        this.ds.forEach(s -> System.out.println(s));
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }

}
