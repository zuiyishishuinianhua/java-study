package com.study.design.iterator.c1;

/**
 * @author chenyao
 * @date 2017/11/1 13:48
 */
public class Main {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        Book b1 = new Book("java 基础教程");
        Book b2 = new Book("java 中级教程");
        Book b3 = new Book("java 高级教程");
        bookShelf.addBook(b1);
        bookShelf.addBook(b2);
        bookShelf.addBook(b3);

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
