package com.hotmaxx.spring5.service;

import lombok.Data;

import static cn.hutool.poi.excel.sax.AttributeName.r;

@Data
public class Book {
    private String name="art of life";
    private String author="wan";

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void add() {
        System.out.println("add...");
    }

    public void testBook() {
        System.out.println(name +"\t"+ author);
    }


}
