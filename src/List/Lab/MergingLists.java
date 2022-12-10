package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> listResult = new ArrayList<>();


        boolean isFirstListEmpty = false;
        while (firstList.size() > 0) {
            int currentElementFromFirstList = firstList.get(0);
            listResult.add(currentElementFromFirstList);
            firstList.remove(0);
            if (firstList.size() == 0) {
                isFirstListEmpty = true;
            }
            while (secondList.size() > 0) {
                if(isFirstListEmpty){
                    int currentElementFromSecondList = secondList.get(0);
                    listResult.add(currentElementFromSecondList);
                    secondList.remove(0);
                    continue;
                }
                int currentElementFromSecondList = secondList.get(0);
                listResult.add(currentElementFromSecondList);
                secondList.remove(0);
                break;
            }
        }

        System.out.println(listResult.toString().replaceAll("[\\[\\],]", ""));


    }
}
