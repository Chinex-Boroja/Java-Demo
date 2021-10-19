package com.codewithchinex;

public class TestGrade {
    public static void main(String[] args) {
        ReportCard grades = new ReportCard();

        grades.CPE405 = 85;
        grades.CSC201 = 89;
        grades.CPE401 = 70;
        grades.MEE205 = 90;
        grades.MEE204 = 85;
        grades.CVE201 = 69;
        grades.name = "Amaka";

        System.out.println(grades.toString());
        System.out.println(grades.getCPE401());
    }
}
