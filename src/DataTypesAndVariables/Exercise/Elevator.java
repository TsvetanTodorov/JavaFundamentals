package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());


        double courses = (Math.ceil((double) countPeople / capacity));
        System.out.printf("%.0f", courses);
    }
}
