/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_oop;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class Demo {

    public static void main(String[] args) {
        KhachHang kh1 = new KhachHang();
        kh1.nhapKH();
        KhachHang.sc.nextLine();

        TaiKhoan tk1 = new TaiKhoan();
        TaiKhoan tk2 = new TaiKhoanCoKyHan();

        QuanLyKhachHang qlkh = new QuanLyKhachHang();
        qlkh.themKH(kh1);
        qlkh.hienThiDSKH();

        QuanLyTaiKhoan qltk = new QuanLyTaiKhoan();
        qltk.themTK(tk1);
//        qltk.themTK(tk2);
        qltk.hienThiDSTK();

    }
}
