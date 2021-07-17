/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author denne
 */
public class BookDao {

    private static List<Book> books = new ArrayList<>();

    public static List<Book> getAllBooks() {
        return books;
    }

    //單筆查詢
    public static Book getBook(Integer id) {
        return books.stream().filter(b -> b.getId() == id)
                .findFirst()
                .get();
    }

    //新增
    public static Boolean createBook(Book book) {
        Boolean check = books.stream().filter(t -> t.getId() == book.getId())
                .findAny()
                .isPresent();
        if (check) {
            return false;
        }
        if (book.getId() != null) {
            books.add(book);
        }
        return true;
    }

    //修改
    public static Boolean updateBook(Integer id, Book book) {
        Book ExistBook = null;
        try {
            ExistBook = getBook(id);
        } catch (NoSuchElementException e) {
        }
        if (ExistBook == null) {
            return false;
        }
        ExistBook.setPrice(book.getPrice());
        ExistBook.setName(book.getName());
        return true;
    }

    public static Boolean deleteBook(Integer id) {

        Book ExistBook = null;
        try {
            ExistBook = getBook(id);
        } catch (NoSuchElementException e) {
        }
        if (ExistBook == null) {
            return false;
        }
        books.remove(ExistBook);
        return true;
    }

}
