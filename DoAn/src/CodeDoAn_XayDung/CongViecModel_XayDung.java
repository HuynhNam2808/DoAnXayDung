/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;
import CodeDoAn_XayDung.CongViec_XayDung;
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
public class CongViecModel_XayDung {
    private Statement st;
    public CongViecModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    
    }
    public DefaultTableModel getAll() { 
        Vector header =new Vector();
        header.add("Mã công việc");
        header.add("Tên công việc");
        header.add("Hình thức làm việc");  
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbCongViec";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String macv, tencv, hinhthuclv ;                       
            macv = rs.getString("MACV");
            tencv = rs.getString("TenCV");
            hinhthuclv = rs.getString("Hinhthuclamviec");                   
            model.addRow(new Object[] {macv,tencv,hinhthuclv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
} 
      public boolean add(CongViec_XayDung cv){
        String sql = "INSERT INTO tbCongViec VALUES('" + cv.getMACV()+ "', N'" 
                + cv.getTENCV()+ "', N'" + cv.getHinhThucLV() + "')";
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
      public boolean update(CongViec_XayDung cv) throws SQLException {
        String sql = "UPDATE tbCongViec SET TenCV = N'" + cv.getTENCV()
         + "', Hinhthuclamviec = N'" + cv.getHinhThucLV()
                + "' WHERE MACV = '" + cv.getMACV() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
       public boolean delete(String macv) {
        String sql = "DELETE FROM tbCongViec WHERE MACV = '" + macv + "'";
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
        header.add("Mã công việc");
        header.add("Tên công việc");
        header.add("Hình thức làm việc");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbCongViec WHERE MACV = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String macv,tencv,hinhthuclv;                 
            macv = rs.getString("MACV");
            tencv = rs.getString("TenCV");
            hinhthuclv = rs.getString("Hinhthuclamviec");
            model.addRow(new Object[] {macv, tencv, hinhthuclv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
