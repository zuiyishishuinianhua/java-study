package com.study.design.iterator.c1;

/**
 * 书
 * @author chenyao
 * @date 2017/11/1 11:42
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
