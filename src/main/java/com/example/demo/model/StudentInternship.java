package com.example.demo.model;

public class StudentInternship extends StudentInternshipKey {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}