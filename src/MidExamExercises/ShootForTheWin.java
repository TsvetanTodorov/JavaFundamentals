package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        int shotCounter = 0;

        while (!command.equals("End")) {

            int index = Integer.parseInt(command);

            if (index < 0 || index > targets.size() - 1) {
                command = scanner.nextLine();
                continue;
            } else {
                int value = targets.get(index);
                if (value == -1) {
                    command = scanner.nextLine();
                    continue;
                }
                targets.remove(index);
                targets.add(index, -1);
                shotCounter++;

                for (int i = 0; i < targets.size(); i++) {
                    if (i == index) {
                        continue;
                    }

                    int currentTarget = targets.get(i);
                    if (currentTarget == -1) {
                        continue;
                    }
                    targets.remove(targets.get(i));
                    if (currentTarget > value) {
                        targets.add(i, currentTarget -= value);
                    } else {
                        targets.add(i, currentTarget += value);
                    }
                }
            }

            command = scanner.nextLine();
        }

        System.out.println("Shot targets: " + shotCounter + " -> " + targets.toString().replaceAll("[\\[\\],]", ""));

    }
}
