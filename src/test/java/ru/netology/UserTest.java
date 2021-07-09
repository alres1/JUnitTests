package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static long suiteStartTime;
    private long testStartTime;
    Author author;
    User user;
    Book book;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running UserTests");
        suiteStartTime = System.nanoTime();
    }
    @AfterAll
    public static void completeSuite() {
        System.out.println("UserTests complete: " + (System.nanoTime() - suiteStartTime));
    }
    @BeforeEach
    public void initTest() {
        System.out.println("Starting new nest");
        testStartTime = System.nanoTime();
        author = new Author("Федор", "Достоевский", 1821, "Россия");
        book = new Book("Преступление и наказание", author, 670, 1866, 250);
        user = new User("ivanov.alexandr@email.com", "Александр", "Иванов", book );
    }
    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @Test
    void testToString() {
        final String expected = user.toString();
        final String result = "- Александр Иванов, ivanov.alexandr@email.com. Сейчас читает книгу " +
                "\"Преступление и наказание\", автор: Федор Достоевский";
        Assertions.assertEquals(expected, result);
    }
}