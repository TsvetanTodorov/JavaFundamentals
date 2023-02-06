package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistances.put(racer, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patternLetter.matcher(input);
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }

            int distance = 0;
            Matcher matcherDigits = patternDigit.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            String racerName = nameBuilder.toString();
            if (racersDistances.containsKey(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }


            input = scanner.nextLine();
        }

        List<String> firstThreeRacers = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThreeRacers.get(0));
        System.out.println("2nd place: " + firstThreeRacers.get(1));
        System.out.println("3rd place: " + firstThreeRacers.get(2));

    }
}
