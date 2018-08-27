package com.example.demo.model;

public class Student {
    private Integer stId;

    private String stName;

    private String stSex;

    private String stAge;

    private String stTel;

    private String stDept;

    private String stAddress;

    private String searchJobInfo;

    private String stPassword;

    private String stExperience;

    private String stEmail;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStSex() {
        return stSex;
    }

    public void setStSex(String stSex) {
        this.stSex = stSex == null ? null : stSex.trim();
    }

    public String getStAge() {
        return stAge;
    }

    public void setStAge(String stAge) {
        this.stAge = stAge == null ? null : stAge.trim();
    }

    public String getStTel() {
        return stTel;
    }

    public void setStTel(String stTel) {
        this.stTel = stTel == null ? null : stTel.trim();
    }

    public String getStDept() {
        return stDept;
    }

    public void setStDept(String stDept) {
        this.stDept = stDept == null ? null : stDept.trim();
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress == null ? null : stAddress.trim();
    }

    public String getSearchJobInfo() {
        return searchJobInfo;
    }

    public void setSearchJobInfo(String searchJobInfo) {
        this.searchJobInfo = searchJobInfo == null ? null : searchJobInfo.trim();
    }

    public String getStPassword() {
        return stPassword;
    }

    public void setStPassword(String stPassword) {
        this.stPassword = stPassword == null ? null : stPassword.trim();
    }

    public String getStExperience() {
        return stExperience;
    }

    public void setStExperience(String stExperience) {
        this.stExperience = stExperience == null ? null : stExperience.trim();
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail == null ? null : stEmail.trim();
    }
}