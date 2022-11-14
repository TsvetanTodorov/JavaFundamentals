package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (isMoreOrEqualsThree(grade)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }

    private static boolean isMoreOrEqualsThree(double num) {
        return num >= 3;
    }
}
