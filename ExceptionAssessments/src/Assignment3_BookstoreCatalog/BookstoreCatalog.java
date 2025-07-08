package Assignment3_BookstoreCatalog;

import java.util.*;

public class BookstoreCatalog {
    private static Map<String, Set<String>> catalog = new TreeMap<>();

    public static void addGenre(String genre) {
        catalog.putIfAbsent(genre, new TreeSet<>());
        System.out.println("Genre added: " + genre);
    }

    public static void addBook(String genre, String book) throws GenreNotFoundException {
        if (!catalog.containsKey(genre)) throw new GenreNotFoundException(genre);
        catalog.get(genre).add(book);
        System.out.println("Book added: " + book + " under " + genre);
    }

    public static void listBooks(String genre) throws GenreNotFoundException {
        if (!catalog.containsKey(genre)) throw new GenreNotFoundException(genre);
        System.out.println("Books in " + genre + ": " + catalog.get(genre));
    }

    public static void removeBook(String genre, String book) throws GenreNotFoundException {
        if (!catalog.containsKey(genre)) throw new GenreNotFoundException(genre);
        catalog.get(genre).remove(book);
        System.out.println("Book removed: " + book + " from " + genre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addGenre("Fiction");
        addGenre("Fantasy");

        try {
            addBook("Fiction", "To Kill a Mockingbird");
            addBook("Fantasy", "Harry Potter");
            listBooks("Fiction");

            // Trigger exception
            listBooks("Science");

        } catch (GenreNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
