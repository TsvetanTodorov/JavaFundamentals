package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<String> destinationsList = new ArrayList<>();

        String regex = "([=]{1}|[\\/]{1})(?<destination>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalPoints = 0;
        while (matcher.find()) {

            String destination = matcher.group("destination");
            int currentDestinationPoints = destination.length();
            totalPoints += currentDestinationPoints;
            destinationsList.add(destination);

        }

        if (destinationsList.isEmpty()) {
            System.out.println("Destinations:");
        } else {
            StringBuilder builder = new StringBuilder();
            for (String destination : destinationsList) {
                builder.append(destination).append(", ");
            }
            System.out.println("Destinations: " + builder.substring(0, builder.length() - 2));
        }

        System.out.println();
        System.out.println("Travel Points: " + totalPoints);
    }
}
