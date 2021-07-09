package ru.netology;

public class Book {

    public String name;
    public Author author;
    public int pages;
    public int published;
    public int price;
    public static int countBooks = 0;
    public static int totalPrice = 0;

    public Book(String name, Author author, int pages, int published, int price) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.published = published;
        this.price = price;
        countBooks++;
        totalPrice = totalPrice + this.price;
    }

    public boolean isManyPages(){
        return pages > 1000;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author.name + " " + author.surname + '\'' +
                ", pages=" + pages +
                ", published=" + published +
                ", price=" + price +
                '}';
    }

}
