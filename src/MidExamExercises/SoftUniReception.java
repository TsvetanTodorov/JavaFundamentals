package MidExamExercises;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int neededHours = 0;

        int answeredPeoplePerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

        while (studentsCount > 0) {
            studentsCount -= answeredPeoplePerHour;
            neededHours++;

            if (neededHours % 4 == 0) {
                neededHours++;
            }
        }
        System.out.printf("Time needed: %dh.", neededHours);
    }
}
