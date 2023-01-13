package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
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
                case "Contains":
                    boolean isContain = false;
                    int number = Integer.parseInt(commandLine.get(1));
                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentNumber = numList.get(i);
                        if (areEqual(number, currentNumber)) {
                            isContain = true;
                            printYes();

                        }
                    }
                    if (!isContain) {
                        printNoSuchNumber();
                    }

                    break;
                case "Print":
                    String secondCommand = commandLine.get(1);

                    if (secondCommand.equals("even")) {
                        List<Integer> evenNumbers = new ArrayList<>();
                        for (int i = 0; i <= numList.size() - 1; i++) {
                            int currentNumber = numList.get(i);
                            if (isEven(currentNumber)) {
                                evenNumbers.add(currentNumber);
                            }
                        }
                        print(evenNumbers);
                    } else {
                        List<Integer> oddNumbers = new ArrayList<>();
                        for (int i = 0; i <= numList.size() - 1; i++) {
                            int currentNumber = numList.get(i);
                            if (currentNumber % 2 == 1) {
                                oddNumbers.add(currentNumber);
                            }
                        }
                        print(oddNumbers);
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i <= numList.size() - 1; i++) {
                        int currentNumber = numList.get(i);
                        sum += currentNumber;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int givenNumber = Integer.parseInt(commandLine.get(2));
                    List<Integer> checkedNumbers = new ArrayList<>();
                    switch (condition) {
                        case ">":
                            for (int i = 0; i <= numList.size() - 1; i++) {
                                int currentNumber = numList.get(i);
                                if (currentNumber > givenNumber) {
                                    checkedNumbers.add(currentNumber);
                                }
                            }
                            print(checkedNumbers);
                            break;
                        case "<":
                            for (int i = 0; i <= numList.size() - 1; i++) {
                                int currentNumber = numList.get(i);
                                if (currentNumber < givenNumber) {
                                    checkedNumbers.add(currentNumber);
                                }
                            }
                            print(checkedNumbers);
                            break;
                        case ">=":
                            for (int i = 0; i <= numList.size() - 1; i++) {
                                int currentNumber = numList.get(i);
                                if (currentNumber >= givenNumber) {
                                    checkedNumbers.add(currentNumber);
                                }
                            }
                           print(checkedNumbers);
                            break;
                        case "<=":
                            for (int i = 0; i <= numList.size() - 1; i++) {
                                int currentNumber = numList.get(i);
                                if (currentNumber <= givenNumber) {
                                    checkedNumbers.add(currentNumber);
                                }
                            }
                           print(checkedNumbers);
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static boolean areEqual(int number, int currentNumber) {
        return number == currentNumber;
    }

    private static void printYes() {
        System.out.println("Yes");
    }

    private static void printNoSuchNumber() {
        System.out.println("No such number");
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }

    private static void print(List<Integer> numbers) {
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }


}
