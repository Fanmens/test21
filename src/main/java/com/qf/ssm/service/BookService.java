package com.qf.ssm.service;

import com.qf.ssm.pojo.Book;
import java.util.Map;

/**
 * @author Hai 2019/1/4 18:59
 **/
public interface BookService {
    public  Book findById(int id);
    public  void insertBook(Book book);
    public  int updateBook(Book book);
    public  int deleteBook(int id);
    public Map<String,Object> findByPage(int nowPage,int PageSize);
}
