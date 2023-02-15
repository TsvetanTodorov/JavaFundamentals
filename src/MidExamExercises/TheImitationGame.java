package MidExamExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String encryptedText = scanner.nextLine();
        List<String> list = Arrays
                .stream(encryptedText.split(""))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] commandArr = input.split("\\|");

            switch (commandArr[0]) {
                case "Move":
                    int lettersToMove = Integer.parseInt(commandArr[1]);

                    for (int i = 0; i < lettersToMove; i++) {
                        String currentLetter = list.get(0);
                        list.remove(currentLetter);
                        list.add(currentLetter);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[1]);
                    String value = commandArr[2];
                    if (index > list.size()) {
                        int lastIndex = list.size();
                        list.add(lastIndex, value);
                    } else {
                        list.add(index, value);
                    }

                    break;
                case "ChangeAll":
                    String substring = commandArr[1];
                    String replacement = commandArr[2];
                    Collections.replaceAll(list, substring, replacement);
                    break;
            }
            input = scanner.nextLine();
        }

        StringBuilder decryptedMessage = new StringBuilder();

        for (String letter : list) {
            decryptedMessage.append(letter);
        }

        System.out.println("The decrypted message is: " + decryptedMessage);
    }
}

