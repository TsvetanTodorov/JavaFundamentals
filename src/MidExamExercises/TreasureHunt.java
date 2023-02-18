package MidExamExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> treasures = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String[] commandsArr = scanner.nextLine().split(" ");
        String command = commandsArr[0];

        while (!command.equals("Yohoho!")) {

            switch (command) {
                case "Loot":
                    for (int i = 1; i <= commandsArr.length - 1; i++) {
                        String item = commandsArr[i];
                        if (!treasures.contains(item)) {
                            treasures.add(0, item);
                        }
                    }
                    break;

                case "Drop":
                    int position = Integer.parseInt(commandsArr[1]);
                    if (position > treasures.size() || position < 0) {
                        commandsArr = scanner.nextLine().split(" ");
                        command = commandsArr[0];
                        continue;
                    } else {
                        String item = treasures.remove(position);
                        treasures.add(item);
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(commandsArr[1]);

                    if (treasures.size() < count) {
                        for (String item : treasures) {
                            treasures.remove(item);
                            System.out.print(String.join(", ", treasures));
                        }
                    } else {
                        List<String> stolenItems = new ArrayList<>();
                        while (count > 0) {
                            String stolenItem = treasures.remove(treasures.size() - 1);
                            stolenItems.add(0, stolenItem);
                            count--;
                        }
                        System.out.println(String.join(", ", stolenItems));
                    }
                    break;

            }
            commandsArr = scanner.nextLine().split(" ");
            command = commandsArr[0];
        }

        if (treasures.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = 0;
            double averageGained;

            for (String item : treasures) {
                totalLength += item.length();
            }
            averageGained = totalLength * 1.0 / treasures.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGained);
        }
    }
}
