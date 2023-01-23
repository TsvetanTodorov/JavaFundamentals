package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialLadyBugIndexes = getInitialLadyBugsIndexes(scanner);
        int[] field = populateField(initialLadyBugIndexes, fieldSize);

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {
            int currentLadyBugPosition = Integer.parseInt(command[0]);
            String ladyBugDirection = command[1];
            int flyLength = Integer.parseInt(command[2]);

            int landingPosition;
            if (ladyBugDirection.equals("right")) {
                landingPosition = getLandingPositionToTheRight(field, currentLadyBugPosition, flyLength);

                if (isOutOfField(landingPosition, fieldSize)) {
                    field[currentLadyBugPosition] = 0;
                    command = scanner.nextLine().split(" ");
                    continue;
                }
            } else {
                landingPosition = getLandingPositionToTheLeft(field, currentLadyBugPosition, flyLength);

                if (isOutOfField(landingPosition)) {
                    field[currentLadyBugPosition] = 0;
                    command = scanner.nextLine().split(" ");
                    continue;
                }

            }
            field[landingPosition] = 1;
            field[currentLadyBugPosition] = 0;
            command = scanner.nextLine().split(" ");
        }

        String[] result = parseIntegerArrayToStringArray(field);
        String resultAsString = String.join(" ", result);

        System.out.println(resultAsString);

    }

    private static int[] getInitialLadyBugsIndexes(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[] populateField(int[] initialLadyBugIndexes, int fieldSize) {
        int[] field = new int[fieldSize];
        for (int currentIndex : initialLadyBugIndexes) {
            field[currentIndex] = 1;
        }
        return field;
    }

    private static int getLandingPositionToTheRight(int[] field, int currentLadyBugPosition, int flyLength) {
        int fieldSize = field.length;
        int landingPosition = currentLadyBugPosition + flyLength;
        while (landingPosition > fieldSize && field[landingPosition] == 1) {
            landingPosition++;
        }
        return landingPosition;
    }


    private static boolean isOutOfField(int landingPosition, int fieldSize) {
        return landingPosition >= fieldSize;
    }

    private static int getLandingPositionToTheLeft(int[] field, int currentLadyBugPosition, int flyLength) {
        int landingPosition = currentLadyBugPosition - flyLength;
        while (landingPosition > 0 && field[landingPosition] == 1) {
            landingPosition--;
        }
        return landingPosition;
    }

    private static boolean isOutOfField(int landingPosition) {
        return landingPosition < 0;
    }

    private static String[] parseIntegerArrayToStringArray(int[] field) {
        return Arrays.stream(field)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
    }
}
