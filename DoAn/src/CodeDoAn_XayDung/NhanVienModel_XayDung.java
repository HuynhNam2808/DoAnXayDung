/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeDoAn_XayDung;

import KetNoiCSDL_CirCleK.KetNoi;
import java.sql.Date;
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
public class NhanVienModel_XayDung {
         private Statement st;
    public NhanVienModel_XayDung() {
    try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    }
    
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã nhân viên");
        header.add("Họ tên");
        header.add("Giới tính");  
        header.add("Địa chỉ"); 
        header.add("SĐT"); 
        header.add("Ngày sinh"); 
        header.add("Mã chức vụ"); 
        header.add("Mã phòng ban");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbNhanVien";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String manv, hoten, gt, dc, sdt, macv, mapb;
            Date ns;
            
            manv = rs.getString("MANV");
            hoten = rs.getString("HoTen");
            gt = rs.getString("GioiTinh");
            dc = rs.getString("DiaChi");
            sdt = rs.getString("Sdt" );
            ns = rs.getDate("NgaySinh");
            macv = rs.getString("MACVu");
            mapb = rs.getString("MAPB");
            model.addRow(new Object[] {manv, hoten, gt,dc,sdt,ns,macv,mapb});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }

    public boolean add(NhanVien_XayDung nv){
        String sql = "INSERT INTO tbNhanVien VALUES('" + nv.getMANV()+ "', N'" 
           + nv.getHOTEN()+ "', N'" + nv.getGT() + "', N'" + nv.getDC() + "', N'" + nv.getSDT() + "',"
           + "N'" + nv.getNS() + "',N'" + nv.getMACVu() + "',N'" + nv.getMAPB() + "')";
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
    public boolean update(NhanVien_XayDung nv) throws SQLException {
        String sql = "UPDATE tbNhanVien SET HoTen = N'" + nv.getHOTEN()
                + "', GioiTinh = N'" + nv.getGT() + "', DiaChi = N'"
                + nv.getDC() + "', Sdt = N'"
                + nv.getSDT() + "', NgaySinh = N'"
                + nv.getNS() + "', MACVu = N'"
                + nv.getMACVu() + "', MAPB = N'"
                + nv.getMAPB() +"' WHERE MANV = '" + nv.getMANV() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
    public boolean delete(String manv) {
        String sql = "DELETE FROM tbNhanVien WHERE MANV = '" + manv + "'";
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
        header.add("Mã nhân viên");
        header.add("Họ tên");
        header.add("Giới tính");  
        header.add("Địa chỉ"); 
        header.add("SĐT"); 
        header.add("Ngày sinh"); 
        header.add("Mã chức vụ"); 
        header.add("Mã phòng ban");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbNhanVien WHERE MANV = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String manv, hoten, gt, dc, sdt, macv, mapb;
            Date ns;
            
            manv = rs.getString("MANV");
            hoten = rs.getString("HoTen");
            gt = rs.getString("GioiTinh");
            dc = rs.getString("DiaChi");
            sdt = rs.getString("Sdt" );
            ns = rs.getDate("NgaySinh");
            macv = rs.getString("MACVu");
            mapb = rs.getString("MAPB");
            model.addRow(new Object[] {manv, hoten, gt,dc,sdt,ns,macv,mapb});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }
}
