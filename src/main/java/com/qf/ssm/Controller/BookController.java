package com.qf.ssm.Controller;
import java.util.Date;
import java.util.Map;

import com.qf.ssm.pojo.Book;
import com.qf.ssm.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;


/**
 * @author Hai 2019/1/4 19:04
 **/
@Controller
public class BookController {
    //注入service
    @Resource
    private BookService bookService;

    @RequestMapping("/findById")
    @ResponseBody
    public Book findById(int id) {
        return bookService.findById(id);
    }
    @RequestMapping("/save")
    @ResponseBody
    public Book  save(){
        Book book = new Book();

        book.setTitle("老王和我的风花雪月");
        book.setAuthor("婷姐");
        book.setPrice(100);
        book.setPublishdate(new Date());
        bookService.insertBook(book);
        return book;
    }
    @RequestMapping("/update")
    @ResponseBody
    public String   update(){
        Book book = new Book();

        book.setTitle("表妹今晚你别走");
        book.setAuthor("婷姐");
        book.setPrice(100);
        book.setPublishdate(new Date());
        book.setId(75);
        int i= bookService.updateBook(book);
        if(i>0){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String  delete(){
        int  i  =bookService.deleteBook(8);
        if(i>0){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping("/findByPage")
    @ResponseBody
    public Map<String,Object> find(@RequestParam(defaultValue = "1")int nowPage, int PageSize){
       return bookService.findByPage(nowPage,PageSize);
    }

}

