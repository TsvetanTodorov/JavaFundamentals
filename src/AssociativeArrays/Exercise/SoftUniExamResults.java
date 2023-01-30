package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniExamResults {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String username;
        String languageData;
        int points;


        Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> submissions = new TreeMap<>();


        while (!command.equals("exam finished")) {

            String[] data = command.split("-");
            if (data.length == 3) {
                username = data[0];
                languageData = data[1];
                points = Integer.parseInt(data[2]);


                students.put(username, points);
                if (!submissions.containsKey(languageData)) {
                    submissions.put(languageData, 1);
                } else {
                    int currentSubmissions = submissions.get(languageData);
                    submissions.put(languageData, currentSubmissions + 1);
                }

            } else {
                username = data[0];
                students.remove(username);
                command = scanner.nextLine();
                continue;
            }
            command = scanner.nextLine();
        }


        System.out.println("Results:");
        students.entrySet().stream().sorted((e1, e2) -> e2.getValue() - (e1.getValue()))
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));

        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));


    }
}
