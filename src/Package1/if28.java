package Package1;

import java.util.Scanner;

public class if28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("366");
            } else if (year % 100 == 0) {
                System.out.println("365");
            }else{
                System.out.println("366 ");

            }

        }else {
            System.out.println("365");
        }
    }
}

