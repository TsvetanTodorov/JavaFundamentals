package Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
        }
    }


    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }
}
