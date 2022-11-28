package Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int[] peopleInAWagon = new int[wagonsCount];
        int sum = 0;

        for (int i = 0; i < peopleInAWagon.length; i++) {
            int currentWagon = Integer.parseInt(scanner.nextLine());
            peopleInAWagon[i] += currentWagon;
            sum += currentWagon;
            System.out.print(currentWagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
