package Methods.Exercise;


import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

//        int[] myNums = {-100, 23, 4, 5, 6, 3, 7, 9, 2, 3, 4,};

//        System.out.println(getSmallestNumber(n1, n2, n3));
        System.out.println(getSmallestNumber1(n1, n2, n3));
//        System.out.println(getSmallestNumber2(myNums));
    }

//    private static int getSmallestNumber(int num1, int num2, int num3) {
//        int minNumber = 0;
//        if (num1 <= num2 && num1 <= num3) {
//            minNumber = num1;
//        } else if (num2 <= num1 && num2 <= num3) {
//            minNumber = num2;
//        } else {
//            minNumber = num3;
//        }
//        return minNumber;
//    }


    private static int getSmallestNumber1(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

//    private static int getSmallestNumber2(int[] integerArray) {
//        int minNumber = Integer.MAX_VALUE;
//        for (int currentNumber : integerArray) {
//            if (currentNumber <= minNumber) {
//                minNumber = currentNumber;
//            }
//        }
//        return minNumber;
//    }


}
