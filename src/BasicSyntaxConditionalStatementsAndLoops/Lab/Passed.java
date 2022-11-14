package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (isMoreOrEqualsThree(grade)) {
            System.out.println("Passed!");
        }
    }

    private static boolean isMoreOrEqualsThree(double num) {
        return num >= 3;
    }
}
