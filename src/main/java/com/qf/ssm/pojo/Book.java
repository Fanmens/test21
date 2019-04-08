package com.qf.ssm.pojo;

import java.util.Date;

/**
 * @author Hai 2019/1/4 18:52
 **/
public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private Date publishdate;

    public Book() {
    }

    public Book(int id, String title, String author, double price, Date publishdate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishdate = publishdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishdate=" + publishdate +
                '}';
    }
}
