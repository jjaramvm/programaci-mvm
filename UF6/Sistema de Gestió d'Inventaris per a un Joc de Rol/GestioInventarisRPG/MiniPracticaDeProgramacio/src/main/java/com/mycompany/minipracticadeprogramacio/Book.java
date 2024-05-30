package com.mycompany.minipracticadeprogramacio;

public class Book {
    private int id;
    private String title;
    private String author;
    private String editorial;
    private int stock;

    public Book(int id, String title, String author, String planeta, int par1) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.stock = stock;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
