/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.PhanQuyen;
import pojo.User;
/**
 *
 * @author aabbb
 */
public class PQDAO {
    TruyVanHT truyvan=new TruyVanHT();
    public ArrayList<PhanQuyen> LayDS()
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="SELECT * FROM DBA_SYS_PRIVS ";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PhanQuyen a=new PhanQuyen();
                    a.setGRANTEE(rs.getString(1));
                    a.setPRIVILEGE(rs.getString(2));
                    a.setADMIN_OPTION(rs.getString(3));
                    a.setCOMMON(rs.getString(4));
                    a.setINHERITED(rs.getString(5));
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public ArrayList<PhanQuyen> LayDStheoTen(String ten)
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="SELECT * FROM DBA_SYS_PRIVS where grantee like '%"+ten+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PhanQuyen a=new PhanQuyen();
                    a.setGRANTEE(rs.getString(1));
                    a.setPRIVILEGE(rs.getString(2));
                    a.setADMIN_OPTION(rs.getString(3));
                    a.setCOMMON(rs.getString(4));
                    a.setINHERITED(rs.getString(5));
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public ArrayList<User> LayCBTen()
    {
        ArrayList<User>dsSP=new ArrayList<User>();
        try {
                truyvan.open();
                String sql="select username from dba_users ";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    User a=new User();
                    a.setUSERNAME(rs.getString(1));               
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public ArrayList<PhanQuyen> LayCBQuyen()
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="SELECT privilege FROM session_privs";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    PhanQuyen a=new PhanQuyen();
                    a.setPRIVILEGE(rs.getString(1));               
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public void ThemQuyenUser(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            
            String sql=String.format("GRANT %s TO %s", x.getPRIVILEGE(),x.getGRANTEE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void ThuHoiQuyen(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            String sql=String.format("REVOKE %s FROM %s", x.getPRIVILEGE(),x.getGRANTEE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public ArrayList<PhanQuyen> LayDSRole()
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="SELECT ROLE,PRIVILEGE FROM role_sys_privs";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PhanQuyen a=new PhanQuyen();
                    a.setROLE(rs.getString(1));
                    a.setROLEID(rs.getString(2));   
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public ArrayList<PhanQuyen> LayDSRoleTheoTen(String ten)
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="SELECT ROLE,PRIVILEGE FROM role_sys_privs where ROLE like '%"+ten+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PhanQuyen a=new PhanQuyen();
                    a.setROLE(rs.getString(1));
                    a.setROLEID(rs.getString(2));   
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public void TaoRole(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            String sql=String.format("create role %s", x.getROLE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void XoaRole(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            String sql=String.format("drop role %s", x.getROLE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public ArrayList<PhanQuyen> LayCBTenRole()
    {
        ArrayList<PhanQuyen>dsSP=new ArrayList<PhanQuyen>();
        try {
                truyvan.open();
                String sql="select Role from dba_roles ";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PhanQuyen a=new PhanQuyen();
                    a.setROLE(rs.getString(1));               
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public void ThemQuyenRole(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            String sql=String.format("GRANT %s TO %s", x.getPRIVILEGE(),x.getROLE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void ThuHoiQuyenRole(PhanQuyen x)
    {
        try {
            
            truyvan.open();
            String sql=String.format("REVOKE %s FROM %s", x.getPRIVILEGE(),x.getROLE());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
}
