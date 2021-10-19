package com.codewithchinex;

public class ReportCard {
    int CSC201;
    int CVE201;
    int MEE205;
    int MEE204;
    int CPE405;
    int CPE401;
    String name;

    public ReportCard() {
        CSC201 = 0;
        CVE201 = 0;
        MEE204 = 0;
        MEE205 = 0;
        CPE401 = 0;
        CPE405 = 0;
        name = "Student";
    }
    public ReportCard(int CSC201, int CVE201, int MEE204, int MEE205, int CPE401, int CPE405, String name) {

        this.CSC201 = CSC201;
        this.CVE201 = CVE201;
        this.MEE204 = MEE204;
        this.MEE205 = MEE205;
        this.CPE405 = CPE405;
        this.CPE401 = CPE401;
        this.name = name;
    }

    public int getCSC201() {
        return CSC201;
    }
    public void setCSC201(int grade){
        CSC201 = grade;
    }
    public int getCVE201() {
        return CVE201;
    }
    public void setCVE201(int grade){
        CVE201 = grade;
    }
    public int getMEE204() {
        return MEE204;
    }
    public void setMEE204(int grade){
        MEE204 = grade;
    }
    public int getMEE205() {
        return MEE205;
    }
    public void setMEE205(int grade){
        MEE205 = grade;
    }
    public int getCPE401() {
        return CPE401;
    }
    public void setCPE401(int grade){
        CPE401 = grade;
    }
    public int getCPE405() {
        return CPE405;
    }
    public void setCPE405(int grade){
        CPE405 = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name +  " {CSC201=" + CSC201 + ", CVE201=" + CVE201 + ", MEE205=" + MEE205 + ", MEE204=" + MEE204 + ", CPE405=" + CPE405 + ", CPE401=" + CPE401 + "}";
    }
}
