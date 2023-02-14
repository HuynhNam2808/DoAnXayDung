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
public class PhongBan_XayDung {
    private String MaPB;
    private String TenPB;
    private String SDT;

    public PhongBan_XayDung(String MaPB, String TenPB, String SDT) {
        this.MaPB = MaPB;
        this.TenPB = TenPB;
        this.SDT = SDT;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
