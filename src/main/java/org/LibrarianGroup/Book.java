package org.LibrarianGroup;

public class Book {

    private int id;
    private int publicationYear;
    private int circulation;
    private String authorName;
    private String nameBook;

    public Book() {

    }

    public Book(int id, int publicationYear, int circulation, String authorName, String nameBook) {
        this.id = id;
        this.publicationYear = publicationYear;
        this.circulation = circulation;
        this.authorName = authorName;
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
