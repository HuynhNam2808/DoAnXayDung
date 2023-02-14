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
public class CheDoModel_XayDung {
     private Statement st;
    public CheDoModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    
    }
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã chế độ");
        header.add("Loại chế độ");
        header.add("Số tiền");  
        header.add("Bảo hiểm");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbCheDo";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String macd, loaicd, baohiem ; float sotien;                      
            macd = rs.getString("MACD");
            loaicd = rs.getString("LoaiCD");
            sotien = rs.getFloat("TIENCD"); 
            baohiem = rs.getString("BaoHiem");
            model.addRow(new Object[] {macd,loaicd,sotien,baohiem});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
    }
     public boolean add(CheDo_XayDung cd){
        String sql = "INSERT INTO tbCheDo VALUES('" + cd.getMACD()+ "', N'" 
                + cd.getLoaiCD()+ "', " + cd.getTienCD() + ", N'" + cd.getBaoHiem() + "')";
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
      public boolean update(CheDo_XayDung cd) throws SQLException {
        String sql = "UPDATE tbCheDo SET LoaiCD = N'" + cd.getLoaiCD()
         + "', TIENCD = " + cd.getTienCD() + ",BaoHiem=N'"+cd.getBaoHiem()+ "' WHERE MACD = '"+ cd.getMACD() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
       public boolean delete(String macd) {
        String sql = "DELETE FROM tbCheDo WHERE MACD = '" + macd + "'";
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
        header.add("Mã chế độ");
        header.add("Loại chế độ");
        header.add("Số tiền");  
        header.add("Bảo hiểm");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbCheDo WHERE MACD = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String macd, loaicd, baohiem ; double sotien;    
            macd = rs.getString("MACD");
            loaicd = rs.getString("LoaiCD");
            sotien = rs.getFloat("TIENCD"); 
            baohiem = rs.getString("BaoHiem");
            model.addRow(new Object[] {macd,loaicd,sotien,baohiem}); 
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
