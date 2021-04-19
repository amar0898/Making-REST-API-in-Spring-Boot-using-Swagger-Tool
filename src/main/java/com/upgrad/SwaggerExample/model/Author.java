package com.upgrad.SwaggerExample.model;

public class Author {

    private long authorId;

    private String authorName;

    public Author(){
        System.out.println("*** EMPTY AUTHOR CONSTRUCTOR ***");
    }

    public Author(long authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
