package ObjectsAndClasses.Lab;


import java.util.Random;
import java.util.Scanner;


public class RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] wordsArr = input.split("\\s+");

        Random randomGenerator = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int x = randomGenerator.nextInt(wordsArr.length);
            int y = randomGenerator.nextInt(wordsArr.length);

            String previousWord = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = previousWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));


    }
}
