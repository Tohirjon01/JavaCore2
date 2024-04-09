package Package2;

import java.util.Scanner;

public class FunSimple54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (in format Day Month Year): ");
        int day = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();

        String previousDate = prevDate(day, month, year);
        System.out.println("The previous date is: " + previousDate);
    }


    public static boolean IsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int MonthDays(String month, int year) {
        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return IsLeapYear(year) ? 29 : 28;
            default:
                return -1; // Invalid month
        }
    }

    public static String prevDate(int day, String month, int year) {
        int dayMonth = MonthDays(month, year);
        if (day > 1) {
            return (day - 1) + month + year;
        } else {
            String prevmonth;
            int prevyear;
            if (month.equalsIgnoreCase("January")) {
                prevmonth = "december";
                prevyear = year - 1;
            }else {
                prevmonth = getPreviousMonth(month);
                prevyear = year;
            }
            int dayinprevmonth = MonthDays(prevmonth,prevyear);
            return dayinprevmonth + ":" + prevmonth + ":" + prevyear;
        }

    }
    public static String getPreviousMonth(String month) {
        switch (month.toLowerCase()) {
            case "february":
                return "january";
            case "march":
                return "february";
            case "april":
                return "march";
            case "may":
                return "april";
            case "june":
                return "may";
            case "july":
                return "june";
            case "august":
                return "july";
            case "september":
                return "august";
            case "october":
                return "september";
            case "november":
                return "october";
            case "december":
                return "november";
            default:
                return "invalid";
        }
    }
}
