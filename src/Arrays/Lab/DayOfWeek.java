package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dayNumber = Integer.parseInt(scanner.nextLine()) - 1;

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        try {
            System.out.println(daysOfWeek[dayNumber]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Day!");
        }
    }


}
