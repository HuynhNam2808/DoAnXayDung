package FormDoAN_XayDung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import CodeDoAn_XayDung.HoSo_XayDung;
import CodeDoAn_XayDung.HoSoModel_XayDung;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import KetNoiCSDL_CirCleK.KetNoi;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class FormHoSo extends javax.swing.JFrame {
    private static Vector header =new Vector();
    private static Vector data ;
    DefaultTableModel model = new DefaultTableModel();
    public HoSoModel_XayDung x = new HoSoModel_XayDung();
    /**
     * Creates new form FormHoSo
     */
    public FormHoSo() throws SQLException { 
        initComponents(); 
        tbHoSo.setModel(x.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnXoa = new javax.swing.JButton();
        bntThoat = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        bntMaPhongBan = new javax.swing.JLabel();
        btnTenPhongBan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThongTin = new javax.swing.JButton();
        tbnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGKS = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoSo = new javax.swing.JTable();
        txtMaHS = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        txttrinhdo = new javax.swing.JTextField();
        txtGKSK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 0, 0));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        bntThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntThoat.setForeground(new java.awt.Color(204, 0, 0));
        bntThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        bntThoat.setText("Tho??t");
        bntThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThoatActionPerformed(evt);
            }
        });

        bntMaPhongBan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntMaPhongBan.setText("M?? H??? S??");

        btnTenPhongBan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTenPhongBan.setText("Tr??nh ?????");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("QU???N L?? H??? S??");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Gi???y Kh??m S???c Kh???e");

        btnThongTin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThongTin.setForeground(new java.awt.Color(204, 0, 0));
        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); // NOI18N
        btnThongTin.setText("Th??ng Tin");
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });

        tbnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbnThem.setForeground(new java.awt.Color(204, 0, 0));
        tbnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
        tbnThem.setText("Th??m");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(204, 0, 0));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrench.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Gi???y Khai Sinh");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("M?? Nh??n Vi??n");

        tbHoSo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? H??? S??", "Tr??nh ?????", "Gi???y Kh??m SK", "Gi???y Khai Sinh", "M?? Nh??n Vi??n"
            }
        ));
        tbHoSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoSoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHoSo);

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 0, 0));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searching-magnifying-glass.png"))); // NOI18N
        btnTimKiem.setText("T??m Ki???m");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThongTin)
                .addGap(52, 52, 52)
                .addComponent(tbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bntThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTenPhongBan)
                            .addComponent(jLabel3)
                            .addComponent(bntMaPhongBan)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(txtGKSK)
                            .addComponent(txttrinhdo)
                            .addComponent(txtMaHS)
                            .addComponent(txtGKS))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntMaPhongBan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttrinhdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTenPhongBan))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGKSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtGKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntThoat)
                    .addComponent(btnSua)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbnThem)
                        .addComponent(btnThongTin)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        HoSo_XayDung hs = new HoSo_XayDung(txtMaHS.getText(),txttrinhdo.getText(),txtGKSK.getText(),txtGKS.getText(),txtManv.getText());
     try {
         if (x.update(hs))
         {
             JOptionPane.showMessageDialog(this, "S???a th??nh c??ng", "Th??ng b??o" , JOptionPane.INFORMATION_MESSAGE);
             tbHoSo.setModel(x.getAll());
         }
         else
             JOptionPane.showMessageDialog(this, "S???a kh??ng th??nh c??ng", "Th??ng b??o" , JOptionPane.INFORMATION_MESSAGE);
     } catch (SQLException ex) {
         Logger.getLogger(FormHoSo.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
        HoSo_XayDung hs = new HoSo_XayDung(txtMaHS.getText(),txttrinhdo.getText(),txtGKSK.getText(),txtGKS.getText(),txtManv.getText());
        if (x.add(hs))
        {
            JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng", "Th??ng b??o" , JOptionPane.INFORMATION_MESSAGE);
            tbHoSo.setModel(x.getAll());
        }
        else
            JOptionPane.showMessageDialog(this, "Th??m kh??ng th??nh c??ng", "Th??ng b??o" , JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_tbnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       int result = JOptionPane.showConfirmDialog(null,"B???n c?? ch???c mu???n x??a kh??ng?","Th??ng B??o",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (result==0)
         {
             String thongbao;
             thongbao=x.delete(txtMaHS.getText())? "X??a th??nh c??ng": "X??a kh??ng th??nh c??ng";
             JOptionPane.showMessageDialog(this,thongbao,"Th??ng B??o",JOptionPane.INFORMATION_MESSAGE);
             tbHoSo.setModel(x.getAll());
         }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         if (x.find(txtTimKiem.getText()).getRowCount()!=0)
            tbHoSo.setModel(x.find(txtTimKiem.getText()));
        else
            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y", "Th??ng b??o" , JOptionPane.INFORMATION_MESSAGE);   
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        tbHoSo.setModel(x.getAll());
    }//GEN-LAST:event_btnThongTinActionPerformed

    private void tbHoSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoSoMouseClicked
        int row = tbHoSo.getSelectedRow();
        txtMaHS.setText(tbHoSo.getValueAt(row, 0).toString());
        txttrinhdo.setText(tbHoSo.getValueAt(row, 1).toString());
        txtGKSK.setText(tbHoSo.getValueAt(row, 2).toString());
        txtGKS.setText(tbHoSo.getValueAt(row, 3).toString());
        txtManv.setText(tbHoSo.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tbHoSoMouseClicked

    private void bntThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThoatActionPerformed
       this.dispose();
    }//GEN-LAST:event_bntThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormHoSo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormHoSo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bntMaPhongBan;
    private javax.swing.JButton bntThoat;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel btnTenPhongBan;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHoSo;
    private javax.swing.JButton tbnThem;
    private javax.swing.JTextField txtGKS;
    private javax.swing.JTextField txtGKSK;
    private javax.swing.JTextField txtMaHS;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txttrinhdo;
    // End of variables declaration//GEN-END:variables
}
