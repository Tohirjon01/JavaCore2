package Package2;

import java.util.Scanner;

public class FunSimple53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Month " + (i + 1)) ;
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            int days = MonthDays(month, year);
            System.out.println("Number of days in " + month + " " + year + ": " + days);
        }
    }

    public static boolean IsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int MonthDays(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                return IsLeapYear(year) ? 29 : 28;
            }
            default -> {
                return -1;
            }
        }
    }

}

