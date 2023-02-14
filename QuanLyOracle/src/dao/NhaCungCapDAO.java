/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.NhaCungCap;
/**
 *
 * @author aabbb
 */
public class NhaCungCapDAO {
    TruyVan truyvan=new TruyVan();
    public ArrayList<NhaCungCap> LayDS()
    {
        ArrayList<NhaCungCap>dsNhaCungCap=new ArrayList<NhaCungCap>();
        try {
                truyvan.open();
                String sql="select * from nhacungcap";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    NhaCungCap ncc=new NhaCungCap();
                    ncc.setMaNhaCungCap(rs.getString(1));
                    ncc.setTenNhaCungCap(rs.getString(2));
                    ncc.setSoDienThoai(rs.getString(3));
                    ncc.setEmail(rs.getString(4));
                    ncc.setGhiChu(rs.getString(5));
                    dsNhaCungCap.add(ncc);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsNhaCungCap;
    }
    public ArrayList<NhaCungCap> TimkiemNhaCungCap(String mancc)
    {
        ArrayList<NhaCungCap>dsNhaCungCap=new ArrayList<NhaCungCap>();
        try {
                truyvan.open();
                String sql="select * from nhacungcap where mancc like N'%"+mancc+"%' or tenncc like N'%"+mancc+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                    NhaCungCap ncc=new NhaCungCap();
                    ncc.setMaNhaCungCap(rs.getString(1));
                    ncc.setTenNhaCungCap(rs.getString(2));
                    ncc.setSoDienThoai(rs.getString(2));
                    ncc.setEmail(rs.getString(3));
                    ncc.setGhiChu(rs.getString(4));
                    dsNhaCungCap.add(ncc);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsNhaCungCap;
    }
    public void Them(NhaCungCap x)
    {
        try {
            truyvan.open();
            String sql=String.format("insert into nhacungcap values('%s',N'%s','%s','%s',N'%s')",x.getMaNhaCungCap(),x.getTenNhaCungCap(),x.getSoDienThoai(),x.getEmail(),x.getGhiChu());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Xoa(NhaCungCap x)
    {
        try {
            truyvan.open();
            String sql=String.format("Delete from nhacungcap where mancc='%s'", x.getMaNhaCungCap());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void Sua(NhaCungCap x)
    {
        try {
            truyvan.open();
            String sql=String.format("update nhacungcap set tenncc=N'%s',sdt='%s',email='%s',ghichu=N'%s' where mancc='%s'", x.getTenNhaCungCap(),x.getSoDienThoai(),x.getEmail(),x.getGhiChu(),x.getMaNhaCungCap());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
}
