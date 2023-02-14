/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pojo.NhaCungCap;
import dao.NhaCungCapDAO;
import dao.TruyVan;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author nbkha
 */
public class frmNhaCungCap extends javax.swing.JDialog {

    /**
     * Creates new form frmNhaCungCap
     */
    NhaCungCapDAO x=new NhaCungCapDAO();
    public frmNhaCungCap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Nhà cung cấp ");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMancc = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        lblMaNCC = new javax.swing.JLabel();
        txtMaNcc = new javax.swing.JTextField();
        lblTenNCC = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtGhichu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSNCC = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Nhà Cung Cấp");

        lblMancc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMancc.setText("Tìm Mã NCC");

        btnTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 102, 102));
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        lblMaNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaNCC.setText("Mã NCC");

        txtMaNcc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTenNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenNCC.setText("Tên NCC");

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSDT.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblGhiChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGhiChu.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Ghi chú");

        txtGhichu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGhichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhichuActionPerformed(evt);
            }
        });

        tbDSNCC.setBackground(new java.awt.Color(204, 204, 204));
        tbDSNCC.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDSNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSNCC);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 102, 102));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 102, 102));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 102, 102));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenNCC)
                            .addComponent(lblMaNCC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenNCC)
                            .addComponent(txtMaNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblGhiChu)
                            .addComponent(lblSDT))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtGhichu)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMancc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMancc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNCC)
                            .addComponent(txtMaNcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNCC)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGhiChu)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGhichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhichuActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String col[]={"Mã NhaCungCap","Tên NhaCungCap","SĐT","Email","Ghi chú"};
        ArrayList<NhaCungCap> t=x.TimkiemNhaCungCap(txtTim.getText());
        DefaultTableModel dtm=new DefaultTableModel(col,0);
        for(int i=0;i<t.size();i++)
        {
            Object []obj={t.get(i).getMaNhaCungCap(),t.get(i).getTenNhaCungCap(),t.get(i).getSoDienThoai(),t.get(i).getEmail(),t.get(i).getGhiChu()};
            dtm.addRow(obj);

        }
        tbDSNCC.setModel(dtm);
        tbDSNCC.updateUI();

    }//GEN-LAST:event_btnTimActionPerformed

    private void tbDSNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSNCCMouseClicked
        // TODO add your handling code here:
        int row=tbDSNCC.getSelectedRow();
        this.txtMaNcc.setText((String)tbDSNCC.getValueAt(row, 0).toString().trim());
        this.txtTenNCC.setText((String)tbDSNCC.getValueAt(row, 1).toString().trim());
        this.txtSDT.setText((String)tbDSNCC.getValueAt(row, 2).toString().trim());
        this.txtEmail.setText((String)tbDSNCC.getValueAt(row, 3).toString().trim());
        this.txtGhichu.setText((String)tbDSNCC.getValueAt(row, 4).toString().trim());
    }//GEN-LAST:event_tbDSNCCMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(txtMaNcc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhà cung cấp");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm nhà cung cấp không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNcc.getText())==true)
            {
                JOptionPane.showMessageDialog(this, "Đã tồn tại mã nhà cung cấp này. Vui lòng chọn mã khác ");
                return;
            }
            NhaCungCap ncc=new NhaCungCap();
            ncc.setMaNhaCungCap(txtMaNcc.getText().trim());
            ncc.setTenNhaCungCap(txtTenNCC.getText().trim());
            ncc.setSoDienThoai( txtSDT.getText().trim());
            ncc.setEmail(txtEmail.getText().trim());
            ncc.setGhiChu(txtGhichu.getText().trim());
            x.Them(ncc);
            updateTable();
            JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công");
            xoatrang();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(txtMaNcc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhà cung cấp");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhà cung cấp này không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNcc.getText())==false)
            {
                JOptionPane.showMessageDialog(this, "Không có mã nhà cung cấp này. Vui lòng nhập mã khác ");
                return;
            }
            NhaCungCap ncc=new NhaCungCap();
            ncc.setMaNhaCungCap(txtMaNcc.getText());
            x.Xoa(ncc);
            updateTable();
            JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
            xoatrang();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(txtMaNcc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng  nhập mã nhà cung cấp");
            return;
        }
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa nhà cung cấp này không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            if(ktTrungMa(txtMaNcc.getText())==true)
            {
                NhaCungCap ncc=new NhaCungCap();
                ncc.setMaNhaCungCap(txtMaNcc.getText());
                ncc.setTenNhaCungCap(txtTenNCC.getText());
                ncc.setSoDienThoai( txtSDT.getText());
                ncc.setEmail(txtEmail.getText());
                ncc.setGhiChu(txtGhichu.getText());
                x.Sua(ncc);
                updateTable();
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
                xoatrang();
            }
            else
            {
                NhaCungCap ncc=new NhaCungCap();
                ncc.setMaNhaCungCap(txtMaNcc.getText().trim());
                ncc.setTenNhaCungCap(txtTenNCC.getText().trim());
                ncc.setSoDienThoai( txtSDT.getText().trim());
                ncc.setEmail(txtEmail.getText().trim());
                ncc.setGhiChu(txtGhichu.getText().trim());
                x.Them(ncc);
                updateTable();
                JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công");
                xoatrang();
            }

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(this, "Bạn đã thoát thành công");
            this.setVisible(false);

        }
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(frmNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNhaCungCap dialog = new frmNhaCungCap(new javax.swing.JFrame(), true);
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
       String col[]={"Mã NCC","Tên NCC","SĐT","Email","Ghi chú"};
        ArrayList<NhaCungCap> t=x.LayDS();
        DefaultTableModel dtm=new DefaultTableModel(col,0);
        for(int i=0;i<t.size();i++)
        {
            Object []obj={t.get(i).getMaNhaCungCap(),t.get(i).getTenNhaCungCap(),t.get(i).getSoDienThoai(),t.get(i).getEmail(),t.get(i).getGhiChu()};
            dtm.addRow(obj);
            
        }
        tbDSNCC.setModel(dtm);
        tbDSNCC.updateUI();
    }
    private void xoatrang() {
        txtMaNcc.setText("");
        txtTenNCC.setText("");
        txtEmail.setText("");
        txtGhichu.setText("");
        txtSDT.setText("");
        txtMaNcc.requestFocus();
    }
    private boolean ktTrungMa(String ma)
    {
        
         try {
            String sql="select mancc from nhacungcap where mancc='"+ma+"'";
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
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblMaNCC;
    private javax.swing.JLabel lblMancc;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNCC;
    private javax.swing.JTable tbDSNCC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtMaNcc;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
