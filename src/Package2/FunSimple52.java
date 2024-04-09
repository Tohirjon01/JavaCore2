package Package2;

import java.util.Scanner;

public class FunSimple52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter three number : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("year " + (i + 1) + ":");
            int year = scanner.nextInt();
            if (IsLeapYear(year)){
                count++;
            }
        }
        System.out.println("Number of leap years entered: " + count);
    }

    public static boolean IsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

