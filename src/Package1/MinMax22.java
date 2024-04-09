package Package1;

import java.util.Scanner;

public class MinMax22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers ");
        int N = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int smallest1 = Integer.MAX_VALUE;

        System.out.println("Enter " + N + " element ");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num <= smallest){
                smallest = num;
            } else if (num <= smallest1 && num != smallest) {
                smallest1 = num;
            }
        }
        System.out.println("First smallest element is : " + smallest);
        System.out.println("Second smallest element is : " + smallest1);
    }
}
