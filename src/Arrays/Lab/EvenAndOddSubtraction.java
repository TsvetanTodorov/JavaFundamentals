package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int currentNumber : numbers) {
            if (isEven(currentNumber)) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }


    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
