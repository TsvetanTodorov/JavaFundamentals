package FinalExam;

import java.util.*;

public class MessagesManager_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> usernamesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            if (input.contains("Add")) {
                String username = input.split("=")[1];
                int sentMessages = Integer.parseInt(input.split("=")[2]);
                int receivedMessages = Integer.parseInt(input.split("=")[3]);

                if (!usernamesMap.containsKey(username)) {
                    usernamesMap.put(username, new ArrayList<>());
                    usernamesMap.get(username).add(0, sentMessages);
                    usernamesMap.get(username).add(1, receivedMessages);
                } else {
                    input = scanner.nextLine();
                    continue;
                }


            } else if (input.contains("Message")) {
                String sender = input.split("=")[1];
                String receiver = input.split("=")[2];

                if (usernamesMap.containsKey(sender) && usernamesMap.containsKey(receiver)) {
                    int currentSentMessages = usernamesMap.get(sender).get(0);
                    int currentReceived = usernamesMap.get(receiver).get(1);

                    usernamesMap.get(sender).set(0, currentSentMessages + 1);
                    usernamesMap.get(receiver).set(1, currentReceived + 1);

                    if (usernamesMap.get(sender).get(0) + usernamesMap.get(sender).get(1) >= capacity) {
                        usernamesMap.remove(sender);
                        System.out.printf("%s reached the capacity!\n", sender);
                    }
                    if (usernamesMap.get(receiver).get(0) + usernamesMap.get(receiver).get(1) >= capacity) {
                        usernamesMap.remove(receiver);
                        System.out.printf("%s reached the capacity!\n", receiver);
                    }
                }

            } else if (input.contains("Empty")) {
                String username = input.split("=")[1];

                if (usernamesMap.containsKey(username)) {
                    usernamesMap.remove(username);
                }
                if (username.equals("All")) {
                    usernamesMap.clear();
                }

            }

            input = scanner.nextLine();
        }

        System.out.println("Users count: " + usernamesMap.size());
        usernamesMap.entrySet().forEach(entry -> {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1));
        });

    }
}
