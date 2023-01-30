package TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : bannedWords) {
            if (text.contains(banWord)) {
                String replacementWord = repeatString("*", banWord.length());
                text = text.replace(banWord, replacementWord);
            }
        }

        System.out.println(text);
    }


    public static String repeatString(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }
}
