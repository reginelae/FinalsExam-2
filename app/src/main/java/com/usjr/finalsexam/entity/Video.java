package com.usjr.finalsexam.entity;

public class Video {

    public String id;
    public String title;
    public String description;
    public String thumbnailUrl;

    public Video() {
    }

    public Video(String id, String title, String description, String thumbnailUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
    }
}
