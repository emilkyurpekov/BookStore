package Book;

import java.util.ArrayList;
import java.util.List;

public class Book implements IBook {
    private String title;
    private String author;
    private int pages;
    private List<String> genres;

    public Book(String title, String author, int pages, List<String> genres) {
        this.title = title;
        this.author = author;
        this.setPages(pages);
        this.genres = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return this.title;
    }
    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getPages() {
        return this.pages;
    }

    @Override
    public String getGenre() {
        List<String> toReadBookTitles = getBookGenres(this.genres);
        return toReadBookTitles.toString();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        if(pages < 70) {
            throw new IllegalArgumentException("Book is too short to be added in a collection");
        }
        this.pages = pages;
    }


    public void setGenre(String genre) {
        this.genres.add(genre);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", genre='" + genres + '\'' +
                '}';
    }
    public List<String> getBookGenres(List<String> genresList) {
        List<String> bookGenres= new ArrayList<>();

        for (String genre : genresList) {
            bookGenres.add(genre);
        }

        return bookGenres;
    }

}
