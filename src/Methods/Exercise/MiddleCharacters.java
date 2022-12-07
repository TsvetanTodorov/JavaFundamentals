package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters(String text) {
        if (text.length() % 2 == 1) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            int indexFirstMiddleChar = text.length() / 2 - 1;
            int indexSecondMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddleChar) + "" + text.charAt(indexSecondMiddleChar));
        }
    }


}
