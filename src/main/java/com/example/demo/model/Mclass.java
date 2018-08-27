package com.example.demo.model;

public class Mclass {
    private String className;

    private String classManager;

    private String classCheck;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager == null ? null : classManager.trim();
    }

    public String getClassCheck() {
        return classCheck;
    }

    public void setClassCheck(String classCheck) {
        this.classCheck = classCheck == null ? null : classCheck.trim();
    }
}