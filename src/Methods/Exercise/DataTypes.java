package Methods.Exercise;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String input = scanner.nextLine();

        printResultDependOfDataType(command, input);

    }

    private static void printResultDependOfDataType(String command, String input) {
        switch (command) {
            case "int":
                int inputAsInt = Integer.parseInt(input);
                inputAsInt *= 2;
                System.out.println(inputAsInt);
                break;
            case "real":
                double inputAsDouble = Double.parseDouble(input);
                inputAsDouble *= 1.5;
                System.out.printf("%.2f", inputAsDouble);
                break;
            case "string":
                System.out.println("$" + input + "$");
                break;
        }
    }
}
