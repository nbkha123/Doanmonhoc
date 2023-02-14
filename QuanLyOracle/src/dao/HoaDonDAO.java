/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.HoaDon;
import pojo.ChiTietHD;
import pojo.SanPham;
/**
 *
 * @author aabbb
 */
public class HoaDonDAO {
    TruyVan truyvan=new TruyVan();
    public ArrayList<ChiTietHD> LayDS(String ma)
    {
        ArrayList<ChiTietHD> dsHD=new ArrayList<ChiTietHD>();
        try {
                truyvan.open();
                String sql="select * from chitiethd where mahd="+ma;
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    ChiTietHD cthd=new ChiTietHD();
                    cthd.setMaHoaDon(rs.getInt(1));
                    cthd.setMaSanPham(rs.getString(2));
                    cthd.setTenSanPham(rs.getString(3));
                    cthd.setSoLuong(rs.getInt(4));
                    cthd.setDonGia(rs.getInt(5));
                    cthd.setThanhTien(rs.getInt(6));
                    dsHD.add(cthd);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsHD;
    }
    public ArrayList<HoaDon> LayDSHD()
    {
        ArrayList<HoaDon>dsHD=new ArrayList<HoaDon>();
        try {
                truyvan.open();
                String sql="select * from hoadon order by mahd asc";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    HoaDon hd=new HoaDon();
                    hd.setMaHoaDon(rs.getInt(1));
                    hd.setNgayTao(rs.getString(2));
                    hd.setTongTien(rs.getInt(3)); 
                    dsHD.add(hd);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsHD;
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
                    sp.setSoLuong(rs.getInt(3));
                    sp.setDonGiaBan(rs.getInt(4));
                    sp.setLoaiSanPham(rs.getString(5));
                    dsSanPham.add(sp);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSanPham;
    }
    public void Them()
    {
        try {
            truyvan.open();
            String sql=String.format("INSERT INTO HOADON(NGAYTAOHD,TONGTIEN) VALUES(to_date(CURRENT_DATE,'dd/mm/yyyy'),0)");
            truyvan.executeUpdate(sql);            
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void UpdateHD()
    {
        try {
            truyvan.open();
            String sql=String.format("update hoadon h set tongtien=(select sum(thanhtien) from chitiethd c where h.mahd=c.mahd)");
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void ThemCTHD(ChiTietHD x)
    {
        try {
            truyvan.open();
            String sql=String.format("INSERT INTO CHITIETHD VALUES(%d,'%s','%s',%d,%d,%d*%d)",
                    x.getMaHoaDon(),x.getMaSanPham(),x.getTenSanPham(),x.getSoLuong(),x.getDonGia(),x.getSoLuong(),x.getDonGia());           
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void XoaCTHD(ChiTietHD x)
    {
        try {
            truyvan.open();
            String sql=String.format("DELETE FROM CHITIETHD where mahd=%d",x.getMaHoaDon());           
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }

}
