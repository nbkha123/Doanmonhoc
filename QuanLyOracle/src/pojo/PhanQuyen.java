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
public class PhanQuyen {
    private String PRIVILEGE;
    private String GRANTEE;
    private String ADMIN_OPTION;
    private String COMMON;
    private String INHERITED;
    private String ROLE;
    private String ROLEID;

    public PhanQuyen() {
    }

    public PhanQuyen(String PRIVILEGE, String GRANTEE, String ADMIN_OPTION, String COMMON, String INHERITED, String ROLE, String ROLEID) {
        this.PRIVILEGE = PRIVILEGE;
        this.GRANTEE = GRANTEE;
        this.ADMIN_OPTION = ADMIN_OPTION;
        this.COMMON = COMMON;
        this.INHERITED = INHERITED;
        this.ROLE = ROLE;
        this.ROLEID = ROLEID;
    }

    public String getPRIVILEGE() {
        return PRIVILEGE;
    }

    public void setPRIVILEGE(String PRIVILEGE) {
        this.PRIVILEGE = PRIVILEGE;
    }

    public String getGRANTEE() {
        return GRANTEE;
    }

    public void setGRANTEE(String GRANTEE) {
        this.GRANTEE = GRANTEE;
    }

    public String getADMIN_OPTION() {
        return ADMIN_OPTION;
    }

    public void setADMIN_OPTION(String ADMIN_OPTION) {
        this.ADMIN_OPTION = ADMIN_OPTION;
    }

    public String getCOMMON() {
        return COMMON;
    }

    public void setCOMMON(String COMMON) {
        this.COMMON = COMMON;
    }

    public String getINHERITED() {
        return INHERITED;
    }

    public void setINHERITED(String INHERITED) {
        this.INHERITED = INHERITED;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID;
    }
    
}
