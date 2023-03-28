/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_khoan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Huỳnh Minh Hoàng
 */
public class Account {

    protected String soTK;
    private static int dem;
    protected int matkhau = (int) (Math.random() * 999999 + 1);

    {
        GregorianCalendar d = new GregorianCalendar();
        setSoTK(String.format("%d%d%d%04d", d.get(Calendar.DAY_OF_MONTH), d.get(Calendar.MONTH) + 1,
                d.get(Calendar.YEAR), ++dem));
    }

    public Account(String soTK) {
        this.soTK = soTK;
    }

   

    
    
    @Override
    public String toString() {
        return String.format("So tai khoan: %s\nMat khau: %d\n", this.soTK, this.matkhau);
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
    
    
    
    
    
    
    
    
    
    
    
}
