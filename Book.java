package prakbook;

public class Book {
    private String genre;
    private int pages;

    public Book(String g, int p) {
        this.genre = g;
        this.pages = p;
    }

    public Book(String n) {
        this.genre = n;
        this.pages = 0;
    }

    public Book() {
        this.genre = "Chapaev i Pustota";
        this.pages = 0;
    }

    public void setPages(int page) {
        this.pages = page;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre(String genre) {
        return genre;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.pages + ", age " + this.genre;
    }

    public void Out() {
        System.out.println(this.genre + " genre, pages " + this.pages);
    }
}