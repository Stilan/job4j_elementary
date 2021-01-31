package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int pages;

    public Book(String nameBook, int pages) {
        this.nameBook = nameBook;
        this.pages = pages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
