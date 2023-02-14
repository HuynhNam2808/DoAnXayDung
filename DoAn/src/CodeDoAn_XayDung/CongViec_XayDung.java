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
public class CongViec_XayDung {
    private String MACV;
    private String TENCV;
    private String HinhThucLV;
    
    public CongViec_XayDung(){}

    public CongViec_XayDung(String MACV, String TENCV, String HinhThucLV) {
        this.MACV = MACV;
        this.TENCV = TENCV;
        this.HinhThucLV = HinhThucLV;
    }

    public String getMACV() {
        return MACV;
    }

    public void setMACV(String MACV) {
        this.MACV = MACV;
    }

    public String getTENCV() {
        return TENCV;
    }

    public void setTENCV(String TENCV) {
        this.TENCV = TENCV;
    }

    public String getHinhThucLV() {
        return HinhThucLV;
    }

    public void setHinhThucLV(String HinhThucLV) {
        this.HinhThucLV = HinhThucLV;
    }  
}
