
package pojo;

public class Policy {
    private String OBJECT_SCHEMA;
    private String OBJECT_NAME;
    private String POLICY_OWNER;
    private String POLICY_NAME;
    
    private int SESSION_ID;
    private String DB_USER;
    private String SQL_TEXT;
    private String STATEMENT_TYPE;

    public Policy() {
    }

    public Policy(String OBJECT_SCHEMA, String OBJECT_NAME, String POLICY_OWNER, String POLICY_NAME, int SESSION_ID, String DB_USER, String SQL_TEXT, String STATEMENT_TYPE) {
        this.OBJECT_SCHEMA = OBJECT_SCHEMA;
        this.OBJECT_NAME = OBJECT_NAME;
        this.POLICY_OWNER = POLICY_OWNER;
        this.POLICY_NAME = POLICY_NAME;
        this.SESSION_ID = SESSION_ID;
        this.DB_USER = DB_USER;
        this.SQL_TEXT = SQL_TEXT;
        this.STATEMENT_TYPE = STATEMENT_TYPE;
    }

    public String getOBJECT_SCHEMA() {
        return OBJECT_SCHEMA;
    }

    public void setOBJECT_SCHEMA(String OBJECT_SCHEMA) {
        this.OBJECT_SCHEMA = OBJECT_SCHEMA;
    }

    public String getOBJECT_NAME() {
        return OBJECT_NAME;
    }

    public void setOBJECT_NAME(String OBJECT_NAME) {
        this.OBJECT_NAME = OBJECT_NAME;
    }

    public String getPOLICY_OWNER() {
        return POLICY_OWNER;
    }

    public void setPOLICY_OWNER(String POLICY_OWNER) {
        this.POLICY_OWNER = POLICY_OWNER;
    }

    public String getPOLICY_NAME() {
        return POLICY_NAME;
    }

    public void setPOLICY_NAME(String POLICY_NAME) {
        this.POLICY_NAME = POLICY_NAME;
    }

    public int getSESSION_ID() {
        return SESSION_ID;
    }

    public void setSESSION_ID(int SESSION_ID) {
        this.SESSION_ID = SESSION_ID;
    }

    public String getDB_USER() {
        return DB_USER;
    }

    public void setDB_USER(String DB_USER) {
        this.DB_USER = DB_USER;
    }

    public String getSQL_TEXT() {
        return SQL_TEXT;
    }

    public void setSQL_TEXT(String SQL_TEXT) {
        this.SQL_TEXT = SQL_TEXT;
    }

    public String getSTATEMENT_TYPE() {
        return STATEMENT_TYPE;
    }

    public void setSTATEMENT_TYPE(String STATEMENT_TYPE) {
        this.STATEMENT_TYPE = STATEMENT_TYPE;
    }

}
