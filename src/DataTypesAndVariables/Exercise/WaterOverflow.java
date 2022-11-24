package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterTankCapacity = 255;

        int n = Integer.parseInt(scanner.nextLine());
        int sumLiters = 0;


        for (int i = 1; i <= n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            sumLiters += currentLiters;
            if (sumLiters > waterTankCapacity) {
                System.out.println("Insufficient capacity!");
                sumLiters -= currentLiters;
            }
        }
        System.out.println(sumLiters);
    }
}
