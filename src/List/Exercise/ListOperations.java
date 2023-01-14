package List.Exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isValidIndex(index, numbers)) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                break;
                case "Insert": {
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (isValidIndex(index, numbers)) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                break;
                case "Shift":
                    int rotCnt = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])) {
                        for (int i = 0; i < rotCnt; i++) {
                            int temp = numbers.get(0);
                            for (int j = 0; j < numbers.size() - 1; j++) {
                                int nextElement = numbers.get(j + 1);
                                numbers.set(j, nextElement);
                            }
                            numbers.set(numbers.size() - 1, temp);
                        }
                    } else if ("right".equals(tokens[1])) {
                        for (int i = 0; i < rotCnt; i++) {
                            int tempr = numbers.get(numbers.size() - 1);
                            for (int j = numbers.size() - 1; j > 0; j--) {
                                int nextNumber = numbers.get(j - 1);
                                numbers.set(j, nextNumber);
                            }
                            numbers.set(0, tempr);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }
}