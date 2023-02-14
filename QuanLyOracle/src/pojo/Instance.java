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
public class Instance {
    private int INSTANCE_NUMBER;
    private String INSTANCE_NAME;
    private String HOST_NAME;
    private String STATUS;
    private String PARALLEL;

    public Instance() {
    }

    public Instance(int INSTANCE_NUMBER, String INSTANCE_NAME, String HOST_NAME, String STATUS, String PARALLEL) {
        this.INSTANCE_NUMBER = INSTANCE_NUMBER;
        this.INSTANCE_NAME = INSTANCE_NAME;
        this.HOST_NAME = HOST_NAME;
        this.STATUS = STATUS;
        this.PARALLEL = PARALLEL;
    }

    public int getINSTANCE_NUMBER() {
        return INSTANCE_NUMBER;
    }

    public void setINSTANCE_NUMBER(int INSTANCE_NUMBER) {
        this.INSTANCE_NUMBER = INSTANCE_NUMBER;
    }

    public String getINSTANCE_NAME() {
        return INSTANCE_NAME;
    }

    public void setINSTANCE_NAME(String INSTANCE_NAME) {
        this.INSTANCE_NAME = INSTANCE_NAME;
    }

    public String getHOST_NAME() {
        return HOST_NAME;
    }

    public void setHOST_NAME(String HOST_NAME) {
        this.HOST_NAME = HOST_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getPARALLEL() {
        return PARALLEL;
    }

    public void setPARALLEL(String PARALLEL) {
        this.PARALLEL = PARALLEL;
    }
    
}
