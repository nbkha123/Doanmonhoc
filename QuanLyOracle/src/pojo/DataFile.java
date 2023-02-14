
package pojo;

public class DataFile {
    private int FILE;
    private int CREATION_CHANGE;
    private String CREATION_TIME;
    private String STATUS;
    private String ENABLED;
    private String NAME;

    public DataFile() {
    }

    public DataFile(int FILE, int CREATION_CHANGE, String CREATION_TIME, String STATUS, String ENABLED, String NAME) {
        this.FILE = FILE;
        this.CREATION_CHANGE = CREATION_CHANGE;
        this.CREATION_TIME = CREATION_TIME;
        this.STATUS = STATUS;
        this.ENABLED = ENABLED;
        this.NAME = NAME;
    }

    public int getFILE() {
        return FILE;
    }

    public void setFILE(int FILE) {
        this.FILE = FILE;
    }

    public int getCREATION_CHANGE() {
        return CREATION_CHANGE;
    }

    public void setCREATION_CHANGE(int CREATION_CHANGE) {
        this.CREATION_CHANGE = CREATION_CHANGE;
    }

    public String getCREATION_TIME() {
        return CREATION_TIME;
    }

    public void setCREATION_TIME(String CREATION_TIME) {
        this.CREATION_TIME = CREATION_TIME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getENABLED() {
        return ENABLED;
    }

    public void setENABLED(String ENABLED) {
        this.ENABLED = ENABLED;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
            
}
