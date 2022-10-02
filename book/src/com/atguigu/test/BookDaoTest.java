package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null, "wzc", "wzc", new BigDecimal(100), 100, 100, null));
    }

    @Test
    public void deleteBookByid() {
        bookDao.deleteBookByid(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21, "WWWW", "WWWW", new BigDecimal(1000), 1000, 1000, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
        List<Book> books = bookDao.queryBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}