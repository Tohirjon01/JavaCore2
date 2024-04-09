package Package2;

import java.util.Scanner;

public class String41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of Uzbek words separated by spaces:");
        String word = scanner.nextLine();
        int cuttedword = countwords(word);
        System.out.println("Number of words this space : " + cuttedword);

    }
    public static int countwords(String word){
        String[] words = word.split("\\S+");
        return words.length;

    }
}
