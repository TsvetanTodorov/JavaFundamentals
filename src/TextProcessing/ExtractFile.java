package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullPathFile = scanner.nextLine();
        String[] pathParts = fullPathFile.split("\\\\");
        String fullFileName = pathParts[pathParts.length - 1];
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];


        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);


    }
}
