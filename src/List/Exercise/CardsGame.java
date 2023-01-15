package List.Exercise;

//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class CardsGame {
//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        List<Integer> firstPlayerCards = Arrays
//                .stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        List<Integer> secondPlayerCards = Arrays
//                .stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//
//        boolean isSecondPlayerDeckEmpty = false;
//
//
//        int totalSum = 0;
//        while (!firstPlayerCards.isEmpty()) {
//
//            if (isSecondPlayerDeckEmpty) {
//                for (int currentCard : firstPlayerCards) {
//                    totalSum += currentCard;
//                }
//                System.out.printf("First player wins! Sum: %d", totalSum);
//                return;
//            }
//
//            int firstPlayerCurrentCard = firstPlayerCards.get(0);
//
//            while (!secondPlayerCards.isEmpty()) {
//                int secondPlayerCurrentCard = secondPlayerCards.get(0);
//
//                if (firstPlayerCurrentCard > secondPlayerCurrentCard) {
//                    firstPlayerCards.add(firstPlayerCurrentCard);
//                    firstPlayerCards.add(secondPlayerCurrentCard);
//                    secondPlayerCards.remove(secondPlayerCards.get(0));
//                    firstPlayerCards.remove(firstPlayerCards.get(0));
//
//                } else if (secondPlayerCurrentCard > firstPlayerCurrentCard) {
//                    secondPlayerCards.add(secondPlayerCurrentCard);
//                    secondPlayerCards.add(firstPlayerCurrentCard);
//                    firstPlayerCards.remove(firstPlayerCards.get(0));
//                    secondPlayerCards.remove(secondPlayerCards.get(0));
//
//                } else {
//                    firstPlayerCards.remove(firstPlayerCards.get(0));
//                    secondPlayerCards.remove(secondPlayerCards.get(0));
//                }
//
//                if (secondPlayerCards.isEmpty()) {
//                    isSecondPlayerDeckEmpty = true;
//                    break;
//                }
//                break;
//            }
//
//        }
//        for (int currentCard : secondPlayerCards) {
//            totalSum += currentCard;
//        }
//        System.out.printf("Second player wins! Sum: %d", totalSum);
//
//
//    }
//}



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstCardPower = firstPlayerCards.get(0);
            int secondCardPower = secondPlayerCards.get(0);
            removeCard(firstPlayerCards);
            removeCard(secondPlayerCards);
            if (firstCardPower > secondCardPower) {
                addCards(firstCardPower, secondCardPower, firstPlayerCards);
            } else if (secondCardPower > firstCardPower) {
                addCards(secondCardPower, firstCardPower, secondPlayerCards);
            }
        }

        List<Integer> winner = findWinner(firstPlayerCards, secondPlayerCards);

        System.out.printf("%s player wins! Sum: %d",
                firstPlayerCards.size() > secondPlayerCards.size() ? "First" : "Second",
                winner.stream().mapToInt(Integer::intValue).sum()
        );


    }

    private static List<Integer> findWinner(List<Integer> firstPlayerCards, List<Integer> secondPlayerCards) {
        return firstPlayerCards.size() > secondPlayerCards.size() ? firstPlayerCards : secondPlayerCards;
    }

    private static void addCards(int cardA, int cardB, List<Integer> cardDeck) {
        cardDeck.add(cardA);
        cardDeck.add(cardB);
    }

    private static void removeCard(List<Integer> cardDeck) {
        cardDeck.remove(0);
    }
}
