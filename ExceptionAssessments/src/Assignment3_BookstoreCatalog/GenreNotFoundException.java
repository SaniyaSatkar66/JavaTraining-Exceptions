package Assignment3_BookstoreCatalog;

public class GenreNotFoundException extends Exception {
    public GenreNotFoundException(String genre) {
        super("Genre '" + genre + "' does not exist in catalog.");
    }
}
