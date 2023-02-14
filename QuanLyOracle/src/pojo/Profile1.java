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
public class Profile1 {
    private String Profile;
    private String resource_name;
    private String limit;
    private int splanketnoihong;
    private int songayhkoa;
    private int hansudung;
    private int giahandoipass;

    public Profile1() {
    }

    public Profile1(String Profile, String resource_name, String limit, int splanketnoihong, int songayhkoa, int hansudung, int giahandoipass) {
        this.Profile = Profile;
        this.resource_name = resource_name;
        this.limit = limit;
        this.splanketnoihong = splanketnoihong;
        this.songayhkoa = songayhkoa;
        this.hansudung = hansudung;
        this.giahandoipass = giahandoipass;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public int getSplanketnoihong() {
        return splanketnoihong;
    }

    public void setSplanketnoihong(int splanketnoihong) {
        this.splanketnoihong = splanketnoihong;
    }

    public int getSongayhkoa() {
        return songayhkoa;
    }

    public void setSongayhkoa(int songayhkoa) {
        this.songayhkoa = songayhkoa;
    }

    public int getHansudung() {
        return hansudung;
    }

    public void setHansudung(int hansudung) {
        this.hansudung = hansudung;
    }

    public int getGiahandoipass() {
        return giahandoipass;
    }

    public void setGiahandoipass(int giahandoipass) {
        this.giahandoipass = giahandoipass;
    }

    
    
}
