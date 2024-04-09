package Package1;

import java.util.Scanner;

public class Case9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day ");
        float day = scanner.nextFloat();
        System.out.print("Enter month ");
        float month = scanner.nextFloat();
        float nextday = 0, nextmoth = 0;

        if (day < 31 && month < 12) {
                nextday = day + 1;
                nextmoth = month;
            }
            if (day == 31 && month < 12) {
                nextday = 1;
                nextmoth = month;

            } else if (day < 31 && month == 12) {
                nextday = day + 1;
                nextmoth = 1;
            } else if (day == 31 && month == 12) {
                nextday = 1;
                nextmoth = 1;

        } else if (day >31 && month >12) {
                System.out.println("Bunday sana majud emas");

            } else if (day>31 && month<12) {
                System.out.println("Bunday sana mavjuda emas");

            }
        System.out.println(nextday + "." + nextmoth);

    }
}
