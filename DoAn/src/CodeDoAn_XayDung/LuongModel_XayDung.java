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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASIA
 */
public class LuongModel_XayDung {
     private Statement st;
    public LuongModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    }
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Phiếu lương");
        header.add("Lương cơ bản");
        header.add("Phụ cấp");  
        header.add("Thuế");
        header.add("Mã nhân viên");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbLuong";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String phieuluong,manv ;  float luongcb,phucap,thue;                     
            phieuluong = rs.getString("PhieuLuong");
            luongcb = rs.getFloat("LuongCB");
            phucap = rs.getFloat("PhuCap");  
            thue = rs.getFloat("Thue");             
            manv=rs.getString("MANV");
            model.addRow(new Object[] {phieuluong,luongcb,phucap,thue,manv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
    }
     public boolean add(Luong_XayDung luong){
       String sql = "INSERT INTO tbLuong VALUES(N'" + luong.getPhieuLuong()+ "', " + luong.getLuongCB()+ ", " 
               +luong.getPhuCap() + ", " + luong.getThue() + ", N'" + luong.getMANV() + "')";
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
      public boolean update(Luong_XayDung luong) throws SQLException {
        String sql = "UPDATE tbLuong SET LuongCB = " + luong.getLuongCB()
         + ", PhuCap = " + luong.getPhuCap() + ",Thue="+luong.getThue()+
          ",MANV=N'"+luong.getMANV()+"' WHERE PhieuLuong = N'"+ luong.getPhieuLuong() + "'";
        int r = st.executeUpdate(sql);
        if (r > 0)
            return true;
        return false;
    } 
       public boolean delete(String phieuluong) {
        String sql = "DELETE FROM tbLuong WHERE PhieuLuong = '" + phieuluong + "'";
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
      public DefaultTableModel find(String phieu) {
        Vector header =new Vector();
        header.add("Phiếu lương");
        header.add("Lương cơ bản");
        header.add("Phụ cấp");  
        header.add("Thuế");
        header.add("Mã nhân viên");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbLuong WHERE PhieuLuong = '" + phieu + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String phieuluong,manv; 
            float luongcb,phucap,thue;                     
            phieuluong = rs.getString("PhieuLuong");
            luongcb = rs.getFloat("LuongCB");
            phucap = rs.getFloat("PhuCap");  
            thue = rs.getFloat("Thue");             
            manv=rs.getString("MANV");
            model.addRow(new Object[] {phieuluong,luongcb,phucap,thue,manv});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }

}
