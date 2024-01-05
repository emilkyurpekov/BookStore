package User;

import Book.Book;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser {
    private String username;
    private String password;
    private List<Book> Read;
    private List<Book> toRead;
    private List<Book> reading;
    public User(String username, String password, List<Book> read, List<Book> toRead, List<Book> reading) {
        this.username = username;
        this.password = password;
        this.Read = new ArrayList<>();
        this.toRead = new ArrayList<>();
        this.reading = new ArrayList<>();
    }



    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getListRead() {
       List<String> readBookTitles = getBookTitles(this.Read);
       return  readBookTitles.toString();
    }

    @Override
    public String getListToRead() {
        List<String> toReadBookTitles = getBookTitles(this.toRead);
        return toReadBookTitles.toString();
    }

    @Override
    public String getListReading() {
       List<String> readingBookTitles = getBookTitles(this.reading);
       return readingBookTitles.toString();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(password.length()<8){
            throw new IllegalArgumentException("Password must be 8 or more symbols");
        }
        //if(!(password.contains("")))
    }

    public void setRead(Book book) {
        this.Read.add(book);
    }

    public void setToRead(Book book) {
        this.toRead.add(book);
    }

    public void setReading(Book book) {
        this.reading.add(book);
    }
    public List<String> getBookTitles(List<Book> bookList) {
        List<String> bookTitles = new ArrayList<>();

        for (Book book : bookList) {
            bookTitles.add(book.getTitle());
        }

        return bookTitles;
    }

}