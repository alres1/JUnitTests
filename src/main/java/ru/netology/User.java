package ru.netology;

public class User {
    public String email;
    public String name;
    public String surname;
    public Book book;
    public static int totalOnline = 0;

    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        totalOnline++;
    }

    public String toString() {
        return "- " + name + " " + surname + ", " + email + ". Сейчас читает книгу \"" + book.name + "\", автор: "
                + book.author.name + " " + book.author.surname;
    }
}
