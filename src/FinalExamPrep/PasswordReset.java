package FinalExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String copyText = "";
        String rawCommands = scanner.nextLine();
        while (!rawCommands.equals("Done")) {
            String[] commands = rawCommands.split(" ");
            if (commands[0].equals("TakeOdd")) {

                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 != 0) {
                        copyText += input.charAt(i);
                    }
                }
                input = copyText;
                copyText = "";
                System.out.println(input);
            } else if (commands[0].equals("Cut")) {
                int index = Integer.parseInt(commands[1]);
                int length = Integer.parseInt(commands[2]) + index;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    if (!(i >= index && i < length)) {
                        sb.append(input.charAt(i));
                    }
                }
                input = sb.toString();
                sb = new StringBuilder();
                System.out.println(input);

            } else if (commands[0].equals("Substitute")) {
                String toReplace = commands[1];
                String replacement = commands[2];
                if (input.contains(toReplace)) {
                    input = input.replace(toReplace, replacement);
                    System.out.println(input);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            rawCommands = scanner.nextLine();
        }
        System.out.println("Your password is: " + input);
    }
}
