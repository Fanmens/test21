package com.qf.ssm.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.ssm.mapper.BookMapper;
import com.qf.ssm.pojo.Book;
import com.qf.ssm.service.BookService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Hai 2019/1/4 19:00
 **/
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public Book findById(int id) {
        return bookMapper.findById(id);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public Map<String, Object> findByPage(int nowPage, int PageSize) {
        PageHelper.startPage(nowPage,PageSize);
        List<Book> list = bookMapper.findAll();
        PageInfo<Book> info = new PageInfo(list);
        //得到当前页的集合
        List<Book> books = info.getList();
        long totalPage = info.getPages();

        Map<String,Object> map = new HashMap<>();
        map.put("books",books);
        map.put("totalPage",totalPage);
        return map;
    }


}
