/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aabbb
 */
public class TruyVanHT {
    String driver="oracle.jdbc.OracleDriver";
    String urlConnection="jdbc:oracle:thin:@localhost:1521:orcl";
    String name="sys as sysdba";
    String pass="sys";
    public Connection connection=null;
    public void open() throws ClassNotFoundException,SQLException{
        Class.forName(driver);
        connection=DriverManager.getConnection(urlConnection,name,pass);
    }
    public void Close() throws SQLException
    {
        connection.close();
    }
    public ResultSet executeQuery(String sql) throws SQLException
    {
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(sql);
        return rs;
    }
    public int executeUpdate(String sql) throws SQLException
    {
        int n=-1;
        Statement statement=connection.createStatement();
        n =statement.executeUpdate(sql);
        return n;
    }
    public Boolean Login(String user, String pass) {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(url, user, pass);
            return true;
        } catch (Exception e) {
            System.out.println("Kết nối csdl không thành công");
            return false;
        }
    }
}
