package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> phoneList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" - ");
        String command = data[0];

        while (!command.equals("End")) {

            switch (command) {
                case "Add":
                    String phoneToAdd = data[1];
                    if (!phoneList.contains(phoneToAdd)) {
                        phoneList.add(phoneToAdd);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = data[1];
                    if (phoneList.contains(phoneToRemove)) {
                        phoneList.remove(phoneToRemove);
                    } else {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    }
                    break;
                case "Bonus phone":
                    String[] input = data[1].split(":");
                    String oldPhone = input[0];
                    String newPhone = input[1];

                    if (phoneList.contains(oldPhone)) {
                        int oldPhoneIndex = phoneList.indexOf(oldPhone);
                        phoneList.add(oldPhoneIndex + 1, newPhone);
                    } else {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    }
                    break;
                case "Last":
                    String lastPhone = data[1];

                    if (!phoneList.contains(lastPhone)) {
                        data = scanner.nextLine().split(" - ");
                        command = data[0];
                        continue;
                    } else {
                        phoneList.remove(lastPhone);
                        phoneList.add(lastPhone);
                    }
                    break;
            }

            data = scanner.nextLine().split(" - ");
            command = data[0];

        }

        System.out.println(String.join(", ", phoneList));
    }
}
