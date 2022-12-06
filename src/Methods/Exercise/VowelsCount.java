package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        System.out.println(getVowelsCount(inputText));

    }

    private static int getVowelsCount(String inputText) {

        int counter = 0;
        char[] arr = inputText.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if (currentChar == 'a' || currentChar == 'A' || currentChar == 'e' || currentChar == 'E' ||
                    currentChar == 'o' || currentChar == 'O' || currentChar == 'i' || currentChar == 'I' ||
                    currentChar == 'u' || currentChar == 'U') {
                counter++;
            }
        }
        return counter;
    }
}
