package FinalExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#]{1}|[|]{1})(?<itemName>[A-Z\\s+a-z]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, List<String>> itemsMap = new LinkedHashMap<>();


        int totalCalories = 0;
        int caloriesPerDay = 2000;

        while (matcher.find()) {

            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            String calories = matcher.group("calories");

            itemsMap.putIfAbsent(itemName, new ArrayList<>());
            itemsMap.get(itemName).add(0, expirationDate);
            itemsMap.get(itemName).add(1, calories);

            int convertedCalories = Integer.parseInt(itemsMap.get(itemName).get(1));
            totalCalories += convertedCalories;
        }

        int daysToSurvive = Math.floorDiv(totalCalories, caloriesPerDay);

        System.out.println("You have food to last you for: " + daysToSurvive + " days!");
        itemsMap.entrySet().forEach(entry -> {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n",
                    entry.getKey(),
                    entry.getValue().get(0),
                    entry.getValue().get(1));
        });


    }
}
