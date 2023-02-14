
package pojo;

public class User {
    private String USERNAME;
    private String CREATED;
    private String EXPIRY_DATE;
    private String ACCOUNT_STATUS;
    private String PROFILE;
    private String DEFAULT_TABLESPACE;

    public User() {
    }

    public User(String USERNAME, String CREATED, String EXPIRY_DATE, String ACCOUNT_STATUS, String PROFILE, String DEFAULT_TABLESPACE) {
        this.USERNAME = USERNAME;
        this.CREATED = CREATED;
        this.EXPIRY_DATE = EXPIRY_DATE;
        this.ACCOUNT_STATUS = ACCOUNT_STATUS;
        this.PROFILE = PROFILE;
        this.DEFAULT_TABLESPACE = DEFAULT_TABLESPACE;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getCREATED() {
        return CREATED;
    }

    public void setCREATED(String CREATED) {
        this.CREATED = CREATED;
    }

    public String getEXPIRY_DATE() {
        return EXPIRY_DATE;
    }

    public void setEXPIRY_DATE(String EXPIRY_DATE) {
        this.EXPIRY_DATE = EXPIRY_DATE;
    }

    public String getACCOUNT_STATUS() {
        return ACCOUNT_STATUS;
    }

    public void setACCOUNT_STATUS(String ACCOUNT_STATUS) {
        this.ACCOUNT_STATUS = ACCOUNT_STATUS;
    }

    public String getPROFILE() {
        return PROFILE;
    }

    public void setPROFILE(String PROFILE) {
        this.PROFILE = PROFILE;
    }

    public String getDEFAULT_TABLESPACE() {
        return DEFAULT_TABLESPACE;
    }

    public void setDEFAULT_TABLESPACE(String DEFAULT_TABLESPACE) {
        this.DEFAULT_TABLESPACE = DEFAULT_TABLESPACE;
    }

}
