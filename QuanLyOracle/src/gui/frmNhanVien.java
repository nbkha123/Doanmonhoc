/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dao.NhanVienDAO;
import dao.TruyVan;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.NhaCungCap;
import pojo.NhanVien;

/**
 *
 * @author nbkha
 */
public class frmNhanVien extends javax.swing.JDialog {

    /**
     * Creates new form frmNhanVien
     */
    NhanVienDAO x=new NhanVienDAO();
    public frmNhanVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Nhân viên ");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblTenNV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        txtGT = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        txtNS = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSNV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        bnSua = new javax.swing.JButton();
        bnThoat = new javax.swing.JButton();
        lblMaNv = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        bnTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaNV.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenNV.setText("Tên nhân viên");

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGioiTinh.setText("Giới tính");

        txtGT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgaySinh.setText("Ngày sinh");

        txtNS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSDT.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbDSNV.setBackground(new java.awt.Color(204, 204, 204));
        tbDSNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbDSNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDSNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSNV);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Nhân Viên");

        bnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnThem.setForeground(new java.awt.Color(255, 102, 102));
        bnThem.setText("Thêm");
        bnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 102, 102));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        bnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnSua.setForeground(new java.awt.Color(255, 102, 102));
        bnSua.setText("Sửa");
        bnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSuaActionPerformed(evt);
            }
        });

        bnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnThoat.setForeground(new java.awt.Color(255, 102, 102));
        bnThoat.setText("Thoát");
        bnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThoatActionPerformed(evt);
            }
        });

        lblMaNv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaNv.setText("Tìm mã nhân viên");

        txtTim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        bnTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnTim.setForeground(new java.awt.Color(255, 102, 102));
        bnTim.setText("Tìm kiếm");
        bnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV)
                            .addComponent(lblTenNV)
                            .addComponent(lblGioiTinh)
                            .addComponent(lblNgaySinh)
                            .addComponent(lblSDT)
                            .addComponent(lblEmail))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtNS)
                            .addComponent(txtGT)
                            .addComponent(txtTenNV)
                            .addComponent(txtMaNV)
                            .addComponent(txtSDT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMaNv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnTim))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(491, 491, 491))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNV)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNV)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioiTinh)
                            .addComponent(txtGT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh)
                            .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnTim)
                            .addComponent(lblMaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDSNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSNVMouseClicked
        // TODO add your handling code here:
        int row=tbDSNV.getSelectedRow();
        this.txtMaNV.setText((String)tbDSNV.getValueAt(row, 0).toString().trim());
        this.txtTenNV.setText((String)tbDSNV.getValueAt(row, 1).toString().trim());
        this.txtGT.setText((String)tbDSNV.getValueAt(row, 2).toString().trim());
        this.txtNS.setText((String)tbDSNV.getValueAt(row, 3).toString().trim());
        this.txtSDT.setText((String)tbDSNV.getValueAt(row, 4).toString().trim());
        this.txtEmail.setText((String)tbDSNV.getValueAt(row, 5).toString().trim());
    }//GEN-LAST:event_tbDSNVMouseClicked

    private void bnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThemActionPerformed
        // TODO add your handling code here:
        if(txtMaNV.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm nhân viên mới không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNV.getText())==true)
            {
                JOptionPane.showMessageDialog(this, "Đã tồn tại mã nhân viên này. Vui lòng chọn mã khác ");
                return;
            }
            NhanVien nv=new NhanVien();
            nv.setMaNhanVien(txtMaNV.getText().trim());
            nv.setTenNhanVien(txtTenNV.getText().trim());
            nv.setGioiTinh(txtGT.getText().trim());
            nv.setNgaySinh(txtNS.getText().trim());
            nv.setSoDienThoai(txtSDT.getText().trim());
            nv.setEmail(txtEmail.getText().trim());
            x.Them(nv);
            updateTable();
            JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công");
            xoatrang();
        }
    }//GEN-LAST:event_bnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(txtMaNV.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhân viên này không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNV.getText())==false)
            {
                JOptionPane.showMessageDialog(this, "Không có mã nhân viên này. Vui lòng nhập mã khác ");
                return;
            }
            NhanVien nv=new NhanVien();
            nv.setMaNhanVien(txtMaNV.getText());
            x.Xoa(nv);
            updateTable();
            JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
            xoatrang();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void bnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSuaActionPerformed
        // TODO add your handling code here:
        if(txtMaNV.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật nhân viên này không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNV.getText())==true)
            {
                NhanVien nv=new NhanVien();
                nv.setMaNhanVien(txtMaNV.getText().trim());
                nv.setTenNhanVien(txtTenNV.getText().trim());
                nv.setGioiTinh(txtGT.getText().trim());
                nv.setNgaySinh(txtNS.getText().trim());
                nv.setSoDienThoai(txtSDT.getText().trim());
                nv.setEmail(txtEmail.getText().trim());
                x.Sua(nv);
                updateTable();
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
                xoatrang();
            }
            else
            {
                NhanVien nv=new NhanVien();
                nv.setMaNhanVien(txtMaNV.getText().trim());
                nv.setTenNhanVien(txtTenNV.getText().trim());
                nv.setGioiTinh(txtGT.getText().trim());
                nv.setNgaySinh(txtNS.getText().trim());
                nv.setSoDienThoai(txtSDT.getText().trim());
                nv.setEmail(txtEmail.getText().trim());
                x.Them(nv);
                updateTable();
                JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công");
                xoatrang();
            }

        }
    }//GEN-LAST:event_bnSuaActionPerformed

    private void bnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThoatActionPerformed
        // TODO add your handling code here:
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã thoát thành công");
            this.setVisible(false);

        }
    }//GEN-LAST:event_bnThoatActionPerformed

    private void bnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTimActionPerformed
        // TODO add your handling code here:
        String col[]={"Mã NV","Tên NV","Giới Tính","Ngày Sinh","SĐT","Email"};
        ArrayList<NhanVien> t=x.Timkiem(txtTim.getText());
        DefaultTableModel dtm=new DefaultTableModel(col,0);
        for(int i=0;i<t.size();i++)
        {
            Object []obj={t.get(i).getMaNhanVien(),t.get(i).getTenNhanVien(),t.get(i).getGioiTinh(),t.get(i).getNgaySinh(),t.get(i).getSoDienThoai(),t.get(i).getEmail()};
            dtm.addRow(obj);

        }
        tbDSNV.setModel(dtm);
        tbDSNV.updateUI();
    }//GEN-LAST:event_bnTimActionPerformed

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
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNhanVien dialog = new frmNhanVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void updateTable() {
        String col[]={"Mã NV","Tên NV","Giới Tính","Ngày Sinh","SĐT","Email"};
        ArrayList<NhanVien> t=x.LayDS();
        DefaultTableModel dtm=new DefaultTableModel(col,0);
        for(int i=0;i<t.size();i++)
        {
            Object []obj={t.get(i).getMaNhanVien(),t.get(i).getTenNhanVien(),t.get(i).getGioiTinh(),t.get(i).getNgaySinh(),t.get(i).getSoDienThoai(),t.get(i).getEmail()};
            dtm.addRow(obj);
            
        }
        tbDSNV.setModel(dtm);
        tbDSNV.updateUI();
    }
    private void xoatrang() {
        txtEmail.setText("");
        txtGT.setText("");
        txtMaNV.setText("");
        txtNS.setText("");
        txtSDT.setText("");
        txtTenNV.setText("");
        txtMaNV.requestFocus();
    }
    private boolean ktTrungMa(String ma)
    {
        
         try {
            String sql="select manv from nhanvien where manv='"+ma+"'";
            TruyVan provider=new TruyVan();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            if(rs.next())
            {
               return true;
            }
            return false;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnSua;
    private javax.swing.JButton bnThem;
    private javax.swing.JButton bnThoat;
    private javax.swing.JButton bnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNv;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JTable tbDSNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGT;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNS;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}