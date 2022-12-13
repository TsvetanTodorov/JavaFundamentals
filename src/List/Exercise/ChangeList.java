package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays
                    .stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLine.get(0);

            switch (command) {
                case "Delete":
                    int numToDelete = Integer.parseInt(commandLine.get(1));
                    numList.removeIf(n -> n == numToDelete);
                    break;
                case "Insert":
                    int numToAdd = Integer.parseInt(commandLine.get(1));
                    int position = Integer.parseInt(commandLine.get(2));
                    numList.add(position, numToAdd);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
