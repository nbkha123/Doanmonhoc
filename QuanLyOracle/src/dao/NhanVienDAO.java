/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.NhanVien;

/**
 *
 * @author aabbb
 */
public class NhanVienDAO {
    TruyVan truyvan=new TruyVan();
    public ArrayList<NhanVien> LayDS()
    {
        ArrayList<NhanVien>dsNhanVien=new ArrayList<NhanVien>();
        try {
                truyvan.open();
                String sql="select * from nhanvien";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    NhanVien nv=new NhanVien();
                    nv.setMaNhanVien(rs.getString(1));
                    nv.setTenNhanVien(rs.getString(2));
                    nv.setGioiTinh(rs.getString(3));
                    nv.setNgaySinh(rs.getString(4));
                    nv.setSoDienThoai(rs.getString(5));
                    nv.setEmail(rs.getString(6));
                    dsNhanVien.add(nv);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsNhanVien;
    }
    public ArrayList<NhanVien> Timkiem(String manv)
    {
        ArrayList<NhanVien>dsNhanVien=new ArrayList<NhanVien>();
        try {
                truyvan.open();
                String sql="select * from nhanvien where manv like N'%"+manv+"%' or tennv like N'%"+manv+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    NhanVien nv=new NhanVien();
                    nv.setMaNhanVien(rs.getString(1));
                    nv.setTenNhanVien(rs.getString(2));
                    nv.setGioiTinh(rs.getString(3));
                    nv.setNgaySinh(rs.getString(4));
                    nv.setSoDienThoai(rs.getString(5));
                    nv.setEmail(rs.getString(6));
                    dsNhanVien.add(nv);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsNhanVien;
    }
    public void Them(NhanVien x)
    {
        try {
            truyvan.open();
            String sql=String.format("insert into NhanVien values('%s',N'%s',N'%s',to_date('%s','dd/mm/yyyy'),'%s','%s')",x.getMaNhanVien(),x.getTenNhanVien(),x.getGioiTinh(),x.getNgaySinh(),x.getSoDienThoai(),x.getEmail());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Xoa(NhanVien x)
    {
        try {
            truyvan.open();
            String sql=String.format("Delete from NhanVien where manv='%s'", x.getMaNhanVien());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Sua(NhanVien x)
    {
        try {
            truyvan.open();
            String sql=String.format("update nhanvien set tennv=N'%s',gioitinh=N'%s',ngaysinh=to_date('%s','dd/mm/yyyy'),sdt='%s',email='%s' where manv='%s'", x.getTenNhanVien(),x.getGioiTinh(),x.getNgaySinh(),x.getSoDienThoai(),x.getEmail(),x.getMaNhanVien());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
}
