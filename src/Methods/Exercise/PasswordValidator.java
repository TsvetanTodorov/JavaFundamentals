package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isPasswordLengthValid = isValidLength(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordContentValid = isValidContent(password);
        if (!isPasswordContentValid){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isPasswordDigitsCountValid = isValidCountDigits(password);
        if(!isPasswordDigitsCountValid){
            System.out.println("Password must have at least 2 digits");
        }

        if(isPasswordLengthValid && isPasswordContentValid && isPasswordDigitsCountValid){
            System.out.println("Password is valid");
        }


    }

    private static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}