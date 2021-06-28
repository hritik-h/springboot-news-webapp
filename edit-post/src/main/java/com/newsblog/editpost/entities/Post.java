package com.newsblog.editpost.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String creator;
    private  String title;
    private String text;
    private LocalDateTime dateTime;

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", creator='" + creator + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public Post(String creator, String title, String text) {
        this.creator = creator;
        this.title = title;
        this.text = text;
        this.dateTime = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
