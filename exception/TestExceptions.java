package exception;

public class TestExceptions {
    public static void main(String[] args) {

        try {
            // Attempt to parse string to integer
            int num = Integer.parseInt("123");
            System.out.println("Parsed number: " + num);

            // Deliberate divide by zero
            num = num / 0;

        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number was entered.");
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide by 0.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Always executed");
        }

    }
}
