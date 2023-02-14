package FormDoAN_XayDung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import CodeDoAn_XayDung.CheDoModel_XayDung;
import CodeDoAn_XayDung.CheDo_XayDung;
import java.sql.SQLException;
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
public class FormCheDo extends javax.swing.JFrame {
    private static Vector header =new Vector();
    private static Vector data ;
    DefaultTableModel model = new DefaultTableModel();
    public CheDoModel_XayDung x = new CheDoModel_XayDung();
    /**
     * Creates new form FormCheDo
     */
    public FormCheDo() throws SQLException {
        initComponents();
        tbCheDo.setModel(x.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSoTien = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        bntThoat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        bntMaPhongBan = new javax.swing.JLabel();
        btnTenPhongBan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThongTin = new javax.swing.JButton();
        tbnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBaoHiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCheDo = new javax.swing.JTable();
        txtMaCD = new javax.swing.JTextField();
        txtLoaiCD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 0, 0));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        bntThoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntThoat.setForeground(new java.awt.Color(204, 0, 0));
        bntThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        bntThoat.setText("Thoát");
        bntThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThoatActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(204, 0, 0));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searching-magnifying-glass.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        bntMaPhongBan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bntMaPhongBan.setText("Mã Chế Độ");

        btnTenPhongBan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTenPhongBan.setText("Loại Chế Độ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("QUẢN LÝ CHẾ ĐỘ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Số Tiền");

        btnThongTin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThongTin.setForeground(new java.awt.Color(204, 0, 0));
        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); // NOI18N
        btnThongTin.setText("Thông Tin");
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });

        tbnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbnThem.setForeground(new java.awt.Color(204, 0, 0));
        tbnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
        tbnThem.setText("Thêm");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(204, 0, 0));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrench.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Bảo Hiểm");

        tbCheDo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Chế Độ", "Loại Chế Độ", "Tổng Số", "Bảo Hiểm"
            }
        ));
        tbCheDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCheDoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCheDo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntMaPhongBan)
                                    .addComponent(btnTenPhongBan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoaiCD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoTien, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(txtBaoHiem))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnThem)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntThoat)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(btnThongTin))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThongTin)
                            .addComponent(btnTimKiem)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntMaPhongBan)
                            .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLoaiCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(btnTenPhongBan))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBaoHiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnThem)
                            .addComponent(btnSua))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(bntThoat))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed

        CheDo_XayDung cd = new CheDo_XayDung(txtMaCD.getText(),txtLoaiCD.getText(),Float.parseFloat(txtSoTien.getText().trim()),txtBaoHiem.getText());
        if (x.add(cd)){
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo" , JOptionPane.INFORMATION_MESSAGE);
            tbCheDo.setModel(x.getAll());
        }
           else
            JOptionPane.showMessageDialog(this, "Thêm không thành công", "Thông báo" , JOptionPane.INFORMATION_MESSAGE);     
        
    }//GEN-LAST:event_tbnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         CheDo_XayDung cd = new CheDo_XayDung(txtMaCD.getText(),txtLoaiCD.getText(),Float.parseFloat(txtSoTien.getText().trim()),txtBaoHiem.getText());
     try {
         if (x.update(cd))
         {
             JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo" , JOptionPane.INFORMATION_MESSAGE);
             tbCheDo.setModel(x.getAll());
         }
         else
             JOptionPane.showMessageDialog(this, "Sủa không thành công", "Thông báo" , JOptionPane.INFORMATION_MESSAGE);
     } catch (SQLException ex) {
         Logger.getLogger(FormCheDo.class.getName()).log(Level.SEVERE, null, ex);
     }    
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
      int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa không?","Thông Báo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (result==0)
         {
             String thongbao;
             thongbao=x.delete(txtMaCD.getText())? "Xóa thành công": "Xóa không thành công";
             JOptionPane.showMessageDialog(this,thongbao,"Thông Báo",JOptionPane.INFORMATION_MESSAGE);
             tbCheDo.setModel(x.getAll());
         }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (x.find(txtTimKiem.getText()).getRowCount()!=0)
            tbCheDo.setModel(x.find(txtTimKiem.getText()));
        else
            JOptionPane.showMessageDialog(this, "Không tìm thấy", "Thông báo" , JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        tbCheDo.setModel(x.getAll());
    }//GEN-LAST:event_btnThongTinActionPerformed

    private void tbCheDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCheDoMouseClicked
       int row = tbCheDo.getSelectedRow();
       txtMaCD.setText(tbCheDo.getValueAt(row, 0).toString());
       txtLoaiCD.setText(tbCheDo.getValueAt(row, 1).toString());
       txtSoTien.setText(tbCheDo.getValueAt(row, 2).toString());
       txtBaoHiem.setText(tbCheDo.getValueAt(row, 3).toString()); 
    }//GEN-LAST:event_tbCheDoMouseClicked

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
            java.util.logging.Logger.getLogger(FormCheDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCheDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCheDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCheDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormCheDo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormCheDo.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCheDo;
    private javax.swing.JButton tbnThem;
    private javax.swing.JTextField txtBaoHiem;
    private javax.swing.JTextField txtLoaiCD;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}