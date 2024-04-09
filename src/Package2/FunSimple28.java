package Package2;

import java.util.Scanner;

public class FunSimple28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int countPrimes = 0;
        System.out.print("Enter a number: ");
        for (int i = 0; i < k; i++) {

            int number = scanner.nextInt();
            if (isPrime(number)) {
                countPrimes++;
            }
        }

        System.out.println("Number of prime numbers entered: " + countPrimes);
    }


    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        if (N <= 3) {
            return true;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= N; i += 6) { // this checked 6k +-1
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

