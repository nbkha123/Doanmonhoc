/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author aabbb
 */
public class TaiKhoan {
    private String username;
    private String tennv;
    private String pass;

    public TaiKhoan() {
    }

    public TaiKhoan(String username, String tennv, String pass) {
        this.username = username;
        this.tennv = tennv;
        this.pass = pass;
    }

    public String getTaikhoan() {
        return username;
    }

    public void setTaikhoan(String username) {
        this.username = username;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getMatkhau() {
        return pass;
    }

    public void setMatkhau(String pass) {
        this.pass = pass;
    }
    
    
}
