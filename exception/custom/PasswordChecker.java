package exception.custom;

public class PasswordChecker {

    boolean check(String password) throws PasswordFormatException {
        if(password.length() < 6) {

            throw new PasswordFormatException("Invalid password");
            //throw new IllegalArgumentException("Minimum length should be 6"); //unchecked exception, because it is compiling even without try-catch or throws
        } else if (!password.matches(".*[A-Z].*")) {
            throw new PasswordFormatException("Invalid password");

        } else if (!password.matches(".*[0-9].*")) {
            throw new PasswordFormatException("Invalid password");
        } //throw when we generate a new exception
        //throws when  exception is it checked
        //PasswordFormatException is checked
        return true;
    }
    public static void main(String[] args) throws PasswordFormatException {
        String password = "aBcx123";
        PasswordChecker test = new PasswordChecker();
        System.out.println(test.check(password));


        //create account
        //create preferences

    }


}