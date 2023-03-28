package FinalExamPrep;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < countPieces; i++) {

            String[] data = scanner.nextLine().split("\\|");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];

            piecesMap.put(piece, new ArrayList<>());
            piecesMap.get(piece).add(composer);
            piecesMap.get(piece).add(key);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {

            String[] command = input.split("\\|");
            String typeCommand = command[0];
            String piece = command[1];
            switch (typeCommand) {
                case "Add":
                    String composer = command[2];
                    String key = command[3];
                    if (piecesMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!\n", piece);
                    } else {
                        piecesMap.put(piece, new ArrayList<>());
                        piecesMap.get(piece).add(composer);
                        piecesMap.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = command[2];
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.get(piece).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!\n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        piecesMap.entrySet().forEach(kvp -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
    }
}
