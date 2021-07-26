/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.rest.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author denne
 */
public class BookDao {

    //資料庫連線物件
    private static Connection connection;

    static {
        try {
            //資料庫驅動物件
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/javaweb";
            String user = "app";
            String password = "app";
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
    }

    //BookStaticView
    public static List<BookStaticView> getBookStaticViews() {
        List<BookStaticView> list = new ArrayList<>();
        String sql = "select bookname, amount, subtotal, avgprice from bookstatview";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);) {
            System.out.println(resultSet.next());
            while (resultSet.next()) {
                BookStaticView bookStaticView = new BookStaticView();
                bookStaticView.setName(resultSet.getString("bookname"));
                bookStaticView.setAmount(resultSet.getInt("amount"));
                bookStaticView.setSubtotal(resultSet.getInt("subtotal"));
                bookStaticView.setAveragePrice(resultSet.getInt("avgprice"));
                list.add(bookStaticView);
            }
        } catch (Exception e) {
        }
        return list;
    }

    private static List<Book> books = new ArrayList<>();

    public static List<Book> getAllBooks() {
        books.clear();
        String sql = "select id, bookname, price, amount from book";
        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);) {
            //所抓到的每一筆紀錄都要注入book物件
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("bookname"));
                book.setPrice(resultSet.getInt("price"));
                book.setAmount(resultSet.getInt("amount"));
                books.add(book);
            }
        } catch (Exception e) {
        }
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
            String sql = "insert into book(bookname, price, amount) values (?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1, book.getName());
                pstmt.setInt(2, book.getPrice());
                pstmt.setInt(3, book.getAmount());
                int rowExecuteUpdate = pstmt.executeUpdate();
                return rowExecuteUpdate == 1 ? true : false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
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
        //將book的資料更新至資料表當中
        String sql = "Update Book Set bookname=?, price=?, amount=? where id=?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, book.getName());
            pstmt.setInt(2, book.getPrice());
            pstmt.setInt(3, book.getAmount());
            pstmt.setInt(4, id);
            int rowExecuteCount = pstmt.executeUpdate();
            return rowExecuteCount == 1 ? true : false;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
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
        String sql = "delete from Book where id=?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowExecuteCount = pstmt.executeUpdate();
            return rowExecuteCount == 1 ? true : false;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

}
