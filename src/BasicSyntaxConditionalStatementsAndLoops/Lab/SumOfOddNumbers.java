package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOddNumbersToPrint = Integer.parseInt(scanner.nextLine());

        int printedCount = 0;
        int number = 0;
        int sumNumbers = 0;

        while (printedCount < countOddNumbersToPrint) {
            number++;
            if (number % 2 != 0) {
                System.out.println(number);
                printedCount++;
                sumNumbers += number;
            }
        }
        System.out.printf("Sum: %d", sumNumbers);


    }
}

