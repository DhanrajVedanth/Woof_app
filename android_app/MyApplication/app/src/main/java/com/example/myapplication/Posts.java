package com.example.myapplication;

public class Posts {
    private String username;
    private String text;
    private String photo;

    Posts(String username, String text, String photo) {
        this.username = username;
        this.text = text;
        this.photo = photo;
    }

    public String returnUsername() {
        return this.username;
    }

    public String returnText() {
        return this.text;
    }

    public String returnPhoto() {
        return this.photo;
    }
}
