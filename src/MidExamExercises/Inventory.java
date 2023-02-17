package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" - ");
        String command = data[0];

        while (!command.equals("Craft!")) {

            String item = data[1];
            switch (command) {
                case "Collect":
                    if (itemsList.contains(item)) {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    } else {
                        itemsList.add(item);
                    }
                    break;

                case "Drop":
                    if (itemsList.contains(item)) {
                        itemsList.remove(item);
                    } else {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    }
                    break;

                case "Combine Items":
                    String[] itemsArr = item.split(":");
                    String oldItem = itemsArr[0];
                    String newItem = itemsArr[1];
                    if (itemsList.contains(oldItem)) {
                        int index = itemsList.indexOf(oldItem);
                        itemsList.add(index + 1, newItem);
                    } else {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    }

                    break;
                case "Renew":
                    if (itemsList.contains(item)) {
                        itemsList.remove(item);
                        itemsList.add(item);
                    } else {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    }
                    break;
            }


            data = scanner.nextLine().split(" - ");
            command = data[0];
        }

        StringBuilder sb = new StringBuilder();

        for (String item : itemsList) {
            sb.append(item).append(", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2));
    }
}
