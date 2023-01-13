package List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> listOfPeople = new ArrayList<>();

        while (commandsCount > 0) {

            List<String> inputLine = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());

            String name = inputLine.get(0);

            String command = inputLine.get(2);

            if (!command.equals("not")) {
                if (listOfPeople.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    listOfPeople.add(name);
                }

            } else {
                if (listOfPeople.contains(name)) {
                    listOfPeople.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
            commandsCount--;
        }

        for (String string : listOfPeople){
            System.out.println(string);
        }
    }
}
