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
public class SGA {
    private String NAME;
    private int BYTES;
    private String RESIZEABLE;
    private int CON_ID;

    public SGA() {
    }

    public SGA(String NAME, int BYTES, String RESIZEABLE, int CON_ID) {
        this.NAME = NAME;
        this.BYTES = BYTES;
        this.RESIZEABLE = RESIZEABLE;
        this.CON_ID = CON_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getBYTES() {
        return BYTES;
    }

    public void setBYTES(int BYTES) {
        this.BYTES = BYTES;
    }

    public String getRESIZEABLE() {
        return RESIZEABLE;
    }

    public void setRESIZEABLE(String RESIZEABLE) {
        this.RESIZEABLE = RESIZEABLE;
    }

    public int getCON_ID() {
        return CON_ID;
    }

    public void setCON_ID(int CON_ID) {
        this.CON_ID = CON_ID;
    }
    
}
