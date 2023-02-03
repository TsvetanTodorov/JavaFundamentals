package TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String decryptedText = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : decryptedText.toCharArray()) {
            char encryptedSymbol = (char) (symbol + 3);
            encryptedText.append(encryptedSymbol);
        }

        System.out.println(encryptedText);
    }
}
