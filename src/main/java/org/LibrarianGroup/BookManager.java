package org.LibrarianGroup;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookManager {

    private Book[] bookList = new Book[0];
    private int bookCountList = 5;

    public BookManager() {
    }

    public BookManager( int newBookCountList ) {
        this.bookCountList = newBookCountList;
    }

    public void addNewBook( Book newBook ) {
        Book[] tmpBookList = new Book[ bookList.length + 1];

        for ( int i = 0; i < bookList.length; i++ ) {
            tmpBookList[i] = bookList[i];
        }
        tmpBookList[tmpBookList.length - 1 ] = newBook;
        bookList = tmpBookList;
    }

    public Book[] getBooksList() {
        return bookList;
    }

    public Book[] getBooksBackWard() {
        Book[] bookListBackWard = new Book[bookList.length];

        for ( int i = 0; i < bookList.length; i++ ) {
            bookListBackWard[i] = bookList[bookList.length - 1 - i];
        }

        return  bookListBackWard;
    }

    public Book findBookBySequenceNumber( int sequenceNumber ) {
        if ( sequenceNumber < 1 ){
            return bookList[0];
        }
        if ( sequenceNumber > bookList.length ) {
            return bookList[bookList.length - 1];
        }
        return bookList[sequenceNumber - 1];
    }

    public Book findBookBySequenceNumberBackWard( int sequenceNumber ) {

        Book[] bookListBackWard = getBooksBackWard();

        if ( sequenceNumber < 1 ){
            System.out.println("Такой книги в хранилище нет. Вот максимально близкая по номеру." );
            return bookListBackWard[0];
        }
        if ( sequenceNumber > bookListBackWard.length ) {
            System.out.println("Такой книги в хранилище нет. Вот максимально близкая по номеру." );
            return bookListBackWard[bookListBackWard.length - 1];
        }
        return bookListBackWard[sequenceNumber - 1];
    }
}
