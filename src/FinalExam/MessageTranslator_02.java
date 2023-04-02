package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());


        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String text = scanner.nextLine();

            String regex = "!(?<first>[A-Z][a-z]{3,})!:\\[(?<second>[A-za-z]{8,})\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String command = matcher.group("first");
                String textToTranslate = matcher.group("second");

                for (int j = 0; j < textToTranslate.length(); j++) {
                    char currentChar = textToTranslate.charAt(j);
                    numbersList.add((int) currentChar);
                }
                System.out.print(command + ": ");
                for (Integer integer : numbersList) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }

        }


    }
}
