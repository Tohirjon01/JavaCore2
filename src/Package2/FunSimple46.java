package Package2;

import java.util.Scanner;

public class FunSimple46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 number : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(Ekub(A,B));
    }

    static int Ekub(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;

            } else {
                b -= a;
            }
        }
        return a;
    }
}
