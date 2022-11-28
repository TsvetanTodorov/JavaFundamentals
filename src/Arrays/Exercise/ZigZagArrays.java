package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[lines];
        String[] secondArray = new String[lines];

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            String firstNumber = input.split(" ")[0];
            String secondNumber = input.split(" ")[1];

            if ((i + 1) % 2 == 1) {
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumber;
            } else {
                firstArray[i] = secondNumber;
                secondArray[i] = firstNumber;
            }
        }

        for (String element : firstArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element : secondArray) {
            System.out.print(element + " ");
        }

    }
}

