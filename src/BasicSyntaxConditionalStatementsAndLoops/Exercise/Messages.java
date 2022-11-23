package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder wordResult = new StringBuilder();
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);

        for (int i = 0; i < count; i++) {
            input = scanner.nextLine();
            int inputLength = input.length();
            int mainDigit = getMainDigit(input);
            if (areEqual(mainDigit, 0)) {
                wordResult.append(" ");
                continue;
            }
            int offset = calculateOffset(mainDigit);
            if (areEqual(mainDigit, 8) || areEqual(mainDigit, 9)) {
                offset++;
            }

            int index = calculateIndex(offset, inputLength);
            char character = (char) index;
            wordResult.append(character);

        }


        System.out.println(wordResult);
    }

    private static boolean areEqual(int num1, int num2) {
        return num1 == num2;
    }

    private static int calculateOffset(int num) {
        return (num - 2) * 3;
    }

    private static int calculateIndex(int offset, int inputLength) {
        return offset + inputLength - 1 + 97;
    }

    private static int getMainDigit(String input) {
        return Integer.parseInt(Character.toString(input.charAt(0)));
    }

}
