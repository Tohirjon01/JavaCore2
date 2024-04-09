package Package2;

import java.util.Scanner;

public class String57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word with extra space ");

        String word = scanner.nextLine();

        String deleteword = deleteextraspace(word);

        System.out.print("After trimmed");

        System.out.println(deleteword);
    }

    public static String deleteextraspace(String word) {

        String deletedword = word.trim();

        String removerword = deletedword.replaceAll("\\s+", " ");
        return removerword;
    }
}
