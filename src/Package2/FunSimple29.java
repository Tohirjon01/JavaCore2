package Package2;

import java.util.Scanner;

public class FunSimple29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");

        int n = scanner.nextInt();
        System.out.println("numer of values : " + DigitCount(n));

    }

    public static int DigitCount(int K) {
        int count = 0;
        while (K > 0) {
            count ++ ;
            K/=10;
        }
        return count;

    }
}
