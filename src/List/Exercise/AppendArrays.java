package List.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");
        List<String[]> listOfArrays = Arrays.stream(arrays).map(array -> array.split("\\s+")).collect(Collectors.toList());
        Collections.reverse(listOfArrays);
        listOfArrays.forEach(a -> Arrays.stream(a).forEach(el -> System.out.print(!el.equals("") ? el + " " : "")));
    }

}
