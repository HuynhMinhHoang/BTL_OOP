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
public class demo {

    public static void main(String[] args) {
//       TaiKhoan tk1 = new TaiKhoan("NVA", new BigDecimal(1000000000));
//       TaiKhoan tk2 = new TaiKhoanCoKyHan("TVB", new BigDecimal(200000000),KyHan.MOT_TUAN);
//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        

//        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
//        ql.taoTK();
//        ql.xuatDSTK();
//
        Scanner sc = new Scanner(System.in);
//        List<TaiKhoan> tk = new ArrayList<>();
        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        int chon;
        do {
            System.out.println("====MENU====");
            System.out.print("1. Tao tai khoan\n"
                    + "2. Xuat danh sach Tai Khoan\n"
                    + "3. Dang nhap\n"
                    + "4. Ket thuc\n"
                    + "5. Tao tai khoan co ky han\n"
                    + "Ban chon?:");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    System.out.println("==Nhap thong tin Khach Hang==");
                    ql.taoTK();
                    break;
                }
                case 2:{
                    System.out.println("==Danh sach Tai Khoan==");
                    ql.xuatDSTK();
                    break;
                }
                case 3:{
//                    ql.Login();
                    break;
                }
                case 4:{
                    return;
                }
                case 5:{
                    
                    break;
                }
                default:
                    throw new AssertionError();
            }//sw
        } while (chon <= 3);

    }//main

}
