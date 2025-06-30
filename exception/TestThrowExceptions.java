package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrowExceptions {

    int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("some-file");
    }

    public static void main(String[] args) throws FileNotFoundException {
        TestThrowExceptions testThrowsException = new TestThrowExceptions();
        testThrowsException.divide(10, 0);
        testThrowsException.readFile();
    }
}