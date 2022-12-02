package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= inputNum; i++) {
            printingTriangle(i);
        }

        for (int i = inputNum - 1; i >= 1; i--) {
            printingTriangle(i);
        }

    }

    private static void printingTriangle(int end) {

        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
