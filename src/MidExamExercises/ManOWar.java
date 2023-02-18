package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warship = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int maxHealth = Integer.parseInt(scanner.nextLine());

        String[] data = scanner.nextLine().split(" ");
        String command = data[0];

        while (!command.equals("Retire")) {

            int index;
            int damage;
            switch (command) {
                case "Fire":
                    index = Integer.parseInt(data[1]);
                    damage = Integer.parseInt(data[2]);
                    if (isInvalid(index, warship)) {
                        data = scanner.nextLine().split(" ");
                        command = data[0];
                        continue;
                    } else {
                        int currentSection = warship.remove(index) - damage;
                        warship.add(index, currentSection);
                        if (warship.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    damage = Integer.parseInt(data[3]);
                    if (isInvalid(startIndex, pirateShip)) {
                        data = scanner.nextLine().split(" ");
                        command = data[0];
                        continue;
                    }
                    if (isInvalid(endIndex, pirateShip)) {
                        data = scanner.nextLine().split(" ");
                        command = data[0];
                        continue;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentSection = pirateShip.remove(i) - damage;
                        pirateShip.add(i, currentSection);
                        if (pirateShip.get(i) <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                    break;

                case "Repair":
                    index = Integer.parseInt(data[1]);
                    int health = Integer.parseInt(data[2]);
                    if (isInvalid(index, pirateShip)) {
                        data = scanner.nextLine().split(" ");
                        command = data[0];
                        continue;
                    }
                    int currentSection = pirateShip.remove(index) + health;
                    if (currentSection > maxHealth) {
                        currentSection = maxHealth;
                    }
                    pirateShip.add(index, currentSection);
                    break;

                case "Status":
                    int sectionCounter = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        int sectionHealth = pirateShip.get(i);
                        double neededHealth = maxHealth * 0.2;
                        if (sectionHealth < neededHealth) {
                            sectionCounter++;
                        }
                    }
                    System.out.printf("%d sections need repair.\n", sectionCounter);
                    break;
            }

            data = scanner.nextLine().split(" ");
            command = data[0];
        }


        int pirateShipStatus = 0;
        int warshipStatus = 0;

        for (Integer section : pirateShip) {
            pirateShipStatus += section;
        }
        System.out.printf("Pirate ship status: %d\n", pirateShipStatus);

        for (Integer section : warship) {
            warshipStatus += section;
        }
        System.out.printf("Warship status: %d\n", warshipStatus);


    }


    public static boolean isInvalid(int index, List<Integer> list) {
        return index < 0 || index > list.size();

    }
}
