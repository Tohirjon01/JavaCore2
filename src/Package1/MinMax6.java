package Package1;

import java.util.Scanner;

public class MinMax6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int N = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int smallestOrder = 0;
        int largestOrder = 0;
        System.out.print("Enter " + N + " elements");
        for (int i = 1; i < N; i++) {
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
                smallestOrder = i;

            }
            if (num > largest) {
                largest = num;
                largestOrder = i;
            }

        }
        System.out.println(" Smallest element " + smallest + " order " + smallestOrder);
        System.out.println("Largest element " + largest + " order " + largestOrder);

    }
}
