/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;

/**
 *
 * @author ASIA
 */
public class Luong_XayDung {
    private String PhieuLuong;
    private float LuongCB;
    private float PhuCap;
    private float Thue;   
    private String MANV;

    public Luong_XayDung(String PhieuLuong, float LuongCB, float PhuCap, float Thue, String MANV) {
        this.PhieuLuong = PhieuLuong;
        this.LuongCB = LuongCB;
        this.PhuCap = PhuCap;
        this.Thue = Thue;
        this.MANV = MANV;
    }

    public String getPhieuLuong() {
        return PhieuLuong;
    }

    public void setPhieuLuong(String PhieuLuong) {
        this.PhieuLuong = PhieuLuong;
    }

    public float getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(float LuongCB) {
        this.LuongCB = LuongCB;
    }

    public float getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(float PhuCap) {
        this.PhuCap = PhuCap;
    }

    public float getThue() {
        return Thue;
    }

    public void setThue(float Thue) {
        this.Thue = Thue;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }
    
}
