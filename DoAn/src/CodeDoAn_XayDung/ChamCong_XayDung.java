/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;

import javax.swing.table.TableModel;

/**
 *
 * @author ASIA
 */
public class ChamCong_XayDung {
    private String MABCC;
    private String MANV;
    private int SoNgayLV;
    private int SoNgayPhep;
    private int SoNgayKP;
    private int SoGioTC;
    private String MACD;

    public ChamCong_XayDung(String MABCC, String MANV, int SoNgayLV, int SoNgayPhep, int SoNgayKP, int SoGioTC, String MACD) {
        this.MABCC = MABCC;
        this.MANV = MANV;
        this.SoNgayLV = SoNgayLV;
        this.SoNgayPhep = SoNgayPhep;
        this.SoNgayKP = SoNgayKP;
        this.SoGioTC = SoGioTC;
        this.MACD = MACD;
    }

  
    public String getMABCC() {
        return MABCC;
    }

    public void setMABCC(String MABCC) {
        this.MABCC = MABCC;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public int getSoNgayLV() {
        return SoNgayLV;
    }

    public void setSoNgayLV(int SoNgayLV) {
        this.SoNgayLV = SoNgayLV;
    }

    public int getSoNgayPhep() {
        return SoNgayPhep;
    }

    public void setSoNgayPhep(int SoNgayPhep) {
        this.SoNgayPhep = SoNgayPhep;
    }

    public int getSoNgayKP() {
        return SoNgayKP;
    }

    public void setSoNgayKP(int SoNgayKP) {
        this.SoNgayKP = SoNgayKP;
    }

    public int getSoGioTC() {
        return SoGioTC;
    }

    public void setSoGioTC(int SoGioTC) {
        this.SoGioTC = SoGioTC;
    }

    public String getMACD() {
        return MACD;
    }

    public void setMACD(String MACD) {
        this.MACD = MACD;
    }

    
    
}
