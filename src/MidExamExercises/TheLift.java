package MidExamExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> listLift = new ArrayList<>();


        for (int i = 0; i <= lift.length - 1; i++) {
            int currentWagonOfTheLift = lift[i];
            while (currentWagonOfTheLift < 4) {
                if (waitingPeople == 0) {
                    break;
                }
                waitingPeople -= 1;
                currentWagonOfTheLift += 1;
            }
            listLift.add(currentWagonOfTheLift);
        }
        if (waitingPeople == 0) {
            System.out.println("The lift has empty spots!");
            System.out.println(listLift.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            System.out.println(listLift.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
