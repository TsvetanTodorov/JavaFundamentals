package TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();

        int index = input.indexOf(toRemove);

        while (index != -1) {
            input = input.replace(toRemove, "");
            index = input.indexOf(toRemove);
        }
        System.out.println(input);
    }
}
