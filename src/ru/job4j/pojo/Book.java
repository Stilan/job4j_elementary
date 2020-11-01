package ru.job4j.pojo;

public class Book {
    private String NameBook;
    private int pages;

    public Book(String nameBook, int pages) {
        NameBook = nameBook;
        this.pages = pages;
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
