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
        setUsername(username);
        setPassword(password);
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
        if(username.length() < 5){
            throw new IllegalArgumentException("Username must be 5 or more symbols");
        }

        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be 8 or more symbols");
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (hasUpperCase && hasDigit) {
                this.password = password;
                return;
            }
        }
        throw new IllegalArgumentException("Password must contain at least one uppercase character and one digit.");
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
