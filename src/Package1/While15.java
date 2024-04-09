package Package1;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount ");
        double amount = scanner.nextDouble();
        System.out.print("Percentage increase " );
        double percentage = scanner.nextDouble();

        double sum = amount * 2 ;
        int months = 0 ;
        while (amount < sum){
            amount += amount * percentage ;
            months ++;
        }
        System.out.println(months);
    }
}
