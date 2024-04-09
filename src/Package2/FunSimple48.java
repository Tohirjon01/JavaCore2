package Package2;

import java.util.Scanner;

public class FunSimple48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two number ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(count(A,B));
    }
    static int count(int a , int b){
                                                        //ekuk = a * b/ekub(a,b)
    int multiple = a * b;
    int ekubb = Ekub(a,b);
    int all = multiple/ekubb;
    return all;
    }

    static int Ekub(int a , int b){
       while (b != 0){
            int num = b;
            b = a %b;
            a = num;
       }
       return a;
    }
}


