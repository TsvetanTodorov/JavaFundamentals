package MidExamExercises;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumWithoutTaxes = 0;


        while (!command.equals("regular") && !command.equals("special")) {
            double currentPrice = Double.parseDouble(command);
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            sumWithoutTaxes += currentPrice;
            command = scanner.nextLine();
        }
        if (sumWithoutTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }
        double taxes = sumWithoutTaxes * 0.20;
        double sumAfterTaxes = sumWithoutTaxes + taxes;
        if (command.equals("special")) {
            sumAfterTaxes = sumAfterTaxes - (sumAfterTaxes * 0.10);
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", sumWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", sumAfterTaxes);

    }
}
