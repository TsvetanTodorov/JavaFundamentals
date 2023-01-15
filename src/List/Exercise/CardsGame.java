package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        boolean isSecondPlayerDeckEmpty = false;

        int index = 0;
        int totalSum = 0;
        while (!firstPlayerCards.isEmpty()) {

            if (isSecondPlayerDeckEmpty) {
                for (int currentCard : firstPlayerCards) {
                    totalSum += currentCard;
                }
                System.out.printf("First player wins! Sum: %d", totalSum);
                return;
            }

            int firstPlayerCurrentCard = firstPlayerCards.get(index);

            while (!secondPlayerCards.isEmpty()) {
                int secondPlayerCurrentCard = secondPlayerCards.get(index);

                if (firstPlayerCurrentCard > secondPlayerCurrentCard) {
                    firstPlayerCards.add(firstPlayerCurrentCard);
                    firstPlayerCards.add(secondPlayerCurrentCard);
                    secondPlayerCards.remove(secondPlayerCards.get(index));
                    firstPlayerCards.remove(firstPlayerCards.get(index));

                } else if (secondPlayerCurrentCard > firstPlayerCurrentCard) {
                    secondPlayerCards.add(secondPlayerCurrentCard);
                    secondPlayerCards.add(firstPlayerCurrentCard);
                    firstPlayerCards.remove(firstPlayerCards.get(index));
                    secondPlayerCards.remove(secondPlayerCards.get(index));

                } else {
                    firstPlayerCards.remove(firstPlayerCards.get(index));
                    secondPlayerCards.remove(secondPlayerCards.get(index));
                }

                if (secondPlayerCards.isEmpty()) {
                    isSecondPlayerDeckEmpty = true;
                    break;
                }
                break;
            }

        }
        for (int currentCard : secondPlayerCards) {
            totalSum += currentCard;
        }
        System.out.printf("Second player wins! Sum: %d", totalSum);


    }
}
