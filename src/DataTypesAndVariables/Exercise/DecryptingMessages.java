package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int linesQuantity = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linesQuantity; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            currentChar += key;
            System.out.print(currentChar);
        }
    }
}
