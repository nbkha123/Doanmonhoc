
package pojo;

public class PGA {
    private String NAME;
    private int VALUES;
    private String UNIT;
    private int CON_ID;

    public PGA() {
    }

    public PGA(String NAME, int VALUES, String UNIT, int CON_ID) {
        this.NAME = NAME;
        this.VALUES = VALUES;
        this.UNIT = UNIT;
        this.CON_ID = CON_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getVALUES() {
        return VALUES;
    }

    public void setVALUES(int VALUES) {
        this.VALUES = VALUES;
    }

    public String getUNIT() {
        return UNIT;
    }

    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

    public int getCON_ID() {
        return CON_ID;
    }

    public void setCON_ID(int CON_ID) {
        this.CON_ID = CON_ID;
    }
    
}
