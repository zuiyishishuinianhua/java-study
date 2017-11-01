package com.study.design.iterator.c1;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 * @author chenyao
 * @date 2017/11/1 11:42
 */
public class BookShelf implements Iterable<Book> {

    private List<Book> books = new ArrayList<>();
    public BookShelf() {}

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book get(int i) {
        if(i >= books.size()) {
            throw new IndexOutOfBoundsException("index out bounds");
        }
        return books.get(i);
    }


    private class BookShelfIterator implements Iterator<Book> {
        int cursor = 0;
        @Override
        public boolean hasNext() {
            return cursor < books.size();
        }

        @Override
        public Book next() {
            Book book = books.get(cursor);
            cursor++;
            return book;
        }
    }



}
