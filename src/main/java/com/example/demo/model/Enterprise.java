package com.example.demo.model;

public class Enterprise {
    private Integer enterpriseId;

    private String enterprisePassword;

    private String enterpriseName;

    private String enterpriseAddress;

    private String enterpriseInfo;

    private String enterprisEmail;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterprisePassword() {
        return enterprisePassword;
    }

    public void setEnterprisePassword(String enterprisePassword) {
        this.enterprisePassword = enterprisePassword == null ? null : enterprisePassword.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public String getEnterpriseInfo() {
        return enterpriseInfo;
    }

    public void setEnterpriseInfo(String enterpriseInfo) {
        this.enterpriseInfo = enterpriseInfo == null ? null : enterpriseInfo.trim();
    }

    public String getEnterprisEmail() {
        return enterprisEmail;
    }

    public void setEnterprisEmail(String enterprisEmail) {
        this.enterprisEmail = enterprisEmail == null ? null : enterprisEmail.trim();
    }
}