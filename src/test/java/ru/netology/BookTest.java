package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private static long suiteStartTime;
    private long testStartTime;
    Author author;
    User user;
    Book book;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running BookTests");
        suiteStartTime = System.nanoTime();
    }
    @AfterAll
    public static void completeSuite() {
        System.out.println("BookTests complete: " + (System.nanoTime() - suiteStartTime));
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
    void testIsManyPages() {
        final Boolean expected = book.isManyPages();
        final Boolean result = false;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testToString() {
        final String expected = book.toString();
        final String result = "Book{name='Преступление и наказание', author='Федор Достоевский', pages=670, published=1866, price=250}";
        Assertions.assertEquals(expected, result);
    }
}
