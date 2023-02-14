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
public class Process {
    private int PID;
    private int SOSID;
    private int SPID;
    private int STID;

    public Process() {
    }

    public Process(int PID, int SOSID, int SPID, int STID) {
        this.PID = PID;
        this.SOSID = SOSID;
        this.SPID = SPID;
        this.STID = STID;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public int getSOSID() {
        return SOSID;
    }

    public void setSOSID(int SOSID) {
        this.SOSID = SOSID;
    }

    public int getSPID() {
        return SPID;
    }

    public void setSPID(int SPID) {
        this.SPID = SPID;
    }

    public int getSTID() {
        return STID;
    }

    public void setSTID(int STID) {
        this.STID = STID;
    }
    
}
