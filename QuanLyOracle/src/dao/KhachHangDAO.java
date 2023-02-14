/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.KhachHang;
/**
 *
 * @author aabbb
 */
public class KhachHangDAO {
    TruyVan truyvan=new TruyVan();
    public ArrayList<KhachHang> LayDS()
    {
        ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
        try {
                truyvan.open();
                String sql="select * from khachhang";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    KhachHang kh=new KhachHang();
                    kh.setMaKhachHang(rs.getString(1));
                    kh.setTenKhachHang(rs.getString(2));
                    kh.setGioiTinh(rs.getString(3));
                    kh.setNgaySinh(rs.getString(4));
                    kh.setSoDienThoai(rs.getString(5));
                    
                    dsKH.add(kh);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsKH;
    }
    public ArrayList<KhachHang> Timkiem(String makh)
    {
        ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
        try {
                truyvan.open();
                String sql="select * from khachhang where makh like N'%"+makh+"%' or tenkh like N'%"+makh+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    KhachHang kh=new KhachHang();
                    kh.setMaKhachHang(rs.getString(1));
                    kh.setTenKhachHang(rs.getString(2));
                    kh.setGioiTinh(rs.getString(3));
                    kh.setNgaySinh(rs.getString(4));
                    kh.setSoDienThoai(rs.getString(5));                   
                    dsKH.add(kh);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsKH;
    }
    public void Them(KhachHang x)
    {
        try {
            truyvan.open();
            String sql=String.format("insert into khachhang values('%s',N'%s',N'%s',to_date('%s','dd/mm/yyyy'),'%s')",x.getMaKhachHang(),x.getTenKhachHang(),x.getGioiTinh(),x.getNgaySinh(),x.getSoDienThoai());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Xoa(KhachHang x)
    {
        try {
            truyvan.open();
            String sql=String.format("Delete from khachhang where makh='%s'", x.getMaKhachHang());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Sua(KhachHang x)
    {
        try {
            truyvan.open();
            String sql=String.format("update khachhang set tenkh=N'%s',gioitinh='%s',ngaysinh=to_date('%s','yyyy-mm-dd'),sdt='%s' where makh='%s'", x.getTenKhachHang(),x.getGioiTinh(),x.getNgaySinh(),x.getSoDienThoai(),x.getMaKhachHang());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
}
