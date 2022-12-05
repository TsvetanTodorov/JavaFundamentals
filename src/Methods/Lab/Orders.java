package Methods.Lab;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String productType = scanner.nextLine();
        int productsQuantity = Integer.parseInt(scanner.nextLine());

        calculateAndPrintFinalPrice(productType, productsQuantity);


    }

    private static void calculateAndPrintFinalPrice(String product, int quantity) {

        double price = 0;
        double totalSum = 0;
        switch (product) {
            case "water":
                price = 1.00;
                break;
            case "coffee":
                price = 1.50;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
            default:
                break;
        }
        totalSum += price * quantity;
        System.out.printf("%.2f", totalSum);
    }


}
