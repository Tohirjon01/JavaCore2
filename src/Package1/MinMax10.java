package Package1;

import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of natural numbers : ");
        int N = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        int smallestOrder = -1;
        int largestOrder = -1;
        System.out.println("Enter  " + N + " integers");
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

            if (smallestOrder != 0) {

                    System.out.println("First smallest element : " + smallest + " order " + smallestOrder);

            } else {
                System.out.println("No that kind of small element");
            }
            if (largestOrder != 0) {
                System.out.println("First largest element : " + largest + " order " + largestOrder);
            } else {
                System.out.println("No that kind of large element");
            }


    }
}
