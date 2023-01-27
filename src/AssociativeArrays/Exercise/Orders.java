package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsMap = new HashMap<>();
        Map<String, Double> productsTotalPrice = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String[] data = command.split(" ");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!productsMap.containsKey(product)) {
                productsMap.put(product, quantity);
            } else {
                int currentQuantity = productsMap.get(product);
                productsMap.put(product, currentQuantity + quantity);
            }
            double totalPrice = price * productsMap.get(product);

            productsTotalPrice.put(product, totalPrice);
            command = scanner.nextLine();
        }

        productsTotalPrice.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
