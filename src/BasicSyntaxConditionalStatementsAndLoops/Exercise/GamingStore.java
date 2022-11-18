package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price;
        double totalSpend = 0;
        boolean isOutOfMoney = false;

        while (!command.equals("Game Time")) {
            if (command.equals("OutFall 4")) {
                price = 39.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("CS: OG")) {
                price = 15.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("Zplinter Zell")) {
                price = 19.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("Honored 2")) {
                price = 59.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("RoverWatch")) {
                price = 29.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (isMoreThan(price, balance, totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else {
                System.out.println("Not Found");
            }
            if (isMoreOrEquals(totalSpend, balance)) {
                isOutOfMoney = true;
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
        }
        double remainingMoney = balance - totalSpend;
        if (!isOutOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, remainingMoney);
        }

    }


    private static boolean isMoreThan(double num1, double num2, double num3) {
        return num1 > (num2 - num3);
    }

    private static boolean isMoreOrEquals(double num1, double num2) {
        return num1 >= num2;
    }
}
