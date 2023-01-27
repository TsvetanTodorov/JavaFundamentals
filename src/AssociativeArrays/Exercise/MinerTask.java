package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class MinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> collectionMap = new LinkedHashMap<>();


        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!collectionMap.containsKey(resource)) {
                collectionMap.put(resource, quantity);
            } else {
                int currentQuantity = collectionMap.get(resource);
                collectionMap.put(resource, currentQuantity + quantity);
            }

            resource = scanner.nextLine();
        }

        collectionMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }


}

