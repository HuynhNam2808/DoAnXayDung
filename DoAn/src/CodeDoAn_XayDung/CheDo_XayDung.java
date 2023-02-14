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
public class CheDo_XayDung {
    private String MACD;
    private String LoaiCD;
    private Float TienCD;
    private String BaoHiem;

    public CheDo_XayDung(String MACD, String LoaiCD, float TienCD, String BaoHiem) {
        this.MACD = MACD;
        this.LoaiCD = LoaiCD;
        this.TienCD = TienCD;
        this.BaoHiem = BaoHiem;
    }

    public String getMACD() {
        return MACD;
    }

    public void setMACD(String MACD) {
        this.MACD = MACD;
    }

    public String getLoaiCD() {
        return LoaiCD;
    }

    public void setLoaiCD(String LoaiCD) {
        this.LoaiCD = LoaiCD;
    }

    public Float getTienCD() {
        return TienCD;
    }

    public void setTienCD(Float TienCD) {
        this.TienCD = TienCD;
    }

   

    public String getBaoHiem() {
        return BaoHiem;
    }

    public void setBaoHiem(String BaoHiem) {
        this.BaoHiem = BaoHiem;
    }
    
}
