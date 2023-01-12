package MidExamPreparation;


import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        double sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            sum += currentNum;
        }

        double avg = sum / numbersArr.length;


        List<Integer> topNumbers = new ArrayList<>();
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (currentNum > avg) {
                topNumbers.add(currentNum);
            }
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
        }


    }
}
