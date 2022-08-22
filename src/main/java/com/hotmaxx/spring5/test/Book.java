package com.hotmaxx.spring5.test;

public class Book {
    private String name;
    private String author;
    private String time;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void add(){
        System.out.println("add...");
    }
    public void testBook(){
        System.out.println(name+author+time);
    }

}
