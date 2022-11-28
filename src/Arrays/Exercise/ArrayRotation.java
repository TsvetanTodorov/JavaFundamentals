package Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation; rotation++) {

            String firstElement = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firstElement;
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
