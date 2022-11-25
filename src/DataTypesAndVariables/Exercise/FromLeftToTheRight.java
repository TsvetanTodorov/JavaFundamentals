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
            long firstNumberAsInteger = Long.parseLong(firstNumberAsString);
            long secondNumberAsInteger = Long.parseLong(secondNumberAsString);
            int sum = 0;

            if (firstNumberAsInteger > secondNumberAsInteger) {
                String[] firstNumberAsArray = firstNumberAsString.split("");
                for (String currentNumber : firstNumberAsArray) {
                    if (currentNumber.equals("-")) {
                        continue;
                    }
                    long currentNumberAsInteger = Long.parseLong(currentNumber);
                    sum += currentNumberAsInteger;
                }
            } else {
                String[] secondNumberAsArray = secondNumberAsString.split("");
                for (String currentNumber : secondNumberAsArray) {
                    if (currentNumber.equals("-")) {
                        continue;
                    }
                    long currentNumberAsInteger = Long.parseLong(currentNumber);
                    sum += currentNumberAsInteger;

                }
            }
            System.out.println(sum);
        }
    }
}
