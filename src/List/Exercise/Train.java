package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays
                    .stream(input.split(" "))
                    .collect(Collectors.toList());

            if (commandLine.get(0).equals("Add")) {
                int wagonToAdd = Integer.parseInt(commandLine.get(1));
                wagonsList.add(wagonToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(commandLine.get(0));
                for (int i = 0; i <= wagonsList.size() - 1; i++) {
                    int currentWagonSpace = wagonsList.get(i);
                    if (currentWagonSpace + passengersToAdd <= wagonMaxCapacity) {
                        currentWagonSpace += passengersToAdd;
                        wagonsList.set(i, currentWagonSpace);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
