package FinalExamPrep;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder builder = new StringBuilder(input);

        while (!input.equals("Travel")) {


            if (input.contains("Add")) {
                int index = Integer.parseInt(input.split(":")[1]);
                String stopToAdd = input.split(":")[2];
                if (index >= 0 && index < builder.length()) {
                    builder.insert(index, stopToAdd);
                    System.out.println(builder);
                } else {
                    System.out.println(builder);
                }


            } else if (input.contains("Remove")) {
                int startIndex = Integer.parseInt(input.split(":")[1]);
                int endIndex = Integer.parseInt(input.split(":")[2]);
                if (startIndex >= 0 || endIndex < builder.length()) {
                    builder.replace(startIndex, endIndex + 1, "");
                    System.out.println(builder);
                }else{
                    System.out.println(builder);
                }

            } else if (input.contains("Switch")) {
                String oldStop = input.split(":")[1];
                String newStop = input.split(":")[2];

                if (builder.toString().contains(oldStop)) {
                    int startIndex = builder.indexOf(oldStop);
                    int endIndex = oldStop.length();
                    builder.replace(startIndex, endIndex, newStop);
                    System.out.println(builder);
                }else{
                    System.out.println(builder);
                }

            }
            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + builder);


    }
}
