package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = getFactorialOfNum(num1) / getFactorialOfNum(num2);

        System.out.printf("%.2f", result);

    }


    private static double getFactorialOfNum(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }


}
