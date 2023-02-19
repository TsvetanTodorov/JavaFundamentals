package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int citiesCount = Integer.parseInt(scanner.nextLine());

        double totalIncome;
        double incomeAfterTrip = 0;


        for (int i = 1; i <= citiesCount; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());


            if (i % 5 == 0) {
                income = income - (income * 0.1);
            } else if (i % 3 == 0) {
                expenses = expenses + (expenses * 0.5);
            }


            totalIncome = income - expenses;
            incomeAfterTrip += totalIncome;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityName, totalIncome);

        }

        System.out.printf("Burger Bus total profit: %.2f leva.", incomeAfterTrip);
    }
}
