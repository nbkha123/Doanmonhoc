/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.TaiKhoan;

/**
 *
 * @author aabbb
 */
public class TaiKhoanDAO {
    TruyVan truyvan=new TruyVan();
    public boolean LayDS(String username,String pass)
    {
        
        try {
                truyvan.open();
                String sql="select * from TAIKHOAN where username='"+username+"' and pass='"+pass+"'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {   
                        TaiKhoan tk=new TaiKhoan();
                        tk.setTaikhoan(rs.getString("username"));
                        tk.setMatkhau(rs.getString("pass"));
                        return true;               
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return false;
    }    
    public boolean ktDangNhap(String tennv)
    {
        try {
                truyvan.open();
                String sql="select * from TAIKHOAN,NHANVIEN where TAIKHOAN.TENNV = NHANVIEN.TENNV AND TAIKHOAN.TENNV ='"+tennv+"'";
                ResultSet rs=truyvan.executeQuery(sql);
                if(rs.next())
                {
                    return true;
                }
                truyvan.Close();
                return false;               
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return false;
    }
    public void Them(TaiKhoan x)
    {
        try {
            truyvan.open();
            String sql=String.format("insert into taikhoan values('%s',N'%s','%s')",x.getTaikhoan(),x.getTennv(),x.getMatkhau());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
}
