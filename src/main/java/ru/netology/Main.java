package ru.netology;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Федор", "Достоевский", 1821, "Россия");
        Author author2 = new Author("Александр", "Дюма", 1802, "Франция");

        Book book1 = new Book("Преступление и наказание", author1, 670, 1866, 250);
        Book book2 = new Book("Идиот", author1, 640, 1869, 180);
        Book book3 = new Book("Граф Монте-Кристо", author2, 1264, 1845, 2000);

        System.out.println(book1);
        //System.out.println(book2.isManyPages());
        //System.out.println("Всего книг: "+Book.countBooks);
        //System.out.println("На сумму: "+Book.totalPrice+" руб.");

        User user1 = new User("ivanov.alexandr@email.com", "Александр", "Иванов", book1 );
        User user2 = new User("petrov.ivan@email.com", "Иван", "Петров", book3 );
        User user3 = new User("sidorov.petr@email.com", "Петр", "Сидоров", book2 );

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("Пользователей онлайн: " + User.totalOnline);
    }
}