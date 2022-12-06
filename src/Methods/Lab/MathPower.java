package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = getPowNumber(firstNumber, secondNumber);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double getPowNumber(double firstNumber, int secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}
