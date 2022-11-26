package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BalancedBrackets {

    private static final String UNBALANCED_MESSAGE = "UNBALANCED";
    private static final String BALANCED_MESSAGE = "BALANCED";
    private static final String OPENING_BRACKET = "(";
    private static final String CLOSING_BRACKET = ")";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesQuantity = Integer.parseInt(scanner.nextLine());

        int followingBrackets = 0;
        String lastInput = "";

        for (int i = 1; i <= linesQuantity; i++) {
            String currentInput = scanner.nextLine();
            if (lastInput.equals(currentInput)) {
                System.out.println(UNBALANCED_MESSAGE);
                return;
            }
            if (isClosingBracket(currentInput)) {
                lastInput = currentInput;
                followingBrackets--;
            } else if (isOpeningBracket(currentInput)) {
                lastInput = currentInput;
                followingBrackets++;
            }
        }
        if (isEqualsZero(followingBrackets)) {
            System.out.println(BALANCED_MESSAGE);
        } else {
            System.out.println(UNBALANCED_MESSAGE);
        }
    }

    private static boolean isEqualsZero(int followingBrackets) {
        return followingBrackets == 0;
    }

    private static boolean isClosingBracket(String currentInput) {
        return currentInput.equals(CLOSING_BRACKET);
    }

    private static boolean isOpeningBracket(String currentInput) {
        return currentInput.equals(OPENING_BRACKET);
    }
}
