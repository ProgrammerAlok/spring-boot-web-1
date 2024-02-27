package com.alokpau.SpringBootWeb1;

public class Student {
    private int sroll;
    private String sname;

    public int getSroll() {
        return sroll;
    }

    public void setSroll(int sroll) {
        this.sroll = sroll;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sroll=" + sroll +
                ", sname='" + sname + '\'' +
                '}';
    }
}
