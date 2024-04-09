package Package2;

import java.util.Scanner;

public class FunSimple55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (in format Day Month Year): ");
        int day = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();


        System.out.println("The next date is : " + nextdate(day , month ,year));

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
                return -1;
        }
    }

    public static String nextdate(int day, String month, int year) {
        int dayMonth = MonthDays(month, year);

        if (day < 31 ) {
            return (day + 1) + month + year;
        } else {
            String nextMonth;
            int nextyear;
            int nextday = 0;
            if (month.equalsIgnoreCase("december") ) {
                nextday = 1;
                nextMonth = "january";
                nextyear = year + 1;


            } else {
                nextMonth =getnextmonth(month);
                nextyear = year;
            }
            int dayinnextmoth = MonthDays(nextMonth,nextyear);
            return dayinnextmoth + ":" + nextMonth + ":" + nextyear;

        }
    }

    public static String getnextmonth(String month) {
        switch (month.toLowerCase()) {
            case "january":
                return "february";
            case "february" :
                return "march";
            case "march" :
                return "april";
            case "may":
                return "june";
            case "june":
                return "july";
            case "july":
                return "august";
            case "august":
                return "september";
            case "september":
                return "october";
            case "october":
                return "november";
            case "november":
                return "december";
            default:
                return "invalid";
        }
    }
}
