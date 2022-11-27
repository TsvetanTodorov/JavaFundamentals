package Arrays.Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String currentElement = inputArr[i];

            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = currentElement;
        }
        System.out.print(String.join(" ", inputArr));
    }
}
