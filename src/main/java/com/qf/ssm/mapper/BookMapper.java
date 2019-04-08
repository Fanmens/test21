package com.qf.ssm.mapper;

import com.qf.ssm.pojo.Book;

import java.util.List;

/**
 * @author Hai 2019/1/4 18:54
 **/
public interface BookMapper {
    //根据ID查询图书
    public Book findById(int id);
    //添加图书
    public void  insertBook(Book book);
    //更新图书
    public int  updateBook(Book book);
    //删除图书
    public  int deleteBook (int id);
    //查询所有图书信息
    public  List<Book> findAll();

}
