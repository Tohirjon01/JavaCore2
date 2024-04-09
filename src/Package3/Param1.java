package Package3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Param1 {
    public static void main(String[] args) {
        int[] A = {8, 90, 3, 4, 5};
        int N = A.length;
        int minelement = findelement(A, N);
        System.out.println("The smallest element is : " + minelement);

    }

    public static int findelement(int[] A, int N) {
        int minelement = A[0];
        for (int i = 0; i < N; i++) {
            if (A[i] < minelement) {
                minelement = A[i];
            }
        }
        return minelement;

    }
}
