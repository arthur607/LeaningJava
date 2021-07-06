package com.company.projects.ex;

import com.company.date.Date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Post {

    private Calendar moment;
    private String title, content, likes;

    private List<Comment> comments = new ArrayList<>();    //association of class


    public Post(Calendar moment, String title, String content, String likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }


    public Calendar getMoment() {
        return moment;
    }

    public void setMoment(Calendar moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    public void addComments(Comment comment){
        comments.add(comment);
    }
    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "moment=" + moment +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likes='" + likes + '\'' +
                ", comments=" + comments +
                '}';
    }
}
