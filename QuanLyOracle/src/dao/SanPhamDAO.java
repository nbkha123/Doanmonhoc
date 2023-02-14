/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.SanPham;
/**
 *
 * @author aabbb
 */
public class SanPhamDAO {
    TruyVan truyvan=new TruyVan();
    public ArrayList<SanPham> LayDS()
    {
        ArrayList<SanPham>dsSanPham=new ArrayList<SanPham>();
        try {
                truyvan.open();
                String sql="select * from sanpham";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {     
                    SanPham sp=new SanPham();
                    sp.setMaSanPham(rs.getString(1));
                    sp.setTenSanPham(rs.getString(2));
                    sp.setDonViTinh(rs.getString(3));
                    sp.setSoLuong(rs.getInt(4));
                    sp.setDonGiaMua(rs.getInt(5));
                    sp.setDonGiaBan(rs.getInt(6));
                    sp.setMaNhaCungCap(rs.getString(7));
                    sp.setLoaiSanPham(rs.getString(8));
                    dsSanPham.add(sp);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSanPham;
    }
    public ArrayList<SanPham> TimKiem(String tensp)
    {
        ArrayList<SanPham>dsSanPham=new ArrayList<SanPham>();
        try {
                truyvan.open();
                String sql="select * from sanpham where tensp like N'%"+tensp+"%' or masp like N'%"+tensp+"%' or loaisanpham like N'%"+tensp+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    SanPham sp=new SanPham();
                    sp.setMaSanPham(rs.getString(1));
                    sp.setTenSanPham(rs.getString(2));
                    sp.setDonViTinh(rs.getString(3));
                    sp.setSoLuong(rs.getInt(4));
                    sp.setDonGiaMua(rs.getInt(5));
                    sp.setDonGiaBan(rs.getInt(6));
                    sp.setMaNhaCungCap(rs.getString(7));
                    sp.setLoaiSanPham(rs.getString(8));
                    dsSanPham.add(sp);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSanPham;
    }
    public void Them(SanPham x)
    {
        try {
            truyvan.open();
            String sql=String.format("insert into sanpham values('%s',N'%s','%s',%d,%d,%d,'%s',N'%s')",x.getMaSanPham(),x.getTenSanPham(),x.getDonViTinh(),x.getSoLuong(),x.getDonGiaMua(),x.getDonGiaBan(),x.getMaNhaCungCap(),x.getLoaiSanPham());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Xoa(SanPham x)
    {
        try {
            truyvan.open();
            String sql=String.format("Delete from sanpham where masp='%s'", x.getMaSanPham());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Sua(SanPham x)
    {
        try {
            truyvan.open();
            String sql=String.format("update sanpham set tensp=N'%s',dvt=N'%s',soluongton=%d,dongiaban=%d,dongiamua=%d,MANCC='%s',loaisanpham='%s'"
               + " where masp='%s'", x.getTenSanPham(),x.getDonViTinh(),x.getSoLuong(),x.getDonGiaMua(),x.getDonGiaBan(),x.getMaNhaCungCap(),x.getLoaiSanPham(),x.getMaSanPham());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void MuaHang(SanPham x)
    {
        try {
            truyvan.open();
            String sql=String.format("update sanpham set soluongton=soluongton-%d where tensp=N'%s'", x.getSoLuong(),x.getTenSanPham());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {
        }catch (SQLException ex) {
        }
    }
}
