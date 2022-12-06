package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        printString(inputString, count);


    }

    private static void printString(String inputString, int count) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            result.append(inputString);
        }
        System.out.println(result);
    }
}
