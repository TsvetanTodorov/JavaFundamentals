package FinalExam;

import java.util.Scanner;

public class DecryptingCommands_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);

        while (!text.equals("Finish")) {

            if (text.contains("Replace")) {
                String currentChar = text.split(" ")[1];
                String newChar = text.split(" ")[2];

                if (builder.toString().contains(currentChar)) {
                    String currentText = builder.toString().replace(currentChar, newChar);
                    builder = new StringBuilder(currentText);
                }
                System.out.println(builder);


            } else if (text.contains("Cut")) {
                int startIndex = Integer.parseInt(text.split(" ")[1]);
                int endIndex = Integer.parseInt(text.split(" ")[2]);

                if (isValid(startIndex, builder) && isValid(endIndex, builder)) {
                    builder.delete(startIndex, endIndex + 1);
                    System.out.println(builder);
                } else {
                    System.out.println("Invalid indices!");
                }

            } else if (text.contains("Make")) {
                String command = text.split(" ")[1];
                if (command.equals("Upper")) {
                    for (int i = 0; i < builder.length(); i++) {
                        if (Character.isLowerCase(builder.charAt(i))) {
                            builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
                        }
                    }
                } else if (command.equals("Lower")) {
                    for (int i = 0; i < builder.length(); i++) {
                        if (Character.isUpperCase(builder.charAt(i))) {
                            builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
                        }
                    }
                }
                System.out.println(builder);

            } else if (text.contains("Check")) {
                String input = text.split(" ")[1];

                if (builder.toString().contains(input)) {
                    System.out.println("Message contains " + input);
                } else {
                    System.out.println("Message doesn't contain " + input);
                }

            } else if (text.contains("Sum")) {
                int startIndex = Integer.parseInt(text.split(" ")[1]);
                int endIndex = Integer.parseInt(text.split(" ")[2]);

                if (!isValid(startIndex, builder) || !isValid(endIndex, builder)) {
                    System.out.println("Invalid indices!");
                } else {
                    int totalSum = 0;
                    StringBuilder newText = new StringBuilder();
                    for (int i = startIndex; i < builder.length(); i++) {
                        if (i > endIndex) {
                            break;
                        }
                        char currentChar = builder.charAt(i);
                        totalSum += currentChar;
                    }
                    System.out.println(totalSum);
                }

            }

            text = scanner.nextLine();
        }
    }

    public static boolean isValid(int index, StringBuilder builder) {

        return index >= 0 && index <= builder.length() - 1;
    }
}
