package AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new HashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] data = command.split(" : ");
            String course = data[0];
            String studentName = data[1];

            if (!coursesMap.containsKey(course)) {
                coursesMap.put(course, new ArrayList<>());
                coursesMap.get(course).add(studentName);
            } else {
                coursesMap.get(course).add(studentName);
            }

            command = scanner.nextLine();
        }


        coursesMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.printf("-- %s%n", e));
                });
    }
}
