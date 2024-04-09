package Package1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        out:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue out;
                }
            }
            System.out.print(i + ",");
        }
    }
}
