package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalCoins = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalCoins += coins;
            } else {
                System.out.printf("Cannot accept: %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        double price = 0;
        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                price = 2.0;
                if (isMoreOrEquals(totalCoins, price)) {
                    totalCoins -= price;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry not enough money");
                }

            } else if (input.equals("Water")) {
                price = 0.7;
                if (isMoreOrEquals(totalCoins, price)) {
                    totalCoins -= price;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry not enough money");
                }
            } else if (input.equals("Crisps")) {
                price = 1.5;
                if (isMoreOrEquals(totalCoins, price)) {
                    totalCoins -= price;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry not enough money");
                }
            } else if (input.equals("Soda")) {
                price = 0.8;
                if (isMoreOrEquals(totalCoins, price)) {
                    totalCoins -= price;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry not enough money");
                }
            } else if (input.equals("Coke")) {
                price = 1.0;
                if (isMoreOrEquals(totalCoins, price)) {
                    totalCoins -= price;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalCoins);

    }


    private static boolean isMoreOrEquals(double num1, double num2) {
        return num1 >= num2;
    }
}
