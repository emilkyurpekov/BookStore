package Book;

public class Book implements IBook {
    private String title;
    private String author;
    private int pages;
    private String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.setPages(pages);
        this.genre = genre;
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
        return this.genre;
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
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
