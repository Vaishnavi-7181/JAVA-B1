class Construtor {
    String title;
    String author;

    // Constructor with parameters
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        b1.display();
        b2.display();
    }
}
