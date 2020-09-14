package BOOKTEST;

public class BookTest {
    public static void main (String [] args) {
        Book d1 = new Book ("Sujet", 228);
        Book d2 = new Book ("Stil'",1337);
        Book d3 = new Book ("Populyarnost'");
        d3.setPages(8008);
        System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}