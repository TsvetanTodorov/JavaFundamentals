package BasicSyntaxConditionalStatementsAndLoops.Lab;


import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 30;

        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }


    }
}
