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
public class PhongBanModel_XayDung {
             private Statement st;
     public PhongBanModel_XayDung() {
     try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
     }
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã phòng ban");
        header.add("Tên phòng ban");
        header.add("Số điện thoại");  
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbPhongBan";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String mapb, tenpb, sdt ;                       
            mapb = rs.getString("MAPB");
            tenpb = rs.getString("TenPB");
            sdt = rs.getString("SDT");                   
            model.addRow(new Object[] {mapb, tenpb, sdt});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
    }
     public boolean add(PhongBan_XayDung pb){
        String sql = "INSERT INTO tbPhongBan VALUES('" + pb.getMaPB()+ "', N'" 
                + pb.getTenPB()+ "', N'" + pb.getSDT() + "')";
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
      public boolean update(PhongBan_XayDung pb) throws SQLException {
        String sql = "UPDATE tbPhongBan SET TenPB = N'" + pb.getTenPB()
         + "', SDT = N'" + pb.getSDT() + "' WHERE MAPB = '" 
                + pb.getMaPB() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
       public boolean delete(String mapb) {
        String sql = "DELETE FROM tbPhongBan WHERE MAPB = '" + mapb + "'";
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
        header.add("Mã phòng ban");
        header.add("Tên phòng ban");
        header.add("Số điện thoại");  
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbPhongBan WHERE MAPB = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String mapb, tenpb, sdt ;                       
            mapb = rs.getString("MAPB");
            tenpb = rs.getString("TenPB");
            sdt = rs.getString("SDT");                   
            model.addRow(new Object[] {mapb, tenpb, sdt});   
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
