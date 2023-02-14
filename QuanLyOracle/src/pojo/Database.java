
package pojo;

public class Database {
    private int DBID;
    private String NAME;
    private String CREATED;
    private String LOG_MODE;
    private String OPEN_MODE;

    public Database() {
    }

    public Database(int DBID, String NAME, String CREATED, String LOG_MODE, String OPEN_MODE) {
        this.DBID = DBID;
        this.NAME = NAME;
        this.CREATED = CREATED;
        this.LOG_MODE = LOG_MODE;
        this.OPEN_MODE = OPEN_MODE;
    }

    public int getDBID() {
        return DBID;
    }

    public void setDBID(int DBID) {
        this.DBID = DBID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCREATED() {
        return CREATED;
    }

    public void setCREATED(String CREATED) {
        this.CREATED = CREATED;
    }

    public String getLOG_MODE() {
        return LOG_MODE;
    }

    public void setLOG_MODE(String LOG_MODE) {
        this.LOG_MODE = LOG_MODE;
    }

    public String getOPEN_MODE() {
        return OPEN_MODE;
    }

    public void setOPEN_MODE(String OPEN_MODE) {
        this.OPEN_MODE = OPEN_MODE;
    }
    
}
