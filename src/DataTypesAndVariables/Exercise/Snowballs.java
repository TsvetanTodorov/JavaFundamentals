package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countSnowballs = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;
        int snowballSnowHighest = 0;
        int snowballTimeHighest = 0;
        int snowballQualityHighest = 0;

        for (int snowball = 1; snowball <= countSnowballs; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                snowballSnowHighest = snowballSnow;
                snowballTimeHighest = snowballTime;
                snowballQualityHighest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowHighest, snowballTimeHighest,
                maxSnowballValue, snowballQualityHighest);

    }
}
