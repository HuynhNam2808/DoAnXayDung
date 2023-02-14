/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;
import java.sql.Date;
/**
 *
 * @author ASIA
 */
public class NhanVien_XayDung {
    private String MANV;
    private String HOTEN;
    private String GT;
    private String DC;
    private String SDT;
    private Date NS;
    private String MACVu;
    private String MAPB;

    public NhanVien_XayDung(){}
    
    public NhanVien_XayDung(String MANV, String HOTEN, String GT, String DC, String SDT, Date NS, String MACVu, String MAPB) {
        this.MANV = MANV;
        this.HOTEN = HOTEN;
        this.GT = GT;
        this.DC = DC;
        this.SDT = SDT;
        this.NS = NS;
        this.MACVu = MACVu;
        this.MAPB = MAPB;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNS() {
        return NS;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }

    public String getMACVu() {
        return MACVu;
    }

    public void setMACVu(String MACVu) {
        this.MACVu = MACVu;
    }

    public String getMAPB() {
        return MAPB;
    }

    public void setMAPB(String MAPB) {
        this.MAPB = MAPB;
    }
    
}
