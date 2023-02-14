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
public class TruyVan {
   String driver="oracle.jdbc.OracleDriver";
    String urlConnection="jdbc:oracle:thin:@localhost:1521:orcl";
    String name="hr";
    String pass="hr";
    public Connection connection=null;
    public void open() throws ClassNotFoundException,SQLException{
        Class.forName(driver);
        connection=DriverManager.getConnection(urlConnection,name,pass);
        if (connection != null) {
        System.out.println("Kết nối thành công");
 }
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
    
}
