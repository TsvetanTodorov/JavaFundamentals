package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenNumber = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];

            for (int i = index + 1; i < numbers.length; i++) {
                int result = currentNumber + numbers[i];
                if (result == givenNumber) {
                    System.out.println(currentNumber + " " + numbers[i]);
                }
            }
        }
    }
}
