package Package2;

import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three number ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(Ekub1(A, B, C));

    }


    public static int Ekub1(int a, int b, int c) {
        while (a != b) {
            if (a > b) {
                a -= b;

            } else if (a > c) {
                a -= c;
            } else if (b > a) {
                b -= a;
            } else if (b > c) {
                b -= c;
            } else if (c > a) {
                c -= a;
            } else if (c > b) {
                c -= b;
            }


        }
        return a;
    }
}

