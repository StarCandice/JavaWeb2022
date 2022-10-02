package com.atguigu.dao.impl;

import com.atguigu.dao.BookDao;
import com.atguigu.pojo.Book;

import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public int addBook(Book book) {
        String sql = "insert into t_book(`id` , `name` , `author` , `price` , `sales` , `stock` , `img_path`)" +
                "values(null , ? , ? , ?, ? , ? , ?)";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath());
    }

    @Override
    public int deleteBookByid(Integer id) {
        String sql = "delete from t_book where id=?";
        return update(sql, id);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update t_book set `name`=? , `author`=? , `price`=? , `sales`=? , `stock`=? , `img_path`=? where id=?";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath(), book.getId());
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book where id=?";
        return queryForOne(Book.class, sql, id);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book ";
        return queryForList(Book.class, sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_book";
        Number number = (Number) queryForSingleValue(sql);
        return number.intValue();
    }

    @Override
    public Integer queryForPageTotalCount(int min, int max) {
        String sql = "select count(*) from t_book where price between ? and ?";
        Number number = (Number) queryForSingleValue(sql, min, max);
        return number.intValue();
    }


    @Override
    public List<Book> queryForItems(int begin, int pageSize) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book limit ?,?";
        return queryForList(Book.class, sql, begin, pageSize);
    }

    @Override
    public List<Book> queryForItems(int begin, int pageSize, int min, int max) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book where price between ? and ? limit ?,?";
        return queryForList(Book.class, sql, min, max, begin, pageSize);
    }

}
