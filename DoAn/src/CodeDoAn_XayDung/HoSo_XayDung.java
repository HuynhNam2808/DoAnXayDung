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
public class HoSo_XayDung {
    private String MAHS;
    private String trinhdo;
    private String GKSK;
    private String GKS;
    private String Manv;

    public HoSo_XayDung(String MAHS, String trinhdo, String GKSK, String GKS, String Manv) {
        this.MAHS = MAHS;
        this.trinhdo = trinhdo;
        this.GKSK = GKSK;
        this.GKS = GKS;
        this.Manv = Manv;
    }

    public String getMAHS() {
        return MAHS;
    }

    public void setMAHS(String MAHS) {
        this.MAHS = MAHS;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getGKSK() {
        return GKSK;
    }

    public void setGKSK(String GKSK) {
        this.GKSK = GKSK;
    }

    public String getGKS() {
        return GKS;
    }

    public void setGKS(String GKS) {
        this.GKS = GKS;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }
    
}
