package com.example.demo.model;

public class Work {
    private String workIntroduce;

    private String enterpriseName;

    private String label;

    private String minMoney;

    private String maxMoney;

    private String address;

    private String experience;

    private String education;

    public String getWorkIntroduce() {
        return workIntroduce;
    }

    public void setWorkIntroduce(String workIntroduce) {
        this.workIntroduce = workIntroduce == null ? null : workIntroduce.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(String minMoney) {
        this.minMoney = minMoney == null ? null : minMoney.trim();
    }

    public String getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(String maxMoney) {
        this.maxMoney = maxMoney == null ? null : maxMoney.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }
}