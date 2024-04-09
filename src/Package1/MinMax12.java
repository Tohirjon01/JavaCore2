package Package1;

import java.util.Scanner;

public class MinMax12 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of numbers : ");

        int N = scanner.nextInt();
        int smallestpositive = Integer.MAX_VALUE;

        System.out.println("Enter " + N + " element");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > 0 && num < smallestpositive) {
                smallestpositive = num;
            }
        }
        if (smallestpositive == Integer.MAX_VALUE)
            smallestpositive = 0;
        System.out.println("First most smallest positive element : " + smallestpositive);
    }

}
