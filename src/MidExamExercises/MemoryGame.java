package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listOfElements = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        int moves = 0;

        while (!inputLine.equals("end")) {
            moves++;
            String[] indexes = inputLine.split(" ");
            int firstIndex = Integer.parseInt(indexes[0]);
            int secondIndex = Integer.parseInt(indexes[1]);


            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex >= listOfElements.size()
                    || secondIndex < 0 || secondIndex >= listOfElements.size()) {
                int middleIndex = listOfElements.size() / 2;

                listOfElements.add(middleIndex, "-" + moves + "a");
                listOfElements.add(middleIndex, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (listOfElements.get(firstIndex).equals(listOfElements.get(secondIndex))) {
                String indexValue = listOfElements.get(firstIndex);
                if (firstIndex > secondIndex) {
                    listOfElements.remove(firstIndex);
                    listOfElements.remove(secondIndex);
                } else {
                    listOfElements.remove(secondIndex);
                    listOfElements.remove(firstIndex);
                }
                System.out.printf("Congrats! You have found matching elements - %s!%n", indexValue);
            } else if (!listOfElements.get(firstIndex).equals(listOfElements.get(secondIndex))) {
                System.out.println("Try again!");
            }
            if (listOfElements.isEmpty()) {
                System.out.printf("You have won in %d turns!", moves);
                return;
            }

            inputLine = scanner.nextLine();

        }

        System.out.println("Sorry you lose :(");
        System.out.println(listOfElements.toString().replaceAll("[\\[\\],]", ""));
    }
}
