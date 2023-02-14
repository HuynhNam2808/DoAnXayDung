/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;
import KetNoiCSDL_CirCleK.KetNoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASIA
 */
public class HoSoModel_XayDung {
    private Statement st;
    public HoSoModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    }

    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã hồ sơ");
        header.add("Trình độ");
        header.add("Giấy khám sức khỏe");  
        header.add("Giấy khai sinh"); 
        header.add("Mã nhân viên");        
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbHoSo";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String mahs, trinhdo, gksk, gks, manv;          
            mahs = rs.getString("MAHS");
            trinhdo = rs.getString("Trinhdo");
            gksk = rs.getString("GiayKhamSucKhoe");
            gks = rs.getString("GiayKhaiSinh");
            manv = rs.getString("MANV" );          
            model.addRow(new Object[] {mahs, trinhdo,gksk,gks,manv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }

    public boolean add(HoSo_XayDung hs){
       String sql = "INSERT INTO tbHoSo VALUES('" + hs.getMAHS()+ "', N'" 
         + hs.getTrinhdo()+ "', N'" + hs.getGKSK() +"', N'" + hs.getGKS()+"', N'" + hs.getManv()+ "')";
        int r=0;
        try
        {
         r = st.executeUpdate(sql);
        } catch (SQLException ex) {
        }
        if(r > 0)
            return true;
        return false;
    }
    public boolean update(HoSo_XayDung hs) throws SQLException {
        String sql = "UPDATE tbHoSO SET Trinhdo = N'" + hs.getTrinhdo()
        + "', GiayKhamSucKhoe = N'" + hs.getGKSK() + "',GiayKhaiSinh = N'"
        +hs.getGKS() + "', MANV = N'" + hs.getManv()  +"' WHERE MAHS = '" + hs.getMAHS() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
    public boolean delete(String mahs) {
        String sql = "DELETE FROM tbHoSo WHERE MAHS = '" + mahs + "'";
        int r=0;
        try
        {
            r = st.executeUpdate(sql);
        } catch (SQLException ex) {
        }
        if(r > 0)
            return true;
        return false;
    }
    public DefaultTableModel find(String ma) {
        Vector header =new Vector();
        header.add("Mã hồ sơ");
        header.add("Trình độ");
        header.add("Giấy khám sức khỏe");  
        header.add("Giấy khai sinh"); 
        header.add("Mã nhân viên");    
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbHoSo WHERE MAHS = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String mahs, trinhdo, gksk, gks, manv;          
            mahs = rs.getString("MAHS");
            trinhdo = rs.getString("Trinhdo");
            gksk = rs.getString("GiayKhamSucKhoe");
            gks = rs.getString("GiayKhaiSinh");
            manv = rs.getString("MANV" );          
            model.addRow(new Object[] {mahs, trinhdo,gksk,gks,manv}); 
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
