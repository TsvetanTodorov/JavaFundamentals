package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class FancyBarcodes {
    public static void main(String[] args) {
        String regex = "^@#+(?=[A-Z])(?<barcode>[A-Za-z0-9]{6,})(?<=[A-Z])@#+$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);

        int barcodesCount = Integer.parseInt(scanner.nextLine());

        IntStream.range(0, barcodesCount)
                .mapToObj(i -> {
                    Matcher matcher = pattern.matcher(scanner.nextLine());

                    if (!matcher.matches()) {
                        return "Invalid barcode";
                    }

                    String barcode = matcher.group("barcode");
                    String productGroup = barcode.codePoints()
                            .filter(Character::isDigit)
                            .mapToObj(c -> (char) c)
                            .collect(Collector.of(
                                    StringBuilder::new,
                                    StringBuilder::append,
                                    StringBuilder::append,
                                    sb -> sb.length() == 0 ? "00" : sb.toString()));

                    return "Product group: " + productGroup;
                })
                .forEach(System.out::println);
    }
}
