package Arrays.Exercise;

import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int multipleVowel;
        int totalMultipleSum = 0;
        int divideConsonant;
        int totalDivideSum = 0;
        List<Integer> listOfResult = new ArrayList<>();

        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            char[] array = input.toCharArray();

            for (int j = 0; j <= array.length - 1; j++) {
                char currentChar = array[j];

                if (isVowel(currentChar)) {
                    multipleVowel = currentChar * array.length;
                    totalMultipleSum += multipleVowel;
                } else {
                    divideConsonant = currentChar / array.length;
                    totalDivideSum += divideConsonant;
                }
                totalSum = totalMultipleSum + totalDivideSum;
            }
            listOfResult.add(totalSum);
            totalMultipleSum = 0;
            totalDivideSum = 0;
            totalSum = 0;

        }

        Collections.sort(listOfResult);
        for (int currentNum : listOfResult) {
            System.out.println(currentNum);
        }
    }

    private static boolean isVowel(char currentChar) {
        Character[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        return Arrays.asList(vowels).contains(currentChar);
    }
}

