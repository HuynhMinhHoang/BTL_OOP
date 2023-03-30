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
public class QuanLyKhachHang {
    private List<KhachHang> dsKH = new ArrayList<>();

    
   
    
   public void themKH(KhachHang kh){
       this.dsKH.add(kh);
   }
   
   public void hienThiDSKH(){
       this.dsKH.forEach(kh -> kh.xuatKH());
   }
    
    
    
    
    /**
     * @return the dsKH
     */
    public List<KhachHang> getDsKH() {
        return dsKH;
    }

    /**
     * @param dsKH the dsKH to set
     */
    public void setDsKH(List<KhachHang> dsKH) {
        this.dsKH = dsKH;
    }
    
}
