package Methods.Lab;

import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.00f", calculate(firstNumber, operator, secondNumber));


    }

    private static double calculate(int firstNumber, String operator, int secondNumber) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = (double) firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
