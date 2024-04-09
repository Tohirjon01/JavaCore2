package Package1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(ekub(A,B));

    }
    static int ekub (int a , int b){
        while (a!=b){
            if (a>b){
                a-=b;

            }else{
                b -= a;
            }
        }
        return a;
    }
}
