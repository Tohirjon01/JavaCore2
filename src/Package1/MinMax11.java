package Package1;

import java.util.Scanner;

public class MinMax11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of numbers : ");
        int N = scanner.nextInt();

        int lastsmallest = Integer.MAX_VALUE;
        int lastlargest = Integer.MIN_VALUE;
        int lastsmallestOrder = 0;
        int lastlargestOrder = 0;

        System.out.print("Enter " + N + " elements : ");
        for (int i = 1; i <= N; i++) {
            int num = scanner.nextInt();
            if (num <= lastsmallest) {
                lastsmallest = num;
                lastsmallestOrder = i;

            }
            if (num >= lastlargest) {
                lastlargest = num;
                lastlargestOrder = i;
            }
        }
        System.out.println(" Last Smallest element " + lastsmallest + " order " + lastsmallestOrder);
        System.out.println(" Last Largest element " + lastlargest + " order " + lastlargestOrder);

    }
}
