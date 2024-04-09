package Package1;

import java.util.Scanner;

public class MinMax24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers ");
        int N = scanner.nextInt();
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;

        System.out.println("Enter " + N + "element");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > largest1) {
                largest1 = num;
            } else if (num >= largest2 && num != largest1) {
                largest2 = num;
            }
        }

        System.out.println("Firs largest element : " + largest1);
        System.out.println("Second largest element : " + largest2);

    }
}
