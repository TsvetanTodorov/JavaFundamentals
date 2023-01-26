package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<Character, Integer> charsCount = new LinkedHashMap<>();

        for (char symbol : data.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!charsCount.containsKey(symbol)) {
                charsCount.put(symbol, 1);
            } else {
                int currentCount = charsCount.get(symbol);
                charsCount.put(symbol, currentCount + 1);
            }
        }

        charsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
