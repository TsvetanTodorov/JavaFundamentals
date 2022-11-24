package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder data = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char symbol = scanner.nextLine().charAt(0);

            data.append(symbol);
        }

        for (int i = data.length() - 1; i >= 0; i--) {
            System.out.print(data.charAt(i) + " ");
        }


    }
}
