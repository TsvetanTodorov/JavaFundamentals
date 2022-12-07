package Methods.Exercise;


import java.math.BigInteger;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        BigInteger[] result = getTribonacciNumbers(number);
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static BigInteger[] getTribonacciNumbers(int number) {
        BigInteger[] result = new BigInteger[number];
        switch (number) {
            case 1:
                result[0] = BigInteger.valueOf(1);
                break;
            case 2:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                break;
            case 3:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                result[2] = BigInteger.valueOf(2);
                break;
            default:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                result[2] = BigInteger.valueOf(2);
                for (int i = 3; i < number; i++) {
                    BigInteger currNum = result[i - 3].add(result[i - 2]).add(result[i - 1]);
                    result[i] = currNum;
                }
                break;
        }
        return result;
    }
}
