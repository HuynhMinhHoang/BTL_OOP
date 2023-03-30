/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class QuanLyTaiKhoan {

    private List<TaiKhoan> dsTK = new ArrayList<>();
    private List<TaiKhoanCoKyHan> dsTKKY = new ArrayList<>();

    public void themTK(TaiKhoan tk) {
        this.dsTK.add(tk);
    }
    public void hienThiDSTK() {
        this.dsTK.forEach(kh -> kh.xuatTK());
    }



    /**
     * @return the dsTK
     */
    public List<TaiKhoan> getDsTK() {
        return dsTK;
    }

    /**
     * @param dsTK the dsTK to set
     */
    public void setDsTK(List<TaiKhoan> dsTK) {
        this.dsTK = dsTK;
    }

    /**
     * @return the dsTKKY
     */
    public List<TaiKhoanCoKyHan> getDsTKKY() {
        return dsTKKY;
    }

    /**
     * @param dsTKKY the dsTKKY to set
     */
    public void setDsTKKY(List<TaiKhoanCoKyHan> dsTKKY) {
        this.dsTKKY = dsTKKY;
    }

}
