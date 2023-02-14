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
public class ChucVuModel_XayDung {
    private Statement st;
    public ChucVuModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    }
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã chức vụ");
        header.add("Tên chức vụ");
        header.add("Mã công việc");  
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbChucVu";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String macvu, tencvu, macv ;                       
            macvu = rs.getString("MACVu");
            tencvu = rs.getString("TenCVu");
            macv = rs.getString("MACV");                   
            model.addRow(new Object[] {macvu,tencvu,macv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
    }
     public boolean add(ChucVu_XayDung cvu){
        String sql = "INSERT INTO tbChucVu VALUES('" + cvu.getMaCVU()+ "', N'" 
                + cvu.getTenCVU()+ "', N'" + cvu.getMACV() + "')";
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
      public boolean update(ChucVu_XayDung cvu) throws SQLException {
        String sql = "UPDATE tbChucVu SET TenCVU = N'" + cvu.getTenCVU()
         + "', MACV = N'" + cvu.getMACV() + "' WHERE MACVu = '"+ cvu.getMaCVU() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
       public boolean delete(String macvu) {
        String sql = "DELETE FROM tbChucVu WHERE MACVU = '" + macvu + "'";
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
        header.add("Mã chức vụ");
        header.add("Tên chức vụ");
        header.add("Mã công việc");  
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbChucVu WHERE MACVU = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String macvu, tencvu, macv ;                       
            macvu = rs.getString("MACVu");
            tencvu = rs.getString("TenCVu");
            macv = rs.getString("MACV");                   
            model.addRow(new Object[] {macvu,tencvu,macv});   
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
