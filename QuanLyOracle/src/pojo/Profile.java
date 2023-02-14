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
public class Profile {
    private String name;
    private String matKhau;
    private String tenProfile;

    public Profile() {
    }

    public Profile(String name, String matKhau, String tenProfile) {
        this.name = name;
        this.matKhau = matKhau;
        this.tenProfile = tenProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenProfile() {
        return tenProfile;
    }

    public void setTenProfile(String tenProfile) {
        this.tenProfile = tenProfile;
    }
    
}
