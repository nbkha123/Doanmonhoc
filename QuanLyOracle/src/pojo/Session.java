
package pojo;

public class Session {
    private int SID;
    private int SERIAL;
    private int AUDSID;
    private String USERNAME;
    private String PROGRAM;
    private int SL;

    public Session() {
    }

    public Session(int SID, int SERIAL, int AUDSID, String USERNAME, String PROGRAM, int SL) {
        this.SID = SID;
        this.SERIAL = SERIAL;
        this.AUDSID = AUDSID;
        this.USERNAME = USERNAME;
        this.PROGRAM = PROGRAM;
        this.SL = SL;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public int getSERIAL() {
        return SERIAL;
    }

    public void setSERIAL(int SERIAL) {
        this.SERIAL = SERIAL;
    }

    public int getAUDSID() {
        return AUDSID;
    }

    public void setAUDSID(int AUDSID) {
        this.AUDSID = AUDSID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPROGRAM() {
        return PROGRAM;
    }

    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    

    
    
}
