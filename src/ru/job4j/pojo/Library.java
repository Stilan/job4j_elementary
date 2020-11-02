package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Winnie-the-Pooh",120);
        Book book2 = new Book("Jeeves and Wooster stories ",620);
        Book book3 = new Book("Harry Potter and the Philosopher's Stone ",420);
        Book book4 = new Book("Clean code",320);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getNameBook() + " " + bk.getPages());
        }
        System.out.println("_______________");
        Book book = books[3];
        books[3] = books[0];
        books[0] = book;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getNameBook() + " " + bk.getPages());
        }
        System.out.println("_______________");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getNameBook())) {
                System.out.println(book.getNameBook() + " " + book.getPages());
            }
        }
    }
}
