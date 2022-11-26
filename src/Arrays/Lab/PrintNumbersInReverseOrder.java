package Arrays.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int allNumbers = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listOfNumbers = new ArrayList<>();
        for (int i = 1; i <= allNumbers; i++) {

            String currentInput = scanner.nextLine();
            listOfNumbers.add(currentInput);
        }

        for (int j = listOfNumbers.size() - 1; j >= 0; j--) {
            String currentNumberAsString = listOfNumbers.get(j);
            System.out.print(currentNumberAsString + " ");
        }

//        String[] arrayOfNumbers = new String[allNumbers];
//
//        for (int i = 0; i < allNumbers; i++) {
//            String currentNumberAsString = scanner.nextLine();
//            arrayOfNumbers[i] = currentNumberAsString;
//        }
//
//        for (int j = arrayOfNumbers.length - 1; j >= 0; j--) {
//            String currentNumber = arrayOfNumbers[j];
//            System.out.print(currentNumber + " ");
//        }
    }
}
