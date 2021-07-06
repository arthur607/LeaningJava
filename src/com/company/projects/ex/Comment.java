package com.company.projects.ex;

public class Comment {
    private String text;

    public Comment(){           //empty constructor

    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
