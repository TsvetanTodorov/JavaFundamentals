package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] valuesArr = inputLine.split(" ");
        int[] numArr = new int[valuesArr.length];
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(valuesArr[i]);
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
        System.out.println(sum);


    }
}
