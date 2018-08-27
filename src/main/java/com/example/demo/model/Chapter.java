package com.example.demo.model;

public class Chapter {
    private Integer chapterId;

    private String chapterName;

    private String chapterManager;

    private String chapterCheck;

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public String getChapterManager() {
        return chapterManager;
    }

    public void setChapterManager(String chapterManager) {
        this.chapterManager = chapterManager == null ? null : chapterManager.trim();
    }

    public String getChapterCheck() {
        return chapterCheck;
    }

    public void setChapterCheck(String chapterCheck) {
        this.chapterCheck = chapterCheck == null ? null : chapterCheck.trim();
    }
}