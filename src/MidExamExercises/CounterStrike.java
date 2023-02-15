package MidExamExercises;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        int wonBattlesCounter = 0;

        String command = scanner.nextLine();

        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command);

            if (energy < distance) {
                System.out.println("Not enough energy! Game ends with " + wonBattlesCounter + " won battles and " + energy + " energy");

                return;
            } else {
                energy -= distance;
                wonBattlesCounter++;
            }

            if (wonBattlesCounter % 3 == 0) {
                energy += wonBattlesCounter;

            }

            command = scanner.nextLine();
        }

        System.out.println("Won battles: " + wonBattlesCounter + ". Energy left: " + energy);

    }
}
