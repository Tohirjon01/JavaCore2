package Package2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FunSimple30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = scanner.nextInt();
        System.out.print("Enter your guessed number : ");
        int b = scanner.nextInt();
        System.out.println(DigitCount(a, b));


    }

    public static int DigitCount(int K, int N) {
        if (K > N) {
            return -1;
        } else if (K == N) {
            return 0;
        }
//        int count = 0;
//        while (K > 0) {
//            count ++ ;
//            K/=10;
//        }
return 0;
    }

}
