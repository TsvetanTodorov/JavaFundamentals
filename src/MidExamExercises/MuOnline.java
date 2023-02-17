package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listOfRooms = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int totalBitcoins = 0;
        int roomsCounter = 0;

        while (!listOfRooms.isEmpty()) {

            String[] currentRoom = listOfRooms.get(0).split(" ");
            String command = currentRoom[0];


            switch (command) {
                case "potion":
                    int potionAmount = Integer.parseInt(currentRoom[1]);
                    int currentHealth = health;
                    health += potionAmount;
                    if (health > 100) {
                        health = 100;
                        System.out.printf("You healed for %d hp.\n", health - currentHealth);
                    } else {
                        System.out.printf("You healed for %d hp.\n", potionAmount);
                    }
                    roomsCounter++;
                    System.out.printf("Current health: %d hp.\n", health);
                    break;

                case "chest":
                    int bitcoinsFound = Integer.parseInt(currentRoom[1]);
                    totalBitcoins += bitcoinsFound;
                    roomsCounter++;
                    System.out.printf("You found %d bitcoins.\n", bitcoinsFound);
                    break;

                default:
                    int monsterAttack = Integer.parseInt(currentRoom[1]);
                    health -= monsterAttack;

                    roomsCounter++;
                    if (health > 0) {
                        System.out.printf("You slayed %s.\n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.\n", command);
                        System.out.printf("Best room: %d", roomsCounter);
                        return;
                    }
                    break;
            }

            listOfRooms.remove(0);

        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", totalBitcoins);
        System.out.printf("Health: %d", health);
    }
}
