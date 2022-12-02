package Methods.Lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String sign = getIntegerSign(number);

        if (sign.equals("negative")) {
            System.out.printf("The number %d is negative.", number);
        } else if (sign.equals("zero")) {
            System.out.printf("The number %d is zero.", number);
        } else {
            System.out.printf("The number %d is positive.", number);
        }
    }

    private static String getIntegerSign(int num) {

        if (num < 0) {
            return "negative";
        } else if (num == 0) {
            return "zero";
        } else {
            return "positive";
        }
    }
}
