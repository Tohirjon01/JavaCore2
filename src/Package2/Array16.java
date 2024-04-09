package Package2;

import java.util.Scanner;

public class Array16 {

        public static void main(String[] args) {

            int[] array = {1 , 2 , 3 , 4 ,5};
            printArrayInPattern(array);
        }

        public static void printArrayInPattern(int[] array) {
            int n = array.length;
            int i = 0;
            int j = n - 1;

            while (i <= j) {
                System.out.print(array[i] + " ");
                if (i != j) {
                    System.out.print(array[j] + " ");
                }
                i++;
                j--;
            }

            if (n % 2 != 0) {
                System.out.print(array[n / 2]);
            }
        }
    }

