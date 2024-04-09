package Package2;

import java.util.Scanner;

public class FunSimple31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int countpalindrom = 0 ;
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i+1) + ": ");
            int n = scanner.nextInt();
            if (Number(n)){
                countpalindrom++;
            }

        }
        System.out.println("Number of palindromes entered : " + countpalindrom);

    }

    static boolean Number(int N) {
        int count =N;
        int sum = 0;
        while (N != 0){
            int b = N %10;
            sum = sum*10 + b;
            N /= 10;
        }
        return count == sum;
    }
}
