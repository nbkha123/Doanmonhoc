/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.DataFile;
import pojo.PGA;
import pojo.SGA;
import pojo.User;
import pojo.Instance;
import pojo.Database;
import pojo.Session;
import pojo.Process;
import pojo.Policy;

/**
 *
 * @author aabbb
 */
public class PGADAO {
    
    TruyVanHT truyvan=new TruyVanHT();
    public ArrayList<PGA> LayDS()
    {
        ArrayList<PGA>dsSP=new ArrayList<PGA>();
        try {
                truyvan.open();
                String sql="select * from V$PGASTAT";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    PGA a=new PGA();
                    a.setNAME(rs.getString(1));
                    a.setVALUES(rs.getInt(2));
                    a.setUNIT(rs.getString(3));
                    a.setCON_ID(rs.getInt(4));  
                    dsSP.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSP;
    }
    public ArrayList<SGA> LayDSSGA()
    {
        ArrayList<SGA>dsSGA=new ArrayList<SGA>();
        try {
                truyvan.open();
                String sql="select * from v$sgainfo";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    SGA a=new SGA();
                    a.setNAME(rs.getString(1));
                    a.setBYTES(rs.getInt(2));
                    a.setRESIZEABLE(rs.getString(3));
                    a.setCON_ID(rs.getInt(4));  
                    dsSGA.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return dsSGA;
    }
    public ArrayList<User> LayDSUser()
    {
        ArrayList<User>ds=new ArrayList<User>();
        try {
                truyvan.open();
                String sql="select USERNAME,CREATED,EXPIRY_DATE,ACCOUNT_STATUS,PROFILE from dba_users";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    User a=new User();
                    a.setUSERNAME(rs.getString(1));
                    a.setCREATED(rs.getString(2));
                    a.setEXPIRY_DATE(rs.getString(3));
                    a.setACCOUNT_STATUS(rs.getString(4));  
                    a.setPROFILE(rs.getString(5)); 
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<User> LayDSUser1()
    {
        ArrayList<User>ds=new ArrayList<User>();
        try {
                truyvan.open();
                String sql="select USERNAME,PROFILE from dba_users";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {                   
                    User a=new User();
                    a.setUSERNAME(rs.getString(1));                    
                    a.setPROFILE(rs.getString(2)); 
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<User> LayDSUser2(String ma)
    {
        ArrayList<User>ds=new ArrayList<User>();
        try {
                truyvan.open();
                String sql="select USERNAME,PROFILE from dba_users where username like'%"+ma+"%'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {                   
                    User a=new User();
                    a.setUSERNAME(rs.getString(1));                    
                    a.setPROFILE(rs.getString(2)); 
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<User> LayDSUserTableSpace()
    {
        ArrayList<User>ds=new ArrayList<User>();
        try {
                truyvan.open();
                String sql="select USERNAME,DEFAULT_TABLESPACE from dba_users ";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    User a=new User();
                    a.setUSERNAME(rs.getString(1));
                    a.setDEFAULT_TABLESPACE(rs.getString(2));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Instance> LayDSInstance()
    {
        ArrayList<Instance>ds=new ArrayList<Instance>();
        try {
                truyvan.open();
                String sql="select instance_number,instance_name,host_name,status,PARALLEL from v$instance";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    Instance a=new Instance();
                    a.setINSTANCE_NUMBER(rs.getInt(1));
                    a.setINSTANCE_NAME(rs.getString(2));
                    a.setHOST_NAME(rs.getString(3));
                    a.setSTATUS(rs.getString(4)); 
                    a.setPARALLEL(rs.getString(5));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Database> LayDSDatabase()
    {
        ArrayList<Database>ds=new ArrayList<Database>();
        try {
                truyvan.open();
                String sql="select dbid,name,created,log_mode,open_mode from v$database";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    Database a=new Database();
                    a.setDBID(rs.getInt(1));
                    a.setNAME(rs.getString(2));
                    a.setCREATED(rs.getString(3));
                    a.setLOG_MODE(rs.getString(4)); 
                    a.setOPEN_MODE(rs.getString(5));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Session> LayDSSession()
    {
        ArrayList<Session>ds=new ArrayList<Session>();
        try {
                truyvan.open();
                String sql="select s.sid,s.serial#,p.spid,s.username,s.program from v$session s,v$process p where p.addr=s.paddr and s.type!='BACKGROUND'";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {                    
                    Session a=new Session();
                    a.setSID(rs.getInt(1));
                    a.setSERIAL(rs.getInt(2));
                    a.setAUDSID(rs.getInt(3));
                    a.setUSERNAME(rs.getString(4));
                    a.setPROGRAM(rs.getString(5));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Session> LaySLSession()
    {
        ArrayList<Session>ds=new ArrayList<Session>();
        try {
                truyvan.open();
                String sql="select count(*)  from V$session";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {                    
                    Session a=new Session();
                    a.setSL(rs.getInt(1));
                    
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Process> LayDSProcess()
    {
        ArrayList<Process>ds=new ArrayList<Process>();
        try {
                truyvan.open();
                String sql="select PID,SOSID,SPID,STID from v$process";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {                    
                    Process a=new Process();
                    a.setPID(rs.getInt(1));
                    a.setSOSID(rs.getInt(2));
                    a.setSPID(rs.getInt(3));
                    a.setSTID(rs.getInt(4));
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Policy> LayDSPocilyHienCo()
    {
        ArrayList<Policy>ds=new ArrayList<Policy>();
        try {
                truyvan.open();
                String sql="select object_schema,object_name,policy_owner,policy_name from dba_audit_policies";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    Policy a=new Policy();
                    a.setOBJECT_SCHEMA(rs.getString(1));
                    a.setOBJECT_NAME(rs.getString(2));
                    a.setPOLICY_OWNER(rs.getString(3));
                    a.setPOLICY_NAME(rs.getString(4)); 
                    
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<Policy> LayDSHDCuaPolicy()
    {
        ArrayList<Policy>ds=new ArrayList<Policy>();
        try {
                truyvan.open();
                String sql="select session_id,db_user,object_name,sql_text,statement_type from dba_fga_audit_trail";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    Policy a=new Policy();
                    a.setSESSION_ID(rs.getInt(1));
                    a.setDB_USER(rs.getString(2));
                    a.setOBJECT_NAME(rs.getString(3));
                    a.setSQL_TEXT(rs.getString(4));
                    a.setSTATEMENT_TYPE(rs.getString(5)); 
                    
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    public ArrayList<DataFile> LayDSDataFile()
    {
        ArrayList<DataFile>ds=new ArrayList<DataFile>();
        try {
                truyvan.open();
                String sql="select FILE#,CREATION_CHANGE#,CREATION_TIME,STATUS,ENABLED,NAME  from v$datafile";
                ResultSet rs=truyvan.executeQuery(sql);
                while(rs.next())
                {
                    
                    DataFile a=new DataFile();
                    a.setFILE(rs.getInt(1));
                    a.setCREATION_CHANGE(rs.getInt(2));
                    a.setCREATION_TIME(rs.getString(3));
                    a.setSTATUS(rs.getString(4));
                    a.setENABLED(rs.getString(5));
                    a.setNAME(rs.getString(6)); 
                    
                    ds.add(a);
                }
                truyvan.Close();
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex){
            
        }
        return ds;
    }
    
}
