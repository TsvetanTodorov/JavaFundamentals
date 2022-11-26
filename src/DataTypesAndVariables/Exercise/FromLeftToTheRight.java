package DataTypesAndVariables.Exercise;


import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String currentInput = scanner.nextLine();
            String[] arrayString = currentInput.split(" ");
            String firstNumberAsString = arrayString[0];
            String secondNumberAsString = arrayString[1];
            long firstNumberAsLong = Long.parseLong(firstNumberAsString);
            long secondNumberAsLong = Long.parseLong(secondNumberAsString);
            int sum;

            if (isBiggerThan(firstNumberAsLong, secondNumberAsLong)) {
                sum = calculateSum(firstNumberAsString);
            } else {
                sum = calculateSum(secondNumberAsString);
            }
            System.out.println(sum);
        }

    }

    private static boolean isBiggerThan(long firstNum, long secondNum) {
        return firstNum > secondNum;
    }

    private static boolean areEquals(String currentNumber) {
        String character = "-";
        return currentNumber.equals(character);
    }

    private static int calculateSum(String numberAsString) {
        String[] firstNumberAsArray = numberAsString.split("");
        int sum = 0;
        for (String currentNumber : firstNumberAsArray) {
            if (areEquals(currentNumber)) {
                continue;
            }
            long currentNumberAsInteger = Long.parseLong(currentNumber);
            sum += currentNumberAsInteger;
        }
        return sum;
    }


}
