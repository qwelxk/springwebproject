package com.example.demo.model;

public class StudentClass extends StudentClassKey {
    private String stuClassCheck;

    public String getStuClassCheck() {
        return stuClassCheck;
    }

    public void setStuClassCheck(String stuClassCheck) {
        this.stuClassCheck = stuClassCheck == null ? null : stuClassCheck.trim();
    }
}