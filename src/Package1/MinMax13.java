package Package1;

import java.util.Scanner;

public class MinMax13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of numbers ");
        int N = scanner.nextInt();
        int largest = Integer.MIN_VALUE;
        int largestOrder = 0;

        System.out.println("Enter " + N + "element");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num%2 != 0 ) {
                largest = num;
                largestOrder = i;
            }
        }
        if (largestOrder != 0) {
            System.out.println("Largest odd  number is : " + largest + " order is : " + largestOrder);
        } else {
            System.out.println("");
        }
    }
}
