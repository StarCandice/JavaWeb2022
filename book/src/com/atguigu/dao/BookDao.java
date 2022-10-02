package com.atguigu.dao;


import com.atguigu.pojo.Book;

import java.util.List;

public interface BookDao {
    //添加图书
    public int addBook(Book book);

    //删除图书
    public int deleteBookByid(Integer id);

    //更新图书
    public int updateBook(Book book);

    //查询图书
    public Book queryBookById(Integer id);

    //查询全部图书
    public List<Book> queryBooks();

    Integer queryForPageTotalCount();


    Integer queryForPageTotalCount(int min, int max);

    List<Book> queryForItems(int begin, int pageSize);

    List<Book> queryForItems(int begin, int pageSize, int min, int max);
}
