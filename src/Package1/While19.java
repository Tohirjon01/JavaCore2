package Package1;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number ");
        int number = scanner.nextInt();

        int Count = 0;
        int sum = 0;
        int remain = Math.abs(number);

        while (remain > 0) {
            int digit = remain % 10;
            sum += digit;
            Count++;
            remain /= 10;
        }

        System.out.println("Number  " + Count);
        System.out.println("Sum : " + sum);
    }
}

