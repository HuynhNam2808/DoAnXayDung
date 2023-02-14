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
public class ChamCongModel_XayDung {
    private Statement st;
    public ChamCongModel_XayDung(){
  try {
            this.st = KetNoi.getStament();
        } catch (SQLException ex) {
        }
    }
    public DefaultTableModel getAll() {
        Vector header =new Vector();
        header.add("Mã chấm công");
        header.add("Mã nhân viên");
        header.add("Số ngày làm việc");  
        header.add("Số ngày phép");
        header.add("Số ngày không phép");
        header.add("Số giờ tăng ca");
        header.add("Mã chế độ");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbChamCong";
        try
        {
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            String macc,manv,macd ;  int snlv,snp,snkp,sgtc;                     
            macc = rs.getString("MABCC");
            manv = rs.getString("MANV");
            snlv = rs.getInt("SoNgayLamViec");  
            snp = rs.getInt("SoNgayPhep");  
            snkp = rs.getInt("SoNgayKhongPhep");
            sgtc = rs.getInt("SoGioTangCa");
            macd=rs.getString("MACD");
            model.addRow(new Object[] {macc,manv,snlv,snp,snkp,sgtc,macd});    
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
        return model;
    }
     public boolean add(ChamCong_XayDung cc){
       String sql = "INSERT INTO tbChamCong VALUES('" + cc.getMABCC()+ "', N'" + cc.getMANV()+ "', " 
               +cc.getSoNgayLV() + ", " + cc.getSoNgayPhep() + ", " + cc.getSoNgayKP() + ","+ cc.getSoGioTC() + ",N'" + cc.getMACD() + "')";
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
      public boolean update(ChamCong_XayDung cc) throws SQLException {
        String sql = "UPDATE tbChamCong SET MANV = N'" + cc.getMANV()
         + "', SoNgayLamViec = '" + cc.getSoNgayLV() + "',SoNgayPhep='"+cc.getSoNgayPhep()
         +"',SoNgayKhongPhep='"+cc.getSoNgayKP()+"',Sogiotangca='"+cc.getSoGioTC()+
          "',MACD=N'"+cc.getMACD()+"' WHERE MABCC = N'"+ cc.getMABCC() + "'";
        int r = st.executeUpdate(sql);
        if(r > 0)
            return true;
        return false;
    } 
       public boolean delete(String mabcc) {
        String sql = "DELETE FROM tbChamCong WHERE MABCC = '" + mabcc + "'";
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
       header.add("Mã chấm công");
        header.add("Mã nhân viên");
        header.add("Số ngày làm việc");  
        header.add("Số ngày phép");
        header.add("Số ngày không phép");
        header.add("Số giờ tăng ca");
        header.add("Mã chế độ");
        DefaultTableModel model = new DefaultTableModel() ;
        model.setDataVector(null, header);
        String sql = "SELECT * FROM tbChamCong WHERE MABCC = '" + ma + "'";
        try
        {
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String macc,manv,snlv,snp,snkp,sgtc,macd ;                       
            macc = rs.getString("MABCC");
            manv = rs.getString("MANV");
            snlv = rs.getString("SoNgayLamViec");  
            snp = rs.getString("SoNgayPhep");
            snkp = rs.getString("SoNgayKhongPhep");
            sgtc = rs.getString("SoGioTangCa");
            macd=rs.getString("MACD");
            model.addRow(new Object[] {macc,manv,snlv,snp,snkp,sgtc,macd});     
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return model;
    }

}
