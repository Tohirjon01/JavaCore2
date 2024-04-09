package Package1;

import java.util.Scanner;

public class Minmax4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the set: ");
        int n = scanner.nextInt();


        int[] set = new int[n];
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            set[i] = scanner.nextInt();
        }

        int smallest = set[0];
        int position = 0;
        for (int i = 1; i < n; i++) {
            if (set[i] < smallest) {
                smallest = set[i];
                position = i;
            }
        }
        System.out.println(smallest);
        System.out.println(position);
    }
}
