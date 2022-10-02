package com.atguigu.service;

import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;

import java.util.List;

public interface BookService {
    public void addBook(Book book);

    //删除图书
    public void deleteBookByid(Integer id);

    //更新图书
    public void updateBook(Book book);

    //查询图书
    public Book queryBookById(Integer id);

    //查询全部图书
    public List<Book> queryBooks();

    Page page(int pageNo, int pageSize);

    Page pageByPrice(int pageNo, int pageSize, int min, int max);
}
