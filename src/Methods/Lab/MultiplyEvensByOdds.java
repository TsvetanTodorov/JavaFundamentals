package Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(num));

    }


    private static int getMultipleOfEvensAndOdds(int num) {
        int evensSum = getSumOfEvenDigits(num);
        int oddsSum = getSumOfOddDigits(num);

        return evensSum * oddsSum;
    }

    private static int getSumOfEvenDigits(int num) {

        String intToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int currentDigit = arr[i];
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
        }
        return sum;
    }

    private static int getSumOfOddDigits(int num) {
        String intToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int currentDigit = arr[i];
            if (currentDigit % 2 != 0) {
                sum += currentDigit;
            }
        }
        return sum;
    }


}
