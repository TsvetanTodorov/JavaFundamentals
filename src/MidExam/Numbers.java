package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] data = scanner.nextLine().split(" ");
        String command = data[0];

        while (!command.equals("Finish")) {

            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(data[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(data[1]);
                    if (numbers.contains(numberToRemove)) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNum = numbers.get(i);
                            if (currentNum == numberToRemove) {
                                numbers.remove(numbers.get(i));
                            }
                        }
                    }
                    break;
                case "Replace":
                    int value = Integer.parseInt(data[1]);
                    int replacement = Integer.parseInt(data[2]);
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);
                        if (currentNum == value) {
                            numbers.remove(numbers.get(i));
                            numbers.add(i, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int num = Integer.parseInt(data[1]);
                    for (int i = 0; i <= numbers.size() - 1; i++) {
                        int currentNum = numbers.get(i);
                        if (currentNum < num) {
                            numbers.remove(numbers.get(i));
                            i--;
                        }

                    }
                    break;
            }

            data = scanner.nextLine().split(" ");
            command = data[0];
        }

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
