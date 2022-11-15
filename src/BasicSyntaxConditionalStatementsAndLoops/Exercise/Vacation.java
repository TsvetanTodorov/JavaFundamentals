package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupQuantity = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        switch (dayOfWeek) {
            case "Friday":
                if (isEqualsStudents(typeOfGroup)) {
                    price = 8.45;
                    totalPrice = price * groupQuantity;
                } else if (isEqualsBusiness(typeOfGroup)) {
                    if (isMoreOrEqualsAHundred(groupQuantity)) {
                        groupQuantity -= 10;
                    }
                    price = 10.90;
                    totalPrice = price * groupQuantity;
                } else {
                    price = 15;
                    totalPrice = price * groupQuantity;
                }
                break;

            case "Saturday":
                if (isEqualsStudents(typeOfGroup)) {
                    price = 9.80;
                    totalPrice = price * groupQuantity;
                } else if (isEqualsBusiness(typeOfGroup)) {
                    if (isMoreOrEqualsAHundred(groupQuantity)) {
                        groupQuantity -= 10;
                    }
                    price = 15.60;
                    totalPrice = price * groupQuantity;
                } else {
                    price = 20;
                    totalPrice = price * groupQuantity;
                }
                break;

            case "Sunday":
                if (isEqualsStudents(typeOfGroup)) {
                    price = 10.46;
                    totalPrice = price * groupQuantity;
                } else if (isEqualsBusiness(typeOfGroup)) {
                    if (isMoreOrEqualsAHundred(groupQuantity)) {
                        groupQuantity -= 10;
                    }
                    price = 16;
                    totalPrice = price * groupQuantity;
                } else {
                    price = 22.50;
                    totalPrice = price * groupQuantity;
                }
                break;
        }

        if (isEqualsStudents(typeOfGroup) && isMoreOrEqualsThirty(groupQuantity)) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (isEqualsRegular(typeOfGroup) && isBetweenTenAndTwenty(groupQuantity)) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }

    private static boolean isMoreOrEqualsAHundred(int num) {
        return num >= 100;
    }

    private static boolean isBetweenTenAndTwenty(int num) {
        return num >= 10 && num <= 20;
    }

    private static boolean isEqualsStudents(String type) {
        String text = "Students";
        return type.equals(text);
    }

    private static boolean isEqualsBusiness(String type) {
        String text = "Business";
        return type.equals(text);
    }

    private static boolean isMoreOrEqualsThirty(int num) {
        return num >= 30;
    }

    private static boolean isEqualsRegular(String type) {
        String text = "Regular";
        return type.equals(text);
    }
}
