package Methods.Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scanner.nextLine());

        System.out.println(getGrade(inputGrade));


    }

    private static String getGrade(double num) {

        if (isFailGrade(num)) {
            return "Fail";
        } else if (isPoorGrade(num)) {
            return "Poor";
        } else if (isGoodGrade(num)) {
            return "Good";
        } else if (isVeryGoodGrade(num)) {
            return "Very good";
        } else if (isExcellentGrade(num)) {
            return "Excellent";
        }
        return "Invalid grade";
    }


    private static boolean isFailGrade(double num) {
        return num >= 2.00 && num <= 2.99;
    }

    private static boolean isPoorGrade(double num) {
        return num >= 3.00 && num <= 3.49;
    }

    private static boolean isGoodGrade(double num) {
        return num >= 3.50 && num <= 4.49;
    }

    private static boolean isVeryGoodGrade(double num) {
        return num >= 4.50 && num <= 5.49;
    }

    private static boolean isExcellentGrade(double num) {
        return num >= 5.50 && num <= 6.00;
    }

}
