/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.Profile;
import pojo.Profile1;
/**
 *
 * @author aabbb
 */
public class ProFileDAO {
    TruyVanHT truyvan=new TruyVanHT();
    public ArrayList<Profile1> LayDSProFile()
    {
        ArrayList<Profile1>ds=new ArrayList<Profile1>();
        try {
                truyvan.open();
                String sql="SELECT DISTINCT profile,resource_name, limit FROM dba_profiles";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    Profile1 a=new Profile1();
                    a.setProfile(rs.getString(1));
                    a.setResource_name(rs.getString(2));
                    a.setLimit(rs.getString(3));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Profile1> TimKiemProFile(String ma)
    {
        ArrayList<Profile1>ds=new ArrayList<Profile1>();
        try {
                truyvan.open();
                String sql="SELECT DISTINCT profile,resource_name, limit FROM dba_profiles where profile like '%"+ma+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    Profile1 a=new Profile1();
                    a.setProfile(rs.getString(1));
                    a.setResource_name(rs.getString(2));
                    a.setLimit(rs.getString(3));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Profile1> LayCBProFile()
    {
        ArrayList<Profile1>ds=new ArrayList<Profile1>();
        try {
                truyvan.open();
                String sql="SELECT DISTINCT profile FROM dba_profiles";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    Profile1 a=new Profile1();
                    a.setProfile(rs.getString(1));                  
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public void ThemProFile(Profile1 x)
    {
        try {
            truyvan.open();
            String sql=String.format("create PROFILE %s LIMIT FAILED_LOGIN_ATTEMPTS %d PASSWORD_LOCK_TIME %d PASSWORD_LIFE_TIME %d PASSWORD_GRACE_TIME %d",
                    x.getProfile(),x.getSplanketnoihong(),x.getSongayhkoa(),x.getHansudung(),x.getGiahandoipass());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void SuaProFile(Profile1 x)
    {
        try {
            truyvan.open();
            String sql=String.format("Alter PROFILE %s LIMIT FAILED_LOGIN_ATTEMPTS %d PASSWORD_LOCK_TIME %d PASSWORD_LIFE_TIME %d PASSWORD_GRACE_TIME %d",
                    x.getProfile(),x.getSplanketnoihong(),x.getSongayhkoa(),x.getHansudung(),x.getGiahandoipass());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void XoaProFile(Profile1 x)
    {
        try {
            truyvan.open();
            String sql=String.format("DROP PROFILE %s CASCADE", x.getProfile());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void ThemUser(Profile x)
    {
        try {
            truyvan.open();
            String sql=String.format("CREATE USER %s IDENTIFIED BY %s",x.getName(),x.getMatKhau());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void SuaUser(Profile x)
    {
        try {
            truyvan.open();
            String sql=String.format("ALTER USER %s PROFILE %s",x.getName(),x.getTenProfile());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    public void XoaUser(Profile x)
    {
        try {
            truyvan.open();
            String sql=String.format("DROP USER %s",x.getName());
            truyvan.executeUpdate(sql);
            truyvan.Close();
        } catch (ClassNotFoundException ex) {        
        }catch (SQLException ex){         
        }
    }
    
}
