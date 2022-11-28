package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i <= secondArr.length - 1; i++) {
            String currentElementSecondArr = secondArr[i];

            for (int j = 0; j <= firstArr.length - 1; j++) {
                String currentElementFirstArr = firstArr[j];

                if (currentElementSecondArr.equals(currentElementFirstArr)) {
                    System.out.print(currentElementSecondArr + " ");
                }

            }
        }
    }
}
