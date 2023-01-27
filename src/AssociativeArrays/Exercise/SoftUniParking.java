package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> registrations = new LinkedHashMap<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());
        String command;
        String username;
        String licensePlate = null;

        for (int i = 0; i < commandsCount; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            if (data.length == 3) {
                command = data[0];
                username = data[1];
                licensePlate = data[2];
            } else {
                command = data[0];
                username = data[1];
            }

            if (command.equals("register")) {
                if (!registrations.containsKey(username)) {
                    registrations.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, registrations.get(username));
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", registrations.get(username));
                }
            } else {
                if (!registrations.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registrations.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }

        }
        registrations.entrySet().forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
