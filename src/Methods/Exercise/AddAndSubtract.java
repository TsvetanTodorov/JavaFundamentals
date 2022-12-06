package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = getSumOfFirstAndSecondNumber(firstNumber, secondNumber);
        int result = sum - thirdNumber;
        System.out.println(result);


    }

    private static int getSumOfFirstAndSecondNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


}
