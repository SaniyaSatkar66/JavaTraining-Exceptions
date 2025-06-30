package exception.custom;

// Custom Exception
class PasswordFormatException extends Exception {
    public PasswordFormatException(String message) {
        super(message);
    }
}
