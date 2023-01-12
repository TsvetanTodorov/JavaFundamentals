package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;
        for (int i = 0; i < countStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double currentBonus = (double) attendances / countLectures * (5 + initialBonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
