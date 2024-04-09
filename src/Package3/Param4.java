package Package3;

public class Param4 {
    public static void main(String[] args) {
        double[] A = {1, 3, 5, 7, 8};
        int N = A.length;
        invert(A,N);
        System.out.println("After progress : ");
        for (double element : A){
            System.out.println(element + " ");
        }


    }

    public static void invert(double[] A, int N) {
        for (int i = 0; i < N / 2; i++) {
            double count = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = count;

        }


    }
}
