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
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("CS: OG")) {
                price = 15.99;
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("Zplinter Zell")) {
                price = 19.99;
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("Honored 2")) {
                price = 59.99;
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("RoverWatch")) {
                price = 29.99;
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else if (command.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (price > (balance - totalSpend)) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpend += price;
                    System.out.printf("Bought %s%n", command);
                }
            } else {
                System.out.println("Not Found");
            }
            if (totalSpend >= balance) {
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
}
