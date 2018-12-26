package com.org.pojo;

/**
 * Created by weixin on 17-8-28.
 */
public class User {
    private String sname;
    private String spassword;
    private String sid;
    private int smobile;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getSmobile() {
        return smobile;
    }

    public void setSmobile(int smobile) {
        this.smobile = smobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "sname='" + sname + '\'' +
                ", spassword='" + spassword + '\'' +
                ", sid='" + sid + '\'' +
                ", smobile=" + smobile +
                '}';
    }
}
