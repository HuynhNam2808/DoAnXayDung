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
public class ChucVu_XayDung {
    private String MaCVU;
    private String TenCVU;
    private String MACV;

    public ChucVu_XayDung(String MaCVU, String TenCVU, String MACV) {
        this.MaCVU = MaCVU;
        this.TenCVU = TenCVU;
        this.MACV = MACV;
    }    

    public String getMaCVU() {
        return MaCVU;
    }

    public void setMaCVU(String MaCVU) {
        this.MaCVU = MaCVU;
    }

    public String getTenCVU() {
        return TenCVU;
    }

    public void setTenCVU(String TenCVU) {
        this.TenCVU = TenCVU;
    }

    public String getMACV() {
        return MACV;
    }

    public void setMACV(String MANV) {
        this.MACV = MANV;
    }
    
}
