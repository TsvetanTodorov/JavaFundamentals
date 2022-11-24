package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        StringBuilder wordResult = new StringBuilder();


        wordResult.append(firstChar).append(secondChar).append(thirdChar);
        System.out.println(wordResult);

    }
}
