package org.LibrarianGroup;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookManagerTests {

    BookManager manager = new BookManager();

    Book newTestBook1 = new Book(1, 1991, 2001, "Иван Петров", "Тестовая книга 1");
    Book newTestBook2 = new Book(1, 1992, 2002, "Иван Петров", "Тестовая книга 2");
    Book newTestBook3 = new Book(1, 1993, 2003, "Иван Петров", "Тестовая книга 3");
    Book newTestBook4 = new Book(1, 1994, 2004, "Иван Петров", "Тестовая книга 4");
    Book newTestBook5 = new Book(1, 1995, 2005, "Иван Петров", "Тестовая книга 5");
    Book newTestBook6 = new Book(1, 1996, 2006, "Иван Петров", "Тестовая книга 6");
    Book newTestBook7 = new Book(1, 1997, 2007, "Иван Петров", "Тестовая книга 7");


    @Test
    public void testGetOneBookFromFirst() { // Счётчик по умолчанию.
        manager.addNewBook(newTestBook1);

        Book[] exp = {newTestBook1};
        Book[] act = manager.getBooksList();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testGetOneBookFromEnd() {
        manager.addNewBook(newTestBook1);

        Book[] exp = {newTestBook1};
        Book[] act = manager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testGetTwoBookFromFirst() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);

        Book[] exp = {newTestBook1, newTestBook2};
        Book[] act = manager.getBooksList();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testGetTwoBookFromEnd() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);

        Book[] exp = {newTestBook2, newTestBook1};
        Book[] act = manager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testZeroBook() { // Счётчик по умолчанию.

        Book[] exp = {};
        Book[] act = manager.getBooksList();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testZeroBookBackWard() { // Счётчик по умолчанию.

        Book[] exp = {};
        Book[] act = manager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testShow5BooksFromFirst() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book[] exp = {newTestBook1, newTestBook2, newTestBook3, newTestBook4, newTestBook5};
        Book[] act = manager.getBooksList();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testShow5BooksFromEnd() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book[] exp = {newTestBook5, newTestBook4, newTestBook3, newTestBook2, newTestBook1};
        Book[] act = manager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testShow4BooksFromFirst() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);

        Book[] exp = {newTestBook1, newTestBook2, newTestBook3, newTestBook4 };
        Book[] act = manager.getBooksList();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void testShow4BooksFromEnd() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);


        Book[] exp = { newTestBook4, newTestBook3, newTestBook2, newTestBook1 };
        Book[] act = manager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);
    }


    @Test
    public void testGet7BooksFromFirst() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);

        Book[] exp = {newTestBook1, newTestBook2, newTestBook3, newTestBook4, newTestBook5, newTestBook6, newTestBook7};
        Book[] act = customCountManager.getBooksList();

        Assertions.assertArrayEquals(exp, act);

    }

    @Test
    public void testShow7BooksFromEnd() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);

        Book[] exp = {newTestBook7, newTestBook6, newTestBook5, newTestBook4, newTestBook3, newTestBook2, newTestBook1};
        Book[] act = customCountManager.getBooksBackWard();

        Assertions.assertArrayEquals(exp, act);

    }

    @Test
    public void testGetFirstBookBySequenceNumberStandardCount() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book exp = newTestBook1;
        Book act = manager.findBookBySequenceNumber( 1 );

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetFifthBookBySequenceNumberStandardCount() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book exp = newTestBook1;
        Book act = manager.findBookBySequenceNumber( 1 );

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetFirstBookBySequenceNumberStandardCountBackWard() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book exp = newTestBook1;
        Book act = manager.findBookBySequenceNumberBackWard(5);

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetFifthBookBySequenceNumberStandardCountBackWard() {
        manager.addNewBook(newTestBook1);
        manager.addNewBook(newTestBook2);
        manager.addNewBook(newTestBook3);
        manager.addNewBook(newTestBook4);
        manager.addNewBook(newTestBook5);

        Book exp = newTestBook5;
        Book act = manager.findBookBySequenceNumberBackWard(1);

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetFirstBookBySequenceNumberCustomCount() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);


        Book exp = newTestBook7;
        Book act = customCountManager.findBookBySequenceNumberBackWard(1);

        Assertions.assertEquals( exp, act );
    }

    @Test
    public void testGetLastBookBySequenceNumberCustomCount() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);


        Book exp = newTestBook7;
        Book act = customCountManager.findBookBySequenceNumberBackWard(1);

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetFirstBookBySequenceNumberCustomCountBackWard() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);


        Book exp = newTestBook1;
        Book act = customCountManager.findBookBySequenceNumberBackWard(7);

        Assertions.assertEquals( exp, act);
    }

    @Test
    public void testGetLastBookBySequenceNumberCustomCountBackWard() {

        BookManager customCountManager = new BookManager(7);

        customCountManager.addNewBook(newTestBook1);
        customCountManager.addNewBook(newTestBook2);
        customCountManager.addNewBook(newTestBook3);
        customCountManager.addNewBook(newTestBook4);
        customCountManager.addNewBook(newTestBook5);
        customCountManager.addNewBook(newTestBook6);
        customCountManager.addNewBook(newTestBook7);


        Book exp = newTestBook7;
        Book act = customCountManager.findBookBySequenceNumberBackWard(1);

        Assertions.assertEquals( exp, act);
    }



}