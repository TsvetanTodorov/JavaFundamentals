package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
//
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String inputText) {
        String reversed = "";
        for (int i = inputText.length() - 1; i >= 0; i--) {
            String currentIndex = String.valueOf(inputText.charAt(i));
            reversed += currentIndex;
        }
        if (reversed.equals(inputText)) {
            return true;
        } else {
            return false;
        }
    }


}